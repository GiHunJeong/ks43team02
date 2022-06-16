package ks43team02.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks43team02.dto.Emply;
import ks43team02.service.EmplyService;

@Controller
public class LoginController {
	//로그
	private static final Logger log = LoggerFactory.getLogger(EmplyController.class);
	//약결합
	private final EmplyService emplyService;
	
	public LoginController(EmplyService emplyService) {
		this.emplyService = emplyService;
	}
	//로그아웃 세션 초기화
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:/";
	}
	
	//회원 상세정보 조회
	@PostMapping("/login/login")
	public String login(@RequestParam(name="emplyId", required = false) String emplyId
					   ,@RequestParam(name="emplyPw", required = false) String emplyPw
					   ,HttpSession session) {
		log.info("이메일 : {}", emplyId);
		log.info("사원비밀번호 : {}", emplyPw);
		
		Emply emply = emplyService.getEmplyInfoById(emplyId);
		
		if(emply != null) {
			String 
				emplyPwCheck = emply.getEmplyPw();
			if(emplyPw != null && emplyPw.equals(emplyPwCheck)) {
				session.setAttribute("SEMAIL"		, emplyId);
				session.setAttribute("SRANK"		, emply.getRankLevelCode());
				session.setAttribute("SPOSITION"	, emply.getPositionLevelCode());
				session.setAttribute("SNAME"		, emply.getEmplyName());
				return "redirect:/";
			}
		}
		return "login/login";
	}
	//로그인 화면 이동
	@GetMapping("/login/login")
	public String login() {
		return "login/login";
	}
}
