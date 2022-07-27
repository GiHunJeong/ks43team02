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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ks43team02.dto.AnnualApplication;
import ks43team02.dto.AnnualSetting;
import ks43team02.dto.CateAnnual;
import ks43team02.dto.Emply;
import ks43team02.service.AnnualService;
import ks43team02.service.AnnualSettingService;
import ks43team02.service.EmplyService;

@Controller
@RequestMapping("/annual")
public class AnnualController {
	//로거	
	private static final Logger log = LoggerFactory.getLogger(AnnualController.class);
	/*
	 * 의존성주입
	 */	
	private final AnnualService annualService;
	
	public AnnualController(AnnualService annualService) {
		this.annualService = annualService;
	};

	//연차등록(Post)
	@PostMapping("/annual_application")
	@ResponseBody
	public String annual_application(AnnualApplication annualApplication
									,HttpSession session) {
		String emplyId = (String) session.getAttribute("SEMAIL");
		log.info("연차등록 form에서 입력받은 data : {}", annualApplication);
		Emply emply = annualService.getEmplyInfoByEmail(emplyId);
		
		annualApplication.setEmplyId(emplyId);
		//여기
		annualApplication.setCpRepresentativeCode(emply.getCpRepresentativeCode());
		annualApplication.setSuperAdminId(emply.getSuperAdminId());
		
		annualService.addAnnualApplication(annualApplication);
		return "/annual/annual_list";
	}

	//연차등록(Get)
	@GetMapping("/annual_application")
	public String annualApplication(Model model
								  , HttpSession session) {
		String emplyId = (String) session.getAttribute("SEMAIL");
		Emply emply = annualService.getEmplyInfoByEmail(emplyId);
		
		List<AnnualApplication> annualApplication = annualService.getAnnualApplication();
		//여기
		List<CateAnnual> cateAnnualList = annualService.getAnnualCateList(emply.getCpRepresentativeCode());
		
		model.addAttribute("annualApplication", annualApplication);
		//여기
		model.addAttribute("cateAnnualList", cateAnnualList);
		
		log.info("annualApplication 값 : {}",annualApplication);
		//여기
		log.info("cateAnnualList 값 : {}",cateAnnualList);
		
		return "annual/annual_application";
	}
	
	//연차 신청 목록 리스트(Get) - 로그인 사원
	@GetMapping("/annual_list")
	public String getAnnualList(Model model){
		
		List<AnnualApplication> annualApplication = annualService.getAnnualList();
		model.addAttribute("annualApplication",annualApplication);
		log.info("annualList 값 : {}",annualApplication);
		
		return "annual/annual_list";
	}
	
	//연차카테
/*	@GetMapping("/annual_application")
	public String getAnnualList(Model model, @RequestParam(name="cateAnnualCode", required = false) String cateAnnualCode) {
		
		
		List<AnnualApplication> annualApplication = annualService.getAnnualList();
		List<CateAnnual> cateAnnual = annualService.getAnnualCateList(cateAnnualCode);
		
		log.info("AnnualApplication : {}", annualApplication);
		log.info("cateAnnual : {}", cateAnnualCode);
		
		model.addAttribute("AnnualApplication : {}", annualApplication);
		model.addAttribute("list : {}", cateAnnual);
		
		return "annual/annual_application"; 
	}
*/

	//로그인한 사원 연차등록 리스트 보여주기
/*	@GetMapping("/annual_list")
	public String AnnualListLogin(Model model
						   , HttpSession Session) {
		
		String emplyId = (String) Session.getAttribute("SEMAIL");
		List<AnnualApplication> annualListLogin = annualService.getAnnualListLogin(emplyId);
		model.addAttribute("annualListLogin", annualListLogin);
		log.info("annualListLogin : {}", annualListLogin);
		
		return "annual/annual_list"; 
	}
*/
	


}
