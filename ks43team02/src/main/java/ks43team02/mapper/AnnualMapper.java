package ks43team02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.Annual;
import ks43team02.dto.AnnualApplication;

@Mapper
public interface AnnualMapper {
	//연차등록(연차신청내역)
	//public List<AnnualApplication> getAnnualApplication();
	
	//public int addAnnualApplication(AnnualApplication annualApplication);
	
	//연차기준
	public List<AnnualApplication> getAnnualApplication();
	
	//public int addAnnual(Annual annual);
	


}
