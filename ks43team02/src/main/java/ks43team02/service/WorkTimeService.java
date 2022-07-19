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
	
	//
	
	  public List<WorkTime> getWorkTimeEmplyName(String emplyId){ 
		  List<WorkTime> workTime = workTimeMapper.getWorkTimeEmplyName(emplyId);
		  return workTime; 
		  }
	 
	
}
