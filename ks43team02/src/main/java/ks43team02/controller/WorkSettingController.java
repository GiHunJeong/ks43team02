package ks43team02.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ks43team02.dto.WorkSettingList;
import ks43team02.dto.WorkSystem;
import ks43team02.dto.WorkWay;
import ks43team02.service.WorkSettingService;

@Controller
@RequestMapping("/workWay")
public class WorkSettingController{
	//로거
	private static final Logger log = LoggerFactory.getLogger(WorkSettingController.class);
	/*
	 * 의존성주입
	 */
	private final WorkSettingService workSettingService;
	
	public WorkSettingController(WorkSettingService workSettingService) {
		this.workSettingService = workSettingService;
	}

	/*
	 * 근무제 리스트 수정
	 */
	@PostMapping("/work_setting_info_modify")
	public String workSettingModify(WorkSettingList workSettingList
			,RedirectAttributes attr) {
		
			log.info("수정화면에서 입력받은 workSettingList :{}", workSettingList);
			//log.info("수정화면에서 입력받은 workSystem :{}", workSystem);
			log.info("수정화면에서 입력받은 workSettingList.getStandardWorksystemCpCode :{}", workSettingList.getStandardWorksystemCpCode());
			log.info("수정화면에서 입력받은 workSystem.getStandardWorkCode :{}", workSettingList.getStandardWorkCode());
			//workSettingService.workSettingModify(workSettingList);
			//attr.addAttribute("workSystem", workSettingList.getWorkSystem());
			
			
			return "redirect:/workWay/work_setting_list";
	}
	
	@GetMapping("/work_setting_info_modify")
	public String workSettingModify(@RequestParam(name="standardWorksystemCpCode", required = false) String standardWorksystemCpCode
			,@RequestParam(name="cpRepresentativeCode", required = false) String cpRepresentativeCode
			,@RequestParam(name="standardWorkCode", required = false) String standardWorkCode
			,@RequestParam(name="dayCheck", required = false) String dayCheck
			,Model model) {
		/*
		 * String[] continents = { "sun","mon","tue","wen","thr","fri","sat" };
		 * 
		 * model.addAttribute("continents" ,continents);
		 */
	log.info("화면에서 입력받은 standardWorksystemCpCode:{}", standardWorksystemCpCode);
	log.info("화면에서 입력받은 cpRepresentativeCode:{}", cpRepresentativeCode);
	log.info("화면에서 입력받은 standardWorkCode :{}", standardWorkCode);
	log.info("화면에서 입력받은 dayCheck :{}", dayCheck);
	
	List<WorkSettingList> workSettingList = workSettingService.getModifySetting(standardWorksystemCpCode);
	model.addAttribute("workSettingList", workSettingList);
	List<WorkSystem> workSetting = workSettingService.getWorkSystem();
	List<WorkWay> workWay = workSettingService.getWorkWay();
	model.addAttribute("workWay", workWay);
	log.info("workSetting에 담기는 값 {} : ", workSetting);
	log.info("workWay에 담기는 값 {} : ", workWay);

	model.addAttribute("workSetting", workSetting);
	
	return "workWay/work_setting_info_modify";
	}
	
	/*
	 * 근무제 리스트 삭제
	 */
	@GetMapping("/work_setting_list_del")
	public String workSettingListDel(@RequestParam(name="standardWorksystemCpCode", required=false) String standardWorksystemCpCode) {
		log.info("standardWorksystemCpCode에 담기는 값 {} :", standardWorksystemCpCode);
		workSettingService.delWorkSettingList(standardWorksystemCpCode);
		return "redirect:/workWay/work_setting_list";
	}
	/*
	 * 설정관리에서 세팅한 회사근무방식 리스트 뿌리기
	 */
	@GetMapping("/work_setting_list")
	public String workSettingList(Model model) {
		List<WorkSettingList> workSettingList = workSettingService.getWorkSettingList();
		model.addAttribute("workSettingList", workSettingList);
		log.info("workSettingList에 담기는 값 {} : ", workSettingList);
		return "workWay/work_setting_list";
	}
	/*
	 * 근무제 추가
	 * 회사 근무 추가
	 */
	@PostMapping("/work_setting")
	public String workSettingSet(WorkSystem workSystem
								,WorkSettingList workSettingList
								) {
		log.info("workSettingList에 담기는 값 {} : ", workSettingList);
		log.info("workSystem에 담기는 값 {} : ", workSystem);
		if(workSettingList != null && workSystem.getWorksystemName() == "") {		
			workSettingList.setCpRepresentativeCode("cp_representative_code_01");
			workSettingList.setSuperAdminId("ksmart43id@ksmart.or.kr");
			workSettingList.setWorkwayCode("workway_code_01");
			workSettingService.addWorkSystemCp(workSettingList);
			return "redirect:/workWay/work_setting_list";
		} 
		if(workSystem != null && workSystem.getWorksystemName() != "") {	
			workSystem.setRegUser("백민주");
			workSystem.setSuperAdminId("ksmart43id@ksmart.or.kr");
			workSystem.setCpRepresentativeCode("cp_representative_code_01");
			workSettingService.addWorkSystem(workSystem); 
		}
		
		return "redirect:/workWay/work_setting";
	}
	/*
	 * 설정관리 근무제선택에 근무제 뿌리기 
	 */
	@GetMapping("/work_setting")
	public String workSetting(Model model) {
		List<WorkSystem> workSetting = workSettingService.getWorkSystem();
		log.info("workSetting에 담기는 값 {} : ", workSetting);
	
		model.addAttribute("workSetting", workSetting);
		return "workWay/work_setting";
	}
}