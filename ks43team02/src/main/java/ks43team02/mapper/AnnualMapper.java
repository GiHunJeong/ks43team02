package ks43team02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.AnnualStandard;
import ks43team02.dto.AnnualApplication;
import ks43team02.dto.CateAnnual;

@Mapper
public interface AnnualMapper {

	//연차정보
	public List<AnnualStandard> getAnnualStandard();
	//public int addAnnualStandard(AnnualStandard annualStandard);
	
	//연차등록(신청내역)
	public List<AnnualApplication> getAnnualApplication();

	//public int addAnnualApplication(AnnualApplication annualApplication);
	
	//연차카테고리
	 public List<CateAnnual> getCateAnnual(); 

}
