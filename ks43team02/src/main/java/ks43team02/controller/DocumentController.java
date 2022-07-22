package ks43team02.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks43team02.service.DocumentService;
@Controller
@RequestMapping("/document")
public class DocumentController {
	//로거
	private static final Logger log = LoggerFactory.getLogger(WorkTimeController.class);
	/*
	 * 의존성주입
	 */
	private final DocumentService documentService;

		
	public DocumentController(DocumentService documentService) {
		this.documentService = documentService;
	}	
	
	@GetMapping("/document_list")
	public String DocumentPage() {
		return "document/document_list";
	}
}

