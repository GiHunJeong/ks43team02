package ks43team02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.DeductionList;
import ks43team02.dto.FixedAllowanceList;

@Mapper
public interface PayMapper {
	
	//공제액 리스트
	public List<DeductionList> getDeductionList();
	
	//고정지급 급여 리스트
	public List<FixedAllowanceList> getFixedAllowList();
}
