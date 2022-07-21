package ks43team02.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team02.dto.DeductionList;
import ks43team02.dto.Emply;
import ks43team02.dto.FixedAllowanceList;
import ks43team02.dto.PayAdd;
import ks43team02.dto.PaySet;
import ks43team02.mapper.PayMapper;

@Service
@Transactional
public class PayService {
	
	private final PayMapper payMapper;
	
	public PayService(PayMapper payMapper) {
		this.payMapper = payMapper;
	}
	
	// 급여등록 내역 검색
	public List<PayAdd> getSearchPayAddList(String searchKey, String searchValue) {
		List<PayAdd> searchPayAddList = payMapper.getSearchPayAddList(searchKey, searchValue);
		return searchPayAddList;
	}
	
	// 급여등록 내역 삭제
	public int removePayAdd(String emplyId) {
		int result = payMapper.removePayAdd(emplyId);
		System.out.println(emplyId+"removeList");
		return result;
	}
	
	// 급여 등록 리스트 조회
	public List<PayAdd> getPayAddList() {
		List<PayAdd> payAddList = payMapper.getPayAddList();
		return payAddList;
	}
	
	//기본급내역 수정
	public int modifySalary(PayAdd payAdd) {
		
		int result = payMapper.modifySalary(payAdd);
		System.out.println(payAdd+"Service!!");
		return result;
	}
	
	//급여내역 등록
	public int payAdd(PayAdd payAdd) {
		
		int result = payMapper.payAdd(payAdd);
		System.out.println(payAdd+"Service!!");
		return result;
	}
	
	// 사원 리스트 조회
	public List<Emply> getEmplyListForPayAdd() {
		List<Emply> emplyList = payMapper.getEmplyListForPayAdd();
		return emplyList;
	}
	
	//급여세팅내역 불러오기(급여등록)
	public PaySet getPaySetForPayAdd(){
		PaySet paySet = payMapper.getPaySet();
		return paySet;
	}
	
	//급여세팅내역 불러오기
	public PaySet getPaySet(){
		PaySet paySet = payMapper.getPaySet();
		return paySet;
	}
	
	//급여세팅내역 추가
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
