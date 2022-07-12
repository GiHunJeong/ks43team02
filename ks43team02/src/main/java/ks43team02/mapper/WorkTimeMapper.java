package ks43team02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.WorkSystem;

@Mapper
public interface WorkTimeMapper {
	

	//근무제 추가 insert
	public List<WorkSystem> addWorkSystem();
	
	public int addWorkSystem(WorkTimeMapper standardWorkCode);
	
	//근무제 리스트 select
	public List<WorkSystem> getWorksystem();
	
	//근무제 이름 화면에 뿌리기
	public List<WorkSystem> getWorksystemName();
	
	//근무제 이름 화면에 뿌리기
	public List<WorkSystem> addStandardWorkCode();
	
	

}
