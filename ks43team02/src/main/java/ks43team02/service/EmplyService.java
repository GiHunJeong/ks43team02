package ks43team02.service;

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
	 * 회원상세정보조회
	 */
	public Emply getEmplyInfoById(String userEmail) {
		Emply emply = emplyMapper.getEmplyInfoById(userEmail);
		
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
