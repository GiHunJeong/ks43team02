package ks43team02.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks43team02.dto.Admin;
import ks43team02.dto.Emply;
import ks43team02.dto.RankLevelList;
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
	//어드민 로그인
	@PostMapping("/login/admin_login")
	public String adminLogin(@RequestParam(name="superAdminId", required = false) String superAdminId
							,@RequestParam(name="superAdminPw", required = false) String superAdminPw
				   		    ,HttpSession session) {
		log.info("어드민이메일 : {}", superAdminId);
		log.info("어드민비밀번호 : {}", superAdminPw);
		
		Admin admin = emplyService.getAdminInfo(superAdminId);
		
		if(admin != null) {
			String
				superAdminPwCheck = admin.getSuperAdminPw();
			if(superAdminPw != null && superAdminPw.equals(superAdminPwCheck)) {
				//어드민
				session.setAttribute("SAEMAIL"		, superAdminId);
				session.setAttribute("SARANKNAME"	, admin.getCpRepresentative().getCpName());
				session.setAttribute("SANAME"		, admin.getCpRepresentative().getCpRepresentativemplyName());
				return "redirect:/";
			}
		}
		return "login/admin_login";
		
	}
	//어드민 로그인
	@GetMapping("/login/admin_login")
	public String adminLogin() {
		return "login/admin_login";
	}
	
	//사원 로그인
	@PostMapping("/login/login")
	public String login(@RequestParam(name="emplyId", required = false) String emplyId
					   ,@RequestParam(name="emplyPw", required = false) String emplyPw
					   ,HttpSession session
					   ,Model model) {
		log.info("이메일 : {}", emplyId);
		log.info("사원비밀번호 : {}", emplyPw);
		
		Emply emply = emplyService.getEmplyInfoById(emplyId);
		String loginMsg = "";
		
		if(emply != null) {
			String 
				emplyPwCheck = emply.getEmplyPw();
			if(emplyPw != null && emplyPw.equals(emplyPwCheck)) {
				//사원
				loginMsg = "로그인에 성공하셨습니다.";
				model.addAttribute("loginSuccessMsg", loginMsg);
				session.setAttribute("SEMAIL"		, emplyId);
				session.setAttribute("SRANKNAME"	, emply.getRankLevelList().getRankName());
				session.setAttribute("SPOSITION"	, emply.getPositionLevelCode());
				session.setAttribute("SNAME"		, emply.getEmplyName());
				return "redirect:/";
			}else{
				loginMsg = "비밀밀번호가 틀렸습니다.";
				model.addAttribute("loginFailedMsgPw", loginMsg);
				return "login/login";
			}
		}else {
			loginMsg = "아이디가 틀렸거나 존재하지 않습니다.";
			model.addAttribute("loginFailedMsgId", loginMsg);
			return "login/login";
		}
	}
	//로그인 화면 이동
	@GetMapping("/login/login")
	public String login() {
		return "login/login";
	}
}
