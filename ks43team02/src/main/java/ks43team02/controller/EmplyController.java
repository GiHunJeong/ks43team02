package ks43team02.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
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
	
	@PostMapping("/emailCheck")
	@ResponseBody
	public boolean emailCheck(@RequestParam(name="userEmail", required=false) String userEmail) {
		log.info("이메일 중복 체크 : {}", userEmail);
		
		// true : 아이디 중복 x, false : 아이디 중복 o
		boolean isEmailCheck = true;
		
		Emply emply = emplyService.getEmplyInfoById(userEmail);
		
		if(emply != null) {
			isEmailCheck = false;
		}
		
		return isEmailCheck;
	}
	
	@PostMapping("/register")
	public String register(Emply emply
						  ,@RequestParam(name="userEmail", required = false) String userEmail) {
		log.info("회원가입화면에서 입력한 emply data : {}", emply);
		log.info("회원가입화면에서 입력한 userId : {}", userEmail);
		emply.setUserLvl(10);
		emplyService.addEmply(emply);
		
		return "redirect:/";
	}
	
	@GetMapping("/register")
	public String register() {
		return "member/register";
	}
}
