package ks43team02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.WorkSettingList;
import ks43team02.dto.WorkSystem;

@Mapper
public interface WorkSettingMapper{	
	//근무세팅리스트 수정
	//public int workSettingModify(String standardWorksystemCpCode);
	//public int getModifySetting(WorkSettingList workSettingList);
	public int workSettingModify(WorkSettingList workSettingList);
	public int getWorkSystem(WorkSystem workSystem);
	//설정관리에서 세팅한 회사근무방식 리스트 뿌리기
	public List<WorkSettingList> getModifySetting(String standardWorksystemCpCode);
	
	public WorkSettingList getWorkSettingList(String standardWorksystemCpCode);
	
	//회사내 근무 상세정보 조회
	//public List<WorkSettingList> getWorkSettingList(String standardWorksystemCpCode);
	
	//근무세팅리스트 삭제
	public int delWorkSettingList(String standardWorksystemCpCode);
	
	//회사에서 사용할 근무제 추가
	public int addWorkSystemCp(WorkSettingList workSettingList);
	
	//설정관리에서 세팅한 회사근무방식 리스트 뿌리기
	public List<WorkSettingList> getWorkSettingList();
	
	//설정관리 근무제선택에 근무제 직접 추가하기
	public int addWorkSystem(WorkSystem workSystem);
	
	//설정관리 근무제선택에 근무제 뿌리기 
	public List<WorkSystem> getWorkSystem();	
}
