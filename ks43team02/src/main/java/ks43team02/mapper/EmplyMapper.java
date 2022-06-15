package ks43team02.mapper;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.Emply;

@Mapper
public interface EmplyMapper {
	// 회원 정보정보 조회
	public Emply getEmplyInfoById(String userEmail);
	// 회원 등록
	public int addEmply(Emply emply);
}