package ks43team02.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RequestParam;

import ks43team02.dto.AnnualStandard;
import ks43team02.dto.AnnualApplication;
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
	
	// 연차등록
	/*
	 * @GetMapping("/annualList") public String annualApplication(Model model) {
	 * List<AnnualApplication> annualApplication =
	 * annualService.getAnnualApplication();
	 * 
	 * model.addAttribute("annualApplication", annualApplication);
	 * log.info("내용확인1",annualApplication); return "annual/annualList"; }
	 */
	
	/*
	@PostMapping("/annualList")
		public String annualList(AnnualApplication annualApplication
								, HttpSession session
								, HttpServletRequest request) {
		
		return "annualList";
	}		
	*/
	/*
	@GetMapping("/annualList")
		public String annualList(Model model
									,@RequestParam(name="annualStandardCode", required = false)String annualStandardCode) {
		//List<AnnualList> annualList = annualService.getAnnualList();
		List<Annual> annualList = annualService.getAnnualList();
		// List<Annual> list = new ArrayList<Annual>(); 
		
		model.addAttribute("annualList", annualList);
		log.info("내용확인2", annualList);
		log.info("확인" , annualStandardCode);
		return "annual/annualList";
	}
	*/
	// 연차 등록
	@GetMapping("/annual_application")
	public String getAnnualApplication(Model model) {
		List<AnnualApplication> annualApplication = annualService.getAnnualApplication();
		log.info(">>>>>>>{}", annualApplication);
		model.addAttribute("annualApplication", annualApplication);

		return "annual/annual_application";
	}
	
	// 연차 리스트
	@GetMapping("/annual_list")
	public String getAnnualList() {
		return "annual/annual_list";
	}
	// 연차세팅
	@GetMapping("/annual_setting")
		public String annualSetting() {
		return "annual/annual_setting";
	};
	
	// 연차 카테고리 
	/*
	  @GetMapping("/annualList") 
	  public String getCateAnnual(Model model) {
		  List<CateAnnual> cateAnnual = annualService.getCateAnnual(); 
		  log.info("{}",cateAnnual); model.addAttribute("cateAnnual", cateAnnual);
	  
		  return "annual/annualList"; 
	  }
	 */
	 
	/*
	@GetMapping("/annualList")
		public String AnnualCate() {
		return "annual/annualSetting";
	}
	*/
}
