package ks43team02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value="/board", method = {RequestMethod.POST, RequestMethod.POST})
public class BoardController {
	
	/* 게시글 작성 페이지 */
	@PostMapping("/departmentWrite")
	public String boardwrite() {
		
		return "board/departmentList";
	}
	
	/* 게시글 등록 페이지 이동 */
	@GetMapping("/departmentWrite")
	public String boardwrite(Model model) {
		

		return "board/departmentWrite";
	}
	
	/* 게시글 리스트 페이지 */
	@GetMapping("/departmentList")
	public String boardlist(){
		
		return "board/departmentList";
	}
}
