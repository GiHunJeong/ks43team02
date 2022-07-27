package ks43team02.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ks43team02.dto.DocumentCateS;
import ks43team02.service.DocumentSettingService;

@Controller
@RequestMapping("/document")
public class DocumentSettingController {
	//로거
	private static final Logger log = LoggerFactory.getLogger(DocumentSettingController.class);
	/*
	 * 의존성주입
	 */
	private final DocumentSettingService documentSettingService;
	
	public DocumentSettingController(DocumentSettingService documentSettingService) {
		this.documentSettingService = documentSettingService;
	};
	
	/*
	@RequestMapping(value = "/document_setting")
	public @ResponseBody int btnModalSub(String cateNameL, String cateNameS, String addDocFile) {
		
		int result = documentSettingService.addDocumentCate(cateNameL,cateNameS,addDocFile);
		System.out.println(result + "<- result btnModalSub()");
		
		return result;
	}
	*/
	
	//문서 양식 등록
	@PostMapping("/document_setting")
	@RequestMapping
	public String addDocumentCate(DocumentCateS documentCateS) {
		documentSettingService.addDocumentCate(documentCateS);
		
		log.info("addDocumentCate 값 : {}",documentCateS);
		return "/document/document_setting";
	}
	
	//등록된 문서 양식 리스트(documentCateS)
	@GetMapping("/document_setting")
	public String documentCate(Model model) {
		
		List<DocumentCateS> documentCateS = documentSettingService.getDocSetList();
		model.addAttribute("documentCateS",documentCateS);
		log.info("documentCateS의 값 : {}",documentCateS);
		
		return "document/document_setting";
	};
	
	//문서등록페이지 이동
	@GetMapping("/document_add")
	public String documentAdd(Model model) {
		return "document/document/add";
	};
	
	//등록문서 상세페이지 이동
	@GetMapping("/document_detail")
	public String documentDetail() {
		return "document/document_detail";
	};
}
