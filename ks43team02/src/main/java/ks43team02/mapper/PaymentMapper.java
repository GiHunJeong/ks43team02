package ks43team02.mapper;

import java.util.*;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.ApprovalProgress;
import ks43team02.dto.ApprovalRequest;
import ks43team02.dto.DocumentCateS;

@Mapper
public interface PaymentMapper {
	//결재 진행
	public int addPaymentProgress(ApprovalProgress approvalProgress);
	//결재 요청
	public int addPaymentRequest(ApprovalRequest approvalRequest);
	//문서 카테고리소 조회
	public List<DocumentCateS> getDocumentCateSList();
}