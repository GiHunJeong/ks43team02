package ks43team02.controller;

import java.util.List;

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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ks43team02.dto.Emply;
import ks43team02.dto.OrganizationLList;
import ks43team02.dto.OrganizationMList;
import ks43team02.dto.OrganizationSList;
import ks43team02.service.EmplyService;

@Controller
@RequestMapping("/member")
public class EmplyController {
	
	private static final Logger log = LoggerFactory.getLogger(EmplyController.class);
	
	private final EmplyService emplyService;
	
	public EmplyController(EmplyService emplyService) {
		this.emplyService = emplyService;
	}
	//조직도 소분류
	@GetMapping("/organizationSName")
	@ResponseBody
	public List<OrganizationSList> getOrganiSListByCode(Model model
													   ,@RequestParam(name="organiM", required=false) String organiM) {
		log.info("organiM 의 값 {}", organiM);
		List<OrganizationSList> organiSName = emplyService.getOrganiSListByCode(organiM);
		log.info("OrganizationSList 값 {}", organiSName);
		return organiSName;
	}
	//조직도 중분류
	@GetMapping("/organizationMName")
	@ResponseBody
	public List<OrganizationMList> organizationMName(@RequestParam(name="organiL", required=false) String organiL) {
		log.info("organiL 의 값 {}", organiL);
		List<OrganizationMList> organiMName = emplyService.getOrganiMListByCode(organiL);
		log.info("OrganizationMList 값 {}", organiMName);
		return organiMName;
	}
	//조직도 대분류
	//개인정보수정
	@PostMapping("/emply_modify_my")
	public String emplyModify(Emply emply
							 ,RedirectAttributes attr) {
		log.info("수정화면에서 입력받은 emply : {}", emply);
		log.info("수정화면에서 입력받은 emplyId : {}",emply.getEmplyId());
		emplyService.modifyEmply(emply);
		attr.addAttribute("emplyId", emply.getEmplyId());

		return "redirect:/member/emply_modify_my";
	}
	//개인정보수정 페이지 이동
	@GetMapping("/emply_modify_my")
	public String emplyModifyMy(@RequestParam(name="emplyId", required = false) String emplyId
			   				   ,Model model) {
		log.info("화면에서 입력받은 emplyId: {}", emplyId);
		Emply emply = emplyService.getEmplyInfoById(emplyId);
		
		model.addAttribute("emply", emply);
		return "member/emply_modify_my";
	}
	//회원전체조회
	@GetMapping("/emply_list")
	public String getEmplyInfoList(Model model) {
		List<Emply> emplyInfoList = emplyService.getEmplyInfoList();
		model.addAttribute("emplyInfoList", emplyInfoList);
		
		return "member/emply_list";
	}	
	//아이디중복체크
	@PostMapping("/emailCheck")
	@ResponseBody
	public boolean emailCheck(@RequestParam(name="emplyId", required=false) String emplyId) {
		log.info("이메일 중복 체크 : {}", emplyId);
		
		// true : 아이디 중복 x, false : 아이디 중복 o
		
		Emply emply = emplyService.getEmplyInfoById(emplyId);

		boolean isEmailCheck = true;
		if((emply != null)) {		
				isEmailCheck = false;			
		}
		return isEmailCheck;
	}
	//회원가입
	@PostMapping("/register")
	public String register(Emply emply
						  ,@RequestParam(name="emplyId", required = false) String emplyId) {
		emply.setCpName("한국스마트정보교육원");
		emply.setSuperAdminId("ksmart43id@ksmart.or.kr");
		emply.setCpRepresentativeCode("cp_representative_code_01");
		emply.setRankLevelCode("rank_level_code_01");
		emply.setPositionLevelCode("position_level_code_01");
		log.info("회원가입화면에서 입력한 emply data : {}", emply);
		log.info("회원가입화면에서 입력한 userId : {}", emplyId);
		emplyService.addEmply(emply);
		
		return "redirect:/";
	}
	//회원가입이동
	@GetMapping("/register")
	public String organiLList(Model model) {
		List<OrganizationLList> organiLList = emplyService.getOrganiLList();
		model.addAttribute("organiLList", organiLList);
		
		return "member/register";
	}
}
