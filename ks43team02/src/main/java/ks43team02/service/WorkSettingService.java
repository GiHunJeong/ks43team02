package ks43team02.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import ks43team02.dto.Emply;
import ks43team02.dto.WorkSettingList;
import ks43team02.dto.WorkSystem;
import ks43team02.dto.WorkWay;
import ks43team02.mapper.WorkSettingMapper;

@Service
@Transactional
public class WorkSettingService {
	/*
	 * 의존성주입 -워크세팅맵퍼 확인
	 */
	private final WorkSettingMapper workSettingMapper;

	public WorkSettingService(WorkSettingMapper workSettingMapper) {			
		this.workSettingMapper = workSettingMapper;
	}
	//설정관리에서 세팅한 회사근무방식 리스트 뿌리기
		public List<WorkSettingList> getModifySetting(String standardWorksystemCpCode) {
			List<WorkSettingList> workSettingList = workSettingMapper.getModifySetting(standardWorksystemCpCode);
			return workSettingList;
		}
	//회사 근무  상세정보
	public int workSettingModify(WorkSettingList workSettingList) {
		int result = workSettingMapper.workSettingModify(workSettingList);
		return result;
	}
	public int getWorkSystem(WorkSystem workSystem) {
		int result = workSettingMapper.getWorkSystem(workSystem);
		return result;
	}
	
	public WorkSettingList getWorkSettingList(String standardWorksystemCpCode) {
		WorkSettingList workSettingList = workSettingMapper.getWorkSettingList(standardWorksystemCpCode);
		
		return workSettingList;
	}
	
	//근무세팅리스트 삭제
	public int delWorkSettingList(String standardWorksystemCpCode) {
		int result = workSettingMapper.delWorkSettingList(standardWorksystemCpCode);
		return result;
	}
	//회사에서 사용할 근무제 추가
	public int addWorkSystemCp(WorkSettingList workSettingList) {
		int result = workSettingMapper.addWorkSystemCp(workSettingList);
		return result;
	}
	//설정관리에서 세팅한 회사근무방식 리스트 뿌리기
	public List<WorkSettingList> getWorkSettingList() {
		List<WorkSettingList> workSettingList = workSettingMapper.getWorkSettingList();
		return workSettingList;
	}
	//설정관리 근무제선택에 근무제 직접 추가하기
	public int addWorkSystem(WorkSystem workSystem) {
		int result = workSettingMapper.addWorkSystem(workSystem);
		return result;
	}
	//설정관리 근무제선택에 근무제 뿌리기 
	public List<WorkSystem> getWorkSystem() {
		List<WorkSystem> workSystem = workSettingMapper.getWorkSystem();
		return workSystem;
	}
	//설정관리 근태방식 뿌리기 
	public List<WorkWay> getWorkWay() {
		List<WorkWay> wokrWay = workSettingMapper.getWorkWay();
		return wokrWay;
	}
}
