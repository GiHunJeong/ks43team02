package ks43team02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PayController{
	
	@GetMapping("/pay/paySetting")
	public String paySetting() {
		return "pay/paySetting";
	};
	
	@GetMapping("/pay/payAdd")
	public String payAdd() {
		return "pay/payAdd";
	};
}

