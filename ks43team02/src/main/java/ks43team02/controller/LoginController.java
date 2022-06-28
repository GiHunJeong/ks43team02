package ks43team02.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
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
				session.setAttribute("SEMAIL"		, superAdminId);
				session.setAttribute("SRANKNAME"	, admin.getCpRepresentative().getCpName());
				session.setAttribute("SNAME"		, admin.getCpRepresentative().getCpRepresentativemplyName());
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
				//사원
				session.setAttribute("SEMAIL"		, emplyId);
				if(emply.getRankLevelCode() == null) {
					session.setAttribute("SRANKNAME"	, "직급미입력");
					session.setAttribute("SPOSITION"	, "포지션없음");
					session.setAttribute("SNAME"		, emply.getEmplyName());
					return "redirect:/";
				}
				session.setAttribute("SRANKNAME"	, emply.getRankLevelList().getRankName());
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
