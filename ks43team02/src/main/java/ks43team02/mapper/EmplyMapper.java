package ks43team02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.Admin;
import ks43team02.dto.Emply;
import ks43team02.dto.OrganizationLList;
import ks43team02.dto.OrganizationMList;
import ks43team02.dto.OrganizationSList;

@Mapper
public interface EmplyMapper {
	// 관리자 사원 정보 수정
	public int adminModifyEmply(Emply emply);
	// 사원 개인정보 수정
	public int modifyEmply(Emply emply);
	// 조직도 소분류
	public List<OrganizationSList> getOrganiSListByCode(String organiM);
	// 조직도 중분류
	public List<OrganizationMList> getOrganiMListByCode(String organiL);
	// 조직도 대분류
	public List<OrganizationLList> getOrganiLList();
	// 어드민
	public Admin getAdminInfo(String upserAdminId);
	// 사원전체 정보 조회
	public List<Emply> getEmplyInfoList();
	// 사원 상세정보 조회
	public Emply getEmplyInfoById(String emplyId);
	// 사원 등록
	public int addEmply(Emply emply);
}