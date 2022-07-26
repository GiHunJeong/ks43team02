package ks43team02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.AnnualApplication;
import ks43team02.dto.CateAnnual;
import ks43team02.dto.Emply;

@Mapper
public interface AnnualMapper {
	
	//연차등록
	public List<AnnualApplication> getAnnualApplication();

	//연차신청 목록 리스트 select
	public List<AnnualApplication> getAnnualList();
	

	//연차신청 insert
	public int addAnnualApplication(AnnualApplication annualApplication);
	
	//로그인한 사원 연차등록 리스트
	/* public List<AnnualApplication> getAnnualListLogin(String emplyId); */ 
	 
	//연차 카테고리
	public List<CateAnnual> getAnnualCateList(String cpRepresentativeCode);
	
	//사원 정보조회
	public Emply getEmplyInfoByEmail(String emplyId);
}
