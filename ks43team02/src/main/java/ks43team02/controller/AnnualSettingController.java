package ks43team02.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks43team02.dto.AnnualSetting;
import ks43team02.dto.CateAnnual;
import ks43team02.service.AnnualSettingService;

@Controller
@RequestMapping("/annual")
public class AnnualSettingController {
	
	private static final Logger log = LoggerFactory.getLogger(AnnualSettingController.class);
	
	private final AnnualSettingService annualSettingService;
	
	public AnnualSettingController(AnnualSettingService annualSettingService) {
		this.annualSettingService = annualSettingService;
	};
	
	
	//AnnualSetting
	/*@GetMapping("/annual_setting")
	public String getAnnualApplication(Model model
						   , HttpSession Session) {
		String emplyId = (String) Session.getAttribute("SEMAIL");
		
		List<AnnualSetting> annualSetting = annualSettingService.getAnnualApplication(emplyId);
		model.addAttribute("annualSetting : {}", annualSetting);
		log.info("annualSetting : {}", annualSetting);
		
		return "annual/annual_setting"; 
	}*/
	
	//휴가유형관리(CateAnnual) 리스트
	@GetMapping("/annual_setting")
	public String cateAnnualSet(Model model) {
		
		List<CateAnnual> cateAnnual = annualSettingService.getCateAnnualListSetting();
		model.addAttribute("cateAnnual", cateAnnual);
		log.info("cateAnnual의 값 : {}", cateAnnual);
		
		return "annual/annual_setting"; 
	}

}
