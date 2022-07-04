package ks43team02.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team02.dto.Admin;
import ks43team02.dto.Emply;
import ks43team02.dto.OrganizationLList;
import ks43team02.dto.OrganizationMList;
import ks43team02.dto.OrganizationSList;
import ks43team02.dto.PositionLevelList;

import ks43team02.dto.RankLevelList;
import ks43team02.mapper.EmplyMapper;

@Service
@Transactional
public class EmplyService {
	
	/*
	 * 의존성주입
	 */
	
	private final EmplyMapper emplyMapper;
	
	public EmplyService(EmplyMapper emplyMapper) {
		this.emplyMapper = emplyMapper;
	}
	/*
	 * 유저 프로필 사진 업로드
	 */
	/*
	 * 어드민 사원 정보 삭제
	 */
	public int adminDelEmply(String emplyId) {
		int result = emplyMapper.adminDelEmply(emplyId);
		return result;
	}
	/*
	 * 포지션리스트조회
	 */
	public List<PositionLevelList> getPositionLevelList() {
		List<PositionLevelList> positionLevelList = emplyMapper.getPositionLevelList();
		return positionLevelList;
	}
	/*
	 * 랭크리스트조회
	 */
	public List<RankLevelList> getRankLevelList() {
		List<RankLevelList> rankLevelList = emplyMapper.getRankLevelList();
		return rankLevelList;
	}
	/*
	 * 관리자 사원정보 수정
	 */
	public int adminModifyEmply(Emply emply) {
		int result = emplyMapper.adminModifyEmply(emply);
		return result;
	}
	
	/*
	 * 사원 개인정보 수정
	 */
	public int modifyEmply(Emply emply) {
		int result = emplyMapper.modifyEmply(emply);
		return result;
	}
	
	/*
	 * 조직도 소분류 에이작스
	 */
	public List<OrganizationSList> getOrganiSListByCode(String organiM) {
		List<OrganizationSList> organiSName = emplyMapper.getOrganiSListByCode(organiM);
		return organiSName;
	}
	/*
	 * 조직도 중분류 에이작스
	 */
	public List<OrganizationMList> getOrganiMListByCode(String organiL) {
		List<OrganizationMList> organiMName = emplyMapper.getOrganiMListByCode(organiL);
		return organiMName;
	}
	/*
	 * 조직도 대분류 뿌리기
	 */
	public List<OrganizationLList> getOrganiLList() {
		List<OrganizationLList> organiLList = emplyMapper.getOrganiLList();
		return organiLList;
	}
	/*
	 * 어드민
	 */
	public Admin getAdminInfo(String superAdminId) {
		Admin admin = emplyMapper.getAdminInfo(superAdminId);
		return admin;
	}
	/*
	 * 사원전체정보조회
	 */
	public List<Emply> getEmplyInfoList() {
		List<Emply> emplyInfoList = emplyMapper.getEmplyInfoList();
		return emplyInfoList;
	}
	/*
	 * 사원상세정보조회
	 */
	public Emply getEmplyInfoById(String emplyId) {
		Emply emply = emplyMapper.getEmplyInfoById(emplyId);
		
		return emply;
	}
	
	/*
	 * 회원가입
	 */
	public int addEmply(Emply emply) {
		
		int result = emplyMapper.addEmply(emply);
		
		return result;
	}
}
