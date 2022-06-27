package ks43team02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.Emply;


@Mapper
public interface EmplyMapper {
	
	//회원목록조회
	public List<Emply> getEmplyList();
	
	//회원검색
	public List<Emply> getSearchEmplyList(String searchKey, String searchValue);
}
