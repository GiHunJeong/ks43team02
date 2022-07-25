package ks43team02.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team02.dto.ApprovalProgress;
import ks43team02.dto.ApprovalRequest;
import ks43team02.dto.DocumentCateS;
import ks43team02.mapper.PaymentMapper;

@Service
@Transactional
public class PaymentService {
	//의존성 주입
	private final PaymentMapper paymentMapper;
	
	public PaymentService(PaymentMapper paymentMapper) {
		this.paymentMapper = paymentMapper;
	}
	
	//결재 진행
	public int addPaymentProgress(ApprovalProgress approvalProgress) {
		int result = paymentMapper.addPaymentProgress(approvalProgress);
		return result;
	}
	//결재 요청
	public int addPaymentRequest(ApprovalRequest approvalRequest) {
		int result = paymentMapper.addPaymentRequest(approvalRequest);
		return result;
	}
	//카테고리소 리스트 조회
	public List<DocumentCateS> getDocumentCateSList() {
		List<DocumentCateS> documentCateSList = paymentMapper.getDocumentCateSList();
		return documentCateSList;
	}
}