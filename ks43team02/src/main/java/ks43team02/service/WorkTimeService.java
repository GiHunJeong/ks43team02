package ks43team02.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team02.dto.WorkSystem;
import ks43team02.dto.WorkTime;
import ks43team02.dto.WorkWayList;
import ks43team02.mapper.TimeMapper;
import ks43team02.mapper.WorkSystemMapper;
import ks43team02.mapper.WorkWayMapper;

@Service
@Transactional
public class WorkTimeService {
	/*
	 * 의존성주입
	 */
	
	private final TimeMapper timeMapper;
	private final WorkSystemMapper workSystemMapper;
	private final WorkWayMapper workWayMapper;
	
	public WorkTimeService(TimeMapper timeMapper
						, WorkSystemMapper workSystemMapper
						, WorkWayMapper workWayMapper) {
		this.timeMapper = timeMapper;
		this.workSystemMapper = workSystemMapper;
		this.workWayMapper = workWayMapper;
	}
	

	//사원이름가져오기
	public List<WorkTime> getWorkTimeEmplyName() {
		List<WorkTime> workTimeEmplyName = timeMapper.getWorkTimeEmplyName();
		return workTimeEmplyName;
	}
	//근무제 가져오기
	public List<WorkSystem> getWorkSystem(){
		List<WorkSystem> workSystemList = workSystemMapper.getWorkSystem();
		return workSystemList;
	}
	public int addWorkSystem(){
		int result =  workSystemMapper.addWorkSystem();
		return result;
	}
	
	public List<WorkWayList> getWorkWayList(){
		List<WorkWayList> workWayList = workWayMapper.getWorkWayList();
		return workWayList;
	}
}
