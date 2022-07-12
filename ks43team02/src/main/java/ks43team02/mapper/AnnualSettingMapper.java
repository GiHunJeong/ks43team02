package ks43team02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.AnnualStandard;
import ks43team02.dto.AnnualSetting;

@Mapper
public interface AnnualSettingMapper {
	
	//연차세팅
	public List<AnnualSetting> getAnnualSetting();
	public int addAnnualSetting(AnnualSetting annualSetting);

	//연차기준
	public List<AnnualStandard> getAnnualApplication();
	
	

}
