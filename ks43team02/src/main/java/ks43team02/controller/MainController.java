package ks43team02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	/*
	@GetMapping("/app/app-calendar")
	public String calendar() {
		return "app/app-calendar";
	}*/
	
	@GetMapping("/app/app-chat")
	public String chat() {
		return "app/app-chat";
	}
	
}