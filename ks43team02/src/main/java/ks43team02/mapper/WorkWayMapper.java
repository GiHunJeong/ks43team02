package ks43team02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.WorkWayList;

@Mapper
public interface WorkWayMapper {
	
	//전체 근무방식 리스트 가져오기
	public List<WorkWayList> getWorkWayList();
	public String workWayList(WorkWayList workWayList);
	
	//전체 근무제 리스트 가져오기
}
