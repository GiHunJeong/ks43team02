package ks43team02.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/app")
public class ChattingController {
	
	@GetMapping("appchat")
	public String workSettingList() {
		return "app/appchat";
	}
	
}
