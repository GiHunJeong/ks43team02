package ks43team02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.AnnualStandard;
import ks43team02.dto.AnnualApplication;
import ks43team02.dto.AnnualList;
import ks43team02.dto.CateAnnual;

@Mapper
public interface AnnualMapper {

	//연차기준
	public List<AnnualStandard> getAnnualStandard();
	//public int addAnnualStandard(AnnualStandard annualStandard);
	
	//연차등록 select
	public List<AnnualApplication> getAnnualApplication();
	
	//연차등록 추가 insert
	public int addAnnualApplication(AnnualApplication annualApplication);	
	
	//연차 신청내역 리스트 select
	public List<AnnualList> getAnnualList();
	
	public int getAnnualList(AnnualList annualList);

	
	//연차카테고리
	public List<CateAnnual> getCateAnnual(); 
	 	 
	 
}
