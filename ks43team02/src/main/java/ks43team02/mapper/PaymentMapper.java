package ks43team02.mapper;

import java.util.*;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.ApprovalProgress;
import ks43team02.dto.ApprovalRequest;
import ks43team02.dto.DocumentCateS;

@Mapper
public interface PaymentMapper {
	//결재관리 request code 로 상세보기
	public List<ApprovalProgress> getProgressByRequestCode(String approvalRequestCode);
	//결재관리 페이지 상세보기
	public ApprovalProgress getRequestManageByCode(String approvalProgressCode);
	//결재관리 페이지 결재자 조회
	public List<ApprovalProgress> getRequestManageByApproverId(String approverId);
	
	//결재 진행
	public int addPaymentProgress(ApprovalProgress approvalProgress);
	//결재 요청
	public int addPaymentRequest(ApprovalRequest approvalRequest);
	//문서 카테고리소 조회
	public List<DocumentCateS> getDocumentCateSList();
}