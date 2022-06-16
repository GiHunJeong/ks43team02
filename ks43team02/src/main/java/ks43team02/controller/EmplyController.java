package ks43team02.controller;

import java.util.List;

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

@Controller
@RequestMapping("/member")
public class EmplyController {
	
	private static final Logger log = LoggerFactory.getLogger(EmplyController.class);
	
	private final EmplyService emplyService;
	
	public EmplyController(EmplyService emplyService) {
		this.emplyService = emplyService;
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
		boolean isEmailCheck = true;
		
		Emply emply = emplyService.getEmplyInfoById(emplyId);
		
		if(emply != null) {
			isEmailCheck = false;
		}
		
		return isEmailCheck;
	}
	//회원가입
	@PostMapping("/register")
	public String register(Emply emply
						  ,@RequestParam(name="emplyId", required = false) String emplyId) {
		log.info("회원가입화면에서 입력한 emply data : {}", emply);
		log.info("회원가입화면에서 입력한 userId : {}", emplyId);
		emply.setRankLevelCode("rank_level_code_01");
		emply.setPositionLevelCode("position_level_code_01");
		emplyService.addEmply(emply);
		
		return "redirect:/";
	}
	//회원가입이동
	@GetMapping("/register")
	public String register() {
		return "member/register";
	}
}
