package ks43team02.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team02.dto.ApprovalProgress;
import ks43team02.dto.ApprovalRequest;
import ks43team02.mapper.DocumentMapper;


@Service
@Transactional
public class DocumentService {
	/*
	 * 의존성주입 -워크세팅맵퍼 확인
	 */
	private final DocumentMapper documentMapper;
	
	public DocumentService(DocumentMapper documentMapper) {
		this.documentMapper = documentMapper;
	}
	
	//요청 문서 리스트 (ApprovalRequest)
	public List<ApprovalRequest> getDocApprovalRequest(){
		List<ApprovalRequest> approvalRequest = documentMapper.getDocApprovalRequest();
		return approvalRequest;
	}
}
