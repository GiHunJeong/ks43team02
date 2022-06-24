package ks43team02.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks43team02.dto.Annual;
import ks43team02.service.AnnualService;

@Controller
@RequestMapping("/annual")
public class AnnualController {
	
	private static final Logger log = LoggerFactory.getLogger(AnnualController.class);
	
	private final AnnualService annualService;
	
	public AnnualController(AnnualService annualService) {
		this.annualService = annualService;
	}
	
	// 연차등록
	@GetMapping("/annualList")
		public String annualList(Model model) {

		List<Annual> annualList = annualService.getAnnualList();
		
		model.addAttribute("annual", annualList);
		log.info("내용확인", annualList);
		return "annual/annualList";
	}
	
	// 연차세팅
	@GetMapping("/annualSetting")
		public String annualSetting() {
		return "annual/annualSetting";
	}
}
