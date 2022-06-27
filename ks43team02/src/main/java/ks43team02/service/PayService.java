package ks43team02.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team02.dto.DeductionList;
import ks43team02.dto.FixedAllowanceList;
import ks43team02.dto.PaySet;
import ks43team02.mapper.PayMapper;

@Service
@Transactional
public class PayService {
	
	private final PayMapper payMapper;
	
	public PayService(PayMapper payMapper) {
		this.payMapper = payMapper;
	}
	
	public List<PaySet> getPaySet(){
		List<PaySet> paySet = payMapper.getPaySet();
		return paySet;
	}
	
	public int addPaySet(PaySet paySet) {
		
		int result = payMapper.addPaySet(paySet);
		System.out.println(paySet+"Service!!");
		return result;
	}
	
	//고정지급금 내역 조회
	public List<FixedAllowanceList> getFixedAllowList(){
		List<FixedAllowanceList> fixedAllowanceList = payMapper.getFixedAllowList();
		return fixedAllowanceList;
	}
	
	//공제액 내역 조회
	public List<DeductionList> getDeductionList(){
		List<DeductionList> deductionList = payMapper.getDeductionList();
		return deductionList;
	}
}
