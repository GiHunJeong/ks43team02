package ks43team02.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	
	public List<DocumentCateS> getDocumentCateSList() {
		List<DocumentCateS> documentCateSList = paymentMapper.getDocumentCateSList();
		return documentCateSList;
	}
}