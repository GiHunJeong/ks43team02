package ks43team02.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team02.dto.WorkTime;
import ks43team02.mapper.TimeMapper;

@Service
@Transactional
public class WorkTimeService {
	/*
	 * 의존성주입
	 */
	
	private final TimeMapper timeMapper;
	
	public WorkTimeService(TimeMapper timeMapper) {
		this.timeMapper = timeMapper;
	}
	
	//사원이름가져오기
	public List<WorkTime> getWorkTimeEmplyName() {
		List<WorkTime> workTimeEmplyName = timeMapper.getWorkTimeEmplyName();
		return workTimeEmplyName;
	}
}
