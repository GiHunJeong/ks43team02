package ks43team02.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team02.dto.WorkSettingList;
import ks43team02.dto.WorkSystem;
import ks43team02.dto.WorkTime;
import ks43team02.dto.WorkWay;
import ks43team02.mapper.WorkTimeMapper;


@Service
@Transactional
public class WorkTimeService {
	/*
	 * 의존성주입 -워크세팅맵퍼 확인
	 */
	private final WorkTimeMapper workTimeMapper;
	
	public WorkTimeService(WorkTimeMapper workTimeMapper) {
		this.workTimeMapper = workTimeMapper;
	}
	
	//로그인한 사원의 근태리스트 화면에 뿌려주기
	public List<WorkTime> getWorkTimeEmplyName(String emplyId){ 
		List<WorkTime> workTime = workTimeMapper.getWorkTimeEmplyName(emplyId);
		return workTime; 
	}
	 
	//로그인한 사원의 지각횟수 카운트하여 화면에 뿌려주기
	public List<WorkTime> getLateCount(String emplyId){ 
		List<WorkTime> workTime = workTimeMapper.getLateCount(emplyId);
		return workTime; 
	}
	
	//로그인한 사원의 외근횟수 카운트하여 화면에 뿌려주기
	public List<WorkTime> getOutWorkCount(String emplyId){ 
		List<WorkTime> workTime = workTimeMapper.getOutWorkCount(emplyId);
		return workTime; 
	}
	
	//로그인한 사원의 출근횟수 카운트하여 화면에 뿌려주기
	public List<WorkTime> getStartCount(String emplyId){ 
		List<WorkTime> workTime = workTimeMapper.getStartCount(emplyId);
		return workTime; 
	}
	
	//사원 출근 기록 업데이트
	public int addWorkTimeCumulative(String emplyId) {
		int result = workTimeMapper.addWorkTimeCumulative(emplyId);
		return result;
	}
}
