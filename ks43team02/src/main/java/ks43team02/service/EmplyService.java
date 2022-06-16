package ks43team02.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team02.dto.Emply;
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
	 * 회원전체정보조회
	 */
	public List<Emply> getEmplyInfoList() {
		List<Emply> emplyInfoList = emplyMapper.getEmplyInfoList();
		return emplyInfoList;
	}
	/*
	 * 회원상세정보조회
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
