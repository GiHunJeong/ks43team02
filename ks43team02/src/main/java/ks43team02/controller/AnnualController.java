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

import ks43team02.dto.AnnualApplication;
import ks43team02.dto.AnnualList;
import ks43team02.dto.Emply;
import ks43team02.service.AnnualService;
import ks43team02.service.EmplyService;

@Controller
@RequestMapping("/annual")
public class AnnualController {
	
	private static final Logger log = LoggerFactory.getLogger(AnnualController.class);
	
	private final AnnualService annualService;
	private final EmplyService emplyService;
	
	public AnnualController(AnnualService annualService, EmplyService emplyService) {
		this.annualService = annualService;
		this.emplyService = emplyService;
	};
	
	//연차등록(Post)
	@PostMapping("/annual_application")
	@ResponseBody
	public String annual_application(AnnualApplication annualApplication
									,HttpSession session) {
		String emplyId = (String) session.getAttribute("SEMAIL");
		Emply emply = emplyService.getEmplyInfoById(emplyId);
		
		annualApplication.setAnnualApplicationCode("annual_application_code");
		annualApplication.setCpRepresentativeCode("cp_representative_code_01");
		annualApplication.setSuperAdminId("ksmart43id@ksmart.or.kr");
		annualApplication.setEmplyId(emplyId);
		annualApplication.setEmplyName(emply.getEmplyName());
		annualApplication.setAttachFileName("file");
		annualApplication.setGroupCode("group_code_01");
		log.info("연차등록 form에서 입력한 data : {}", annualApplication);
		//log.info("연차등록 form ajax : {}", annuApp);
		//연차등록 insert
		//annualService.addAnnualApplication(annualApplication);
		
		return "/annual/annual_list";
		}		
	
	
	//연차등록(Get)
	@GetMapping("/annual_application")
	public String annualApplication(Model model) {
				
		List<AnnualApplication> annualApplication = annualService.getAnnualApplication();
		model.addAttribute("annualApplication", annualApplication);
		return "annual/annual_application";
	}
/*
	public String annualApplication(Model model
									, AnnualApplication annualApplication) {
		model.addAttribute("annualApplication", annualApplication);
		log.info("연차등록 >>{}", annualApplication);
		List<AnnualApplication> annuApp = annualService.getAnnualApplication();
		model.addAttribute("annuApp", annuApp);
		log.info("연차등록 입력항목 >>{}", annuApp);
		return "annual/annual_application";
	}
*/
	
			
/*	
	public String annualList() {

		return "annual/annual_list";
	}
	*/
	
	// 연차 신청 리스트(Get)
	@GetMapping("/annual_list")
	public String AnnualList(Model model) {
		
		
		List<AnnualList> annualList = annualService.getAnnualList();
		model.addAttribute("annualList", annualList);
		log.info("annualList : {}", annualList);
		
		return "annual/annual_list"; 
	}
	
	/*
	public String AnnualApplication() {
		List<AnnualApplication> annualApplication = annualService.getAnnualApplication();
		log.info(">>{}", annualApplication);
		return "annual/annual_list";
	}
	*/
	
	
	//연차 카테고리 
	@GetMapping("/annualList")
	public String AnnualCate() {
		return "annual/annualSetting";
	}
	
	//연차세팅
	@GetMapping("/annual_setting")
		public String annualSetting() {
		return "annual/annual_setting";
	};
	
	
}
