package ks43team02.controller;

import java.util.*;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks43team02.dto.ApprovalProgress;
import ks43team02.dto.ApprovalRequest;
import ks43team02.dto.DocumentCateS;
import ks43team02.dto.Emply;
import ks43team02.service.EmplyService;
import ks43team02.service.PaymentService;

@Controller
@RequestMapping("/payment")
public class PaymentController {
	/*
	 * 의존성 주입
	 */
	private static final Logger log = LoggerFactory.getLogger(PaymentController.class);
	
	private final EmplyService emplyService;
	private final PaymentService paymentService;
	
	public PaymentController(EmplyService emplyService
							,PaymentService paymentService) {
		this.emplyService = emplyService;
		this.paymentService = paymentService;
	}
	/*
	 * 결재 승인
	 */
	@PostMapping("/request_agree")
	public String requestAgree(Model model,
							   @RequestParam(name="approvalProgressCode", required=false) String approvalProgressCode,
							   @RequestParam(name="approvalRequestCode", required=false) String approvalRequestCode,
							   @RequestParam(name="approverId", required=false) String approverId,
							   @RequestParam(name="currentApprovalStep", required=false) String currentApprovalStep,
							   @RequestParam(name="approvalProgressStep", required=false) String approvalProgressStep,
							   @RequestParam(name="totalApprovalStep", required=false) String totalApprovalStep) {
		log.info("승인에 의해 담기는 approvalProgressCode의 값 : {}", approvalProgressCode);
		log.info("승인에 의해 담기는 approvalRequestCode의 값 : {}", approvalRequestCode);
		log.info("승인에 의해 담기는 approverId의 값 : {}", approverId);
		List<ApprovalProgress> progressByRequestCode = paymentService.getProgressByRequestCode(approvalRequestCode);
		model.addAttribute("progressByRequestCode",progressByRequestCode);
		System.out.println("너의 사이즈는 : "+progressByRequestCode.size());
		for(int i = 0 ; i < progressByRequestCode.size();i++) {	
			System.out.println(i+"번째 요청 코드에 해당하는 결재자의 정보 : "+progressByRequestCode.get(i).getApproverId());
		}
		return "redirect:/payment/payments";
	}
	/*
	 * 결재 상세보기 결재자 정보
	 */
	@PostMapping("/request_manage_detail_agree_info")
	@ResponseBody
	public List<ApprovalProgress> requestManageDetailAgreeInfo(@RequestParam(name="approvalRequestCode", required=false) String approvalRequestCode) {
		log.info("approvalRequestCode에 담기는 값 : {}",approvalRequestCode);
		List<ApprovalProgress> progressByRequestCode = paymentService.getProgressByRequestCode(approvalRequestCode);
		log.info("progressByRequestCode에 담기는 값 : {}",progressByRequestCode);
		return progressByRequestCode;
	}
	/*
	 * 결재 관리 상세보기
	 */
	@PostMapping("/request_manage_detail")
	@ResponseBody         
	public ApprovalProgress requestManageDetail(@RequestParam(name="approvalProgressCode", required=false) String approvalProgressCode) {
		log.info("approvalProgressCode에 담기는 값 : {}",approvalProgressCode);
		ApprovalProgress requestManageByCode = paymentService.getRequestManageByCode(approvalProgressCode);
		log.info("requestManageByCode에 담기는 값 : {}",requestManageByCode);
		return requestManageByCode;
	}
	/*
	 * 결재 요청
	 */
	@PostMapping("/payment_request")
	public String paymentRequestAndProgress(Model model,
											ApprovalProgress approvalProgress,
											ApprovalRequest approvalRequest,
											@RequestParam(name="emplyName", required=false) String emplyName,
											@RequestParam(name="emplyId", required=false) String emplyId,
											@RequestParam(name="approverName", required=false) String approverName,
											@RequestParam(name="approverId", required=false) String approverId) {
		log.info("emplyName에 담기는 값:{}",emplyName);
		log.info("emplyId에 담기는 값:{}",emplyId);
		log.info("approverName에 담기는 값:{}",approverName);
		log.info("approverId에 담기는 값:{}",approverId);
		String[] arrApproverName = approverName.split(",");
		String[] arrApproverId = approverId.split(",");
		//ApprovalRequest 결재 요정부분
		approvalRequest.setCpRepresentativeCode("cp_representative_code_01");
		approvalRequest.setSuperAdminId("ksmart43id@ksmart.or.kr");
		approvalRequest.setApprovalProgressStep(0);
		approvalRequest.setTotalApprovalStep(arrApproverName.length);
		approvalRequest.setApprovalProgressStatus("요청중");
		paymentService.addPaymentRequest(approvalRequest);
		System.out.println("insert시 가져오는 approvalRequestCode 값 : "+approvalRequest.getApprovalRequestCode());
		log.info("approvalRequest에 담기는 값:{}",approvalRequest);
		//ApprovalRequest 결재 요정부분
		//ApprovalProgress 결재 진행부분
		for(int i = 0; i< arrApproverName.length;i++) {
			System.out.println("arrApproverName["+i+"] = "+arrApproverName[i]);
			System.out.println("arrApproverId["+i+"] = "+arrApproverId[i]);
			approvalProgress.setCpRepresentativeCode("cp_representative_code_01");
			approvalProgress.setSuperAdminId("ksmart43id@ksmart.or.kr");
			approvalProgress.setReturnStatus("N");
			approvalProgress.setApproverId(arrApproverId[i]);
			approvalProgress.setCurrentApprovalStep(0);
			approvalProgress.setApprovalRequestCode(approvalRequest.getApprovalRequestCode());
			paymentService.addPaymentProgress(approvalProgress);
			log.info("approvalProgress에 담기는 값:{}",approvalProgress);
		}
		//ApprovalProgress 결재 진행부분
		return "redirect:/payment/payment_request";
	}
	/*
	 * 결재자 선택 리스트
	 */
	@PostMapping("/payment_approver_list")
	@ResponseBody
	public List<Emply> paymentApproverList() {
		List<Emply> emplyInfoList =  emplyService.getEmplyInfoList();
		return emplyInfoList;
	}
	/*
	 * 결재요청 페이지
	 */
	@GetMapping("/payment_request")
	public String paymentRequest(Model model) {
		List<DocumentCateS> documentCateSList = paymentService.getDocumentCateSList();
		model.addAttribute("documentCateSList", documentCateSList);
		log.info("documentCateSList에 담기는 값 : {}",documentCateSList);
		return "payment/payment_request";
	}
	/*
	 * 결재관리 페이지
	 */
	@GetMapping("/payments")
	public String payment(HttpSession session,
						  Model model) {
		String approverId = (String) session.getAttribute("SEMAIL");
		List<ApprovalProgress> requestManage = paymentService.getRequestManageByApproverId(approverId);
		for(int i =0 ;i<requestManage.size();i++) {
			System.out.println(i+"번째 인덱스의 토탈 결재 부분 : "+requestManage.get(i).getApprovalRequest().getTotalApprovalStep());
			if(requestManage.get(i).getCurrentApprovalStep() == 0) {
				requestManage.get(i).getApprovalRequest().setApprovalProgressStatus("요청중");
			}else if(requestManage.get(i).getCurrentApprovalStep() > 0 && requestManage.get(i).getCurrentApprovalStep() < requestManage.get(i).getApprovalRequest().getTotalApprovalStep()) {
				requestManage.get(i).getApprovalRequest().setApprovalProgressStatus("진행중");
			}else if(requestManage.get(i).getCurrentApprovalStep() == requestManage.get(i).getApprovalRequest().getTotalApprovalStep()) {
				requestManage.get(i).getApprovalRequest().setApprovalProgressStatus("결재완료");
			}
		}
		model.addAttribute("requestManage", requestManage);
		log.info("requestManageByApproverId에 담기는 값 : {}", requestManage);
		return "payment/payments";
	}
}
