package ks43team02.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks43team02.dto.AnnualStandard;
import ks43team02.dto.AnnualApplication;
import ks43team02.dto.AnnualList;
import ks43team02.dto.CateAnnual;
import ks43team02.service.AnnualService;
 
@Controller
@RequestMapping("/annual")
public class AnnualController {
	
	private static final Logger log = LoggerFactory.getLogger(AnnualController.class);
	
	private final AnnualService annualService;
	
	public AnnualController(AnnualService annualService) {
		this.annualService = annualService;
	};
	
	//연차등록(Post)
	@PostMapping("/annual_application")
	@ResponseBody
	public String annual_application(AnnualApplication annualApplication
										,@RequestParam(name = "annualApplication", required = false) String annuApp) {
		
		
		 
		log.info("연차등록 form ajax >>{}", annualApplication);
		//annualService.addAnnualApplication(aApp);
		
		return "/annual/annual_list";
		}		
	
	
	//연차등록(Get)
	@GetMapping("/annual_application")

	public String annualApplication(Model model
									, AnnualApplication annualApplication) {
		model.addAttribute("annualApplication", annualApplication);
		log.info("연차등록 >>{}", annualApplication);
		List<AnnualApplication> annuApp = annualService.getAnnualApplication();
		model.addAttribute("annuApp", annuApp);
		log.info("연차등록 항목 >>{}", annuApp);
		return "annual/annual_application";
	}
	
			
	// 연차 신청 리스트(Get)
	@GetMapping("/annual_list")
	
	public String annualList() {
		return "annual/annual_list";
	}
	
	public String AnnualList(Model model) {
		List<AnnualList> annualList = annualService.getAnnualList();
		model.addAttribute("annualList", annualList);
		log.info(">>>>{}", annualList);
		return "annual/annual_list"; 
	}
	
	// 연차 카테고리 
	@GetMapping("/annualList")
	public String AnnualCate() {
		return "annual/annualSetting";
	}
	
	// 연차세팅
	@GetMapping("/annual_setting")
		public String annualSetting() {
		return "annual/annual_setting";
	};
	
	
}
