package ks43team02.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks43team02.dto.DeductionList;
import ks43team02.dto.FixedAllowanceList;
import ks43team02.dto.PaySet;
import ks43team02.service.PayService;

@Controller
@RequestMapping("/pay")
public class PayController {

	private final PayService payService;

	public PayController(PayService payService) {
		this.payService = payService;
	}
	
	// 급여세팅페이지(현재 세팅값 확인)
	@GetMapping("/paySetting")
	public String paySetting() {
		return "pay/paySetting";
	};
	
	
	@GetMapping("/addPaySet")
	public String addPaySet() {
		return "pay/addPaySet";
	};
	
	// 사원 급여 등록페이지
	@GetMapping("/payAdd")
	public String payAdd() {
		return "pay/payAdd";
	};
	
	// 고정지급금 ajax
	@RequestMapping(value = "/fixedSetting")
	@ResponseBody 
	public List<FixedAllowanceList> getFixedAllowList() { 
		List<FixedAllowanceList> fixedAllowanceList = payService.getFixedAllowList();
		
		return fixedAllowanceList; 
	};
	  
	// 공제액 ajax
	@RequestMapping(value = "/deductionSetting")
	@ResponseBody 
	public List<DeductionList> getDeductionList() { 
		List<DeductionList> deductionList = payService.getDeductionList(); 
		
		return deductionList; 
	};
	  
	// 급여 기본값 세팅 
	 
}
