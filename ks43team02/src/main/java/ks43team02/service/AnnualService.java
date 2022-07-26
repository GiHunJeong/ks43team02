package ks43team02.service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team02.dto.AnnualApplication;
import ks43team02.dto.CateAnnual;
import ks43team02.dto.Emply;
import ks43team02.mapper.AnnualMapper;

@Service
@Transactional
@Repository
public class AnnualService {
	/*
	* 의존성 주입
	* */
	private final AnnualMapper annualMapper;
   
	public AnnualService(AnnualMapper annualMapper) {
		this.annualMapper = annualMapper;
	}
   
	public Emply getEmplyInfoByEmail(String emplyId) {
		Emply emply = annualMapper.getEmplyInfoByEmail(emplyId);
		return emply;
	};
   	
	//연차 등록
	public List<AnnualApplication> getAnnualApplication(){
		List<AnnualApplication> annualApplication = annualMapper.getAnnualApplication();
		return annualApplication;
	}
   
	//연차 신청 목록 리스트
	public List<AnnualApplication> getAnnualList(){
		List<AnnualApplication> annualApplication = annualMapper.getAnnualList();
		return annualApplication;
	}
	
	//신청한 연차 리스트
	public List<CateAnnual> getAnnualCateList(String cpRepresentativeCode){
		List<CateAnnual> cateAnnual = annualMapper.getAnnualCateList(cpRepresentativeCode);
		return cateAnnual;
	}
  
	//연차 신청 하기 -테이블 쌓이게
	public int addAnnualApplication(AnnualApplication annualApplication) {
		int result = annualMapper.addAnnualApplication(annualApplication);
		return result;
	}
   //로그인한 사원 연차등록 리스트 보여주기
/*	public List<AnnualApplication> getAnnualListLogin(String emplyId){
	   List<AnnualApplication> annualListLogin = annualMapper.getAnnualListLogin(emplyId);
	   return annualListLogin;
   }
*/
    
 
}