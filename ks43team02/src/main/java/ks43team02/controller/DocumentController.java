package ks43team02.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks43team02.dto.ApprovalProgress;
import ks43team02.dto.ApprovalRequest;
import ks43team02.service.DocumentService;
@Controller
@RequestMapping("/document")
public class DocumentController {
	//로거
	private static final Logger log = LoggerFactory.getLogger(DocumentController.class);
	/*
	 * 의존성주입
	 */
	private final DocumentService documentService;
	
	public DocumentController(DocumentService documentService) {
		this.documentService = documentService;
	}	

	//문서조회
	@GetMapping("/document_list")
	public String approvalRequestList(Model model) {
		
		List<ApprovalRequest> approvalRequest = documentService.getDocApprovalRequest();
		model.addAttribute("approvalRequest",approvalRequest);
		log.info("approvalRequest의 값 : {}",approvalRequest);
		
		return "document/document_list";
		
	}
}

