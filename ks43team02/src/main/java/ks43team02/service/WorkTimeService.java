package ks43team02.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team02.dto.WorkSettingList;
import ks43team02.dto.WorkSystem;
import ks43team02.dto.WorkTime;
import ks43team02.dto.WorkWayList;
import ks43team02.mapper.TimeMapper;
import ks43team02.mapper.WorkSettingMapper;
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
	private final WorkSettingMapper workSettingMapper;
	
	public WorkTimeService(TimeMapper timeMapper
						, WorkSystemMapper workSystemMapper
						, WorkWayMapper workWayMapper
						, WorkSettingMapper workSettingMapper) {
		
		this.timeMapper = timeMapper;
		this.workSystemMapper = workSystemMapper;
		this.workWayMapper = workWayMapper;
		this.workSettingMapper = workSettingMapper;
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
	public int addWorkSystem(WorkSystem workSystem) {
		int result =  workSystemMapper.addWorkSystem(workSystem);
		return result;
	}
	
	public List<WorkWayList> getWorkWayList(){
		List<WorkWayList> workWayList = workWayMapper.getWorkWayList();
		return workWayList;
	}
	public List<WorkSettingList> getWorkSettingList(){
		List<WorkSettingList> workSettingList = workSettingMapper.getWorkSettingList();
		return workSettingList;
	}
	//회사별 전체 근무제 리스트
	/*
	 * public List<WorkSettingList> getWorkSetting(){ List<WorkSettingList>
	 * workSettingList = workSettingMapper.getWorkSettingList(); return
	 * workSettingList; }
	 */
	
}
