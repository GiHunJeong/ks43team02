package ks43team02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.AnnualStandard;
import ks43team02.dto.CateAnnual;
import ks43team02.dto.AnnualSetting;

@Mapper
public interface AnnualSettingMapper {

	//휴가유형관리(CateAnnual) 리스트
	public List<CateAnnual> getCateAnnualListSetting();
	//연차세팅
	public List<AnnualSetting> getAnnualSettingList(String emplyId);
	public int addAnnualSetting(AnnualSetting annualSetting);

	//연차기준(AnnualStandard-annual)
	public List<AnnualStandard> getAnnualStandard();

	//연차기준(AnnualStandard-annualSetting)
	public List<AnnualStandard> getAnnualSettingStandard(String emplyId);
	
	public List<CateAnnual> cateAnnualList(String emplyId);
	public List<AnnualSetting> getAnnualSetting(String emplyId);
	public List<AnnualSetting> getAnnualApplication(String emplyId);
}
