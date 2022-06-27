package ks43team02.controller;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkController{
	@GetMapping("/work/worktime")
	public String work() {
		return "work/worktime";
	};
}

