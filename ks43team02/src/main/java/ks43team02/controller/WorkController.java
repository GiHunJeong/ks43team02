package ks43team02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkController{
	@GetMapping("/workWay/worktime")
	public String work() {
		return "workWay/work_time";
	};
	@GetMapping("/workWay/worksetting")
	public String worksetting() {
		return "workWay/work_setting";
	};
}