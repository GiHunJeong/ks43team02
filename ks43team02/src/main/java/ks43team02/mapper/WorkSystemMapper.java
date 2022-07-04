package ks43team02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.WorkSystem;

@Mapper
public interface WorkSystemMapper {
	//근무제만 추가
	public int WorkSystem(WorkSystem workSystem);
	
	public List<WorkSystem> getWorksystemName(WorkSystemMapper worksystemName);

	public String workSystem(WorkSystem workSystem);
	 
	//근무제 추가 insert
	public int addWorkSystem(WorkSystem workSystem);
	
	//근무제 리스트 select
	public List<WorkSystem> getWorkSystem();
	
	public String workSystemList(WorkSystem workSystem);
	public int WorkSystem(WorkSystemMapper worksystemName);
	
	public List<WorkSystem> getWorkSystem(WorkSystem workSystem);
	public List<WorkSystem> getRegUser(String regUser);
	

}
