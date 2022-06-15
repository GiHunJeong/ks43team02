package ks43team02.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks43team02.dto.Emply;
import ks43team02.service.EmplyService;

@Controller
public class LoginController {
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
	public String login(@RequestParam(name="userEmail", required = false) String userEmail
					   ,@RequestParam(name="userPw", required = false) String userPw
					   ,HttpSession session) {
		
		Emply emply = emplyService.getEmplyInfoById(userEmail);
		
		if(emply != null) {
			String 
				userPwCheck = emply.getUserPw();
			if(userPw != null && userPw.equals(userPwCheck)) {
				session.setAttribute("SEMAIL"	, userEmail);
				session.setAttribute("SLEVEL"	, emply.getUserLvl());
				session.setAttribute("SNAME"	, emply.getUserName());
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
