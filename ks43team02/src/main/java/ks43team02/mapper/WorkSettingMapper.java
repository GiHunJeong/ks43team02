package ks43team02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.WorkSettingList;

@Mapper
public interface WorkSettingMapper {
	
	//회사별 근무제,근무방식 리스트 select
	public int WorkSettingList(WorkSettingList workSettingList);
	
	public List<WorkSettingList> getCpName(WorkSettingMapper cpName);
	public String workSettingList(WorkSettingList workSettingList);
	public List<WorkSettingList> getWorkSettingList();
	
	//내용들어가는지 확인
}
