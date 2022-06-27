package ks43team02.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team02.dto.Emply;
import ks43team02.mapper.EmplyMapper;

@Service
@Transactional
public class EmplyService {
	
	private final EmplyMapper emplyMapper;
	
	public EmplyService(EmplyMapper emplyMapper) {
		this.emplyMapper = emplyMapper;
	}
	
	// 사원 리스트 조회
	public List<Emply> getEmplyList() {
		List<Emply> emplyList = emplyMapper.getEmplyList();
		return emplyList;
	}
	
	// 사원 검색
	public List<Emply> getSearchEmplyList(String searchKey, String searchValue) {
		List<Emply> searchEmplyList = emplyMapper.getSearchEmplyList(searchKey, searchValue);
		return searchEmplyList;
	}
}
