package ks43team02.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team02.dto.WorkSetting;
import ks43team02.dto.WorkSettingList;
import ks43team02.dto.WorkTime;
import ks43team02.mapper.TimeMapper;
import ks43team02.mapper.WorkSettingMapper;

@Service
@Transactional
public class WorkTimeService {
	/*
	 * 의존성주입
	 */
	
	private final TimeMapper timeMapper;
	private final WorkSettingMapper workSettingMapper;
	
	public WorkTimeService(TimeMapper timeMapper, WorkSettingMapper workSettingMapper) {
		this.timeMapper = timeMapper;
		this.workSettingMapper = workSettingMapper;
	}
	//근무제 추가
	public int addWorkSysName(WorkSetting workSetting) {
		int addWorkSysName = workSettingMapper.addWorkSysName(workSetting);
		return addWorkSysName;
	}
	//근무제 등록자명 가져오기
	public int regUser(WorkSetting workSetting) {
		int addRegUser = workSettingMapper.addRegUser(workSetting);
		return addRegUser;
	}
	//사원이름가져오기
	public List<WorkTime> getWorkTimeEmplyName() {
		List<WorkTime> workTimeEmplyName = timeMapper.getWorkTimeEmplyName();
		return workTimeEmplyName;
	}
	
	//근무제 가져오기
	public List<WorkSetting> getWorkSettingName(){
		List<WorkSetting> workSettingName = workSettingMapper.getWorkSettingName();
		return workSettingName;
	}
	
	//근무제 전체세팅 리스트로 보여주기
	
	public List<WorkSettingList> getWorkSettingList(){
		List<WorkSettingList> workSettingList = workSettingMapper.getWorkSettingList();
		return workSettingList;
	}
	public int workSettingList(WorkSettingList workSettingList) {
		int addWorkSettingList = workSettingMapper.addWorkSettingList(workSettingList);
		return addWorkSettingList;
	}
}
