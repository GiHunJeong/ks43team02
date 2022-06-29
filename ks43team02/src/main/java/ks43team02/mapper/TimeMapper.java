package ks43team02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.WorkTime;

@Mapper
public interface TimeMapper {

	public List<WorkTime> getWorkTimeEmplyName();
	
}
