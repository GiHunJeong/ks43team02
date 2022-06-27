package ks43team02.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks43team02.dto.Emply;
import ks43team02.service.EmplyService;

@Controller
@RequestMapping("/emply")
public class EmplyController{
	
	private final EmplyService emplyService;
	
	public EmplyController(EmplyService emplyService) {
		this.emplyService = emplyService;
	}
	
	//회원 목록 조회
	@GetMapping("/emplyList")
	public String getEmplyList(Model model) {
		System.out.println("dddd");
		List<Emply> emplyList = emplyService.getEmplyList();
		model.addAttribute("emplyList", emplyList);
		return "emply/emplyList";
	}
	
	//회원 목록 검색
	@PostMapping("/emplyList")
	public String getSearchEmplyList(@RequestParam(name="searchKey") String searchKey
									 ,@RequestParam(name="searchValue", required = false) String searchValue
									 ,Model model) {
		if("emplyId".equals(searchKey)) {
			searchKey="e.emply_id";
		} else if("emplyName".equals(searchKey)) {
			searchKey="e.emply_name";
		} else if("emplyNumber".equals(searchKey)) {
			searchKey="e.emply_number";
		} else if("emplyOrganization".equals(searchKey)) {
			searchKey="e.emply_organization";
		} else {
			searchKey="e.emply_rank";
		}
		
		List<Emply> searchEmplyList = emplyService.getSearchEmplyList(searchKey, searchValue);
		
		if(searchEmplyList != null) {
			model.addAttribute("emplyList", searchEmplyList);
		}
		return "emply/emplyList";
	}
	
}

