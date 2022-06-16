package ks43team02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.Emply;

@Mapper
public interface EmplyMapper {
	// 회원전체 정보 조회
	public List<Emply> getEmplyInfoList();
	// 회원 상세정보 조회
	public Emply getEmplyInfoById(String emplyId);
	// 회원 등록
	public int addEmply(Emply emply);
}