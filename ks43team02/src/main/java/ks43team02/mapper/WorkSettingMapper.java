package ks43team02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.WorkSetting;

@Mapper
public interface WorkSettingMapper {
	//근무제만 추가
	public int addWorkSysName(WorkSetting workSetting);
	
	//근무제등록자명추가
	public int addRegUser(WorkSetting workSetting);
	
	public List<WorkSetting> getWorkSettingName();
	
	//public int addSystem(WorkSetting system);

	public String worksetting(WorkSetting worksetting);
}
