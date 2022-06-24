package ks43team02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.Annual;

@Mapper
public interface AnnualMapper {
	
	public List<Annual> getAnnualList();

}
