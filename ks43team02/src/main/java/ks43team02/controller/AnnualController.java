package ks43team02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/annual")
public class AnnualController {

	@GetMapping("/annual")
		public String annual() {
		return "annual/annual";
	}
}
