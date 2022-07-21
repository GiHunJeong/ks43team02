package ks43team02.controller;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	 * 결재가 선택 리스트
	 */
	@PostMapping("/payment_approver_list")
	@ResponseBody
	public List<Emply> paymentApproverList() {
		List<Emply> emplyInfoList =  emplyService.getEmplyInfoList();
		return emplyInfoList;
	}
	/*
	 * 결제요청 페이지
	 */
	@GetMapping("/payment_request")
	public String paymentRequest() {
		return "payment/payment_request";
	}
	/*
	 * 결제관리 페이지
	 */
	@GetMapping("/payments")
	public String payment() {
		return "payment/payments";
	}
}
