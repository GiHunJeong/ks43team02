package ks43team02.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javassist.expr.NewArray;
import ks43team02.dto.WorkSetting;
import ks43team02.dto.WorkSettingList;
import ks43team02.dto.WorkTime;
import ks43team02.service.WorkTimeService;

@Controller
@RequestMapping("/workWay")
public class WorkController{
	//로거
	private static final Logger log = LoggerFactory.getLogger(WorkController.class);
	/*
	 * 의존성주입
	 */
	/*again*/
	private final WorkTimeService workTimeService;
	
	public WorkController(WorkTimeService workTimeService) {
		this.workTimeService = workTimeService;
	}
	/*
	 * 근무제 추가
	 */
	
	@GetMapping("/work_time")
	public String work(Model model) {
		
		int toYear = 2022;
		int toMonth = 6;
		
		List<WorkTime> workTime = workTimeService.getWorkTimeEmplyName();
		LocalDateTime toNow = LocalDateTime.now();
		toNow = toNow.withYear(toYear).withMonth(toMonth);	
		toNow = toNow.with(TemporalAdjusters.lastDayOfMonth());
		
		String lastDay = toNow.format(DateTimeFormatter.ofPattern("d"));
		System.out.println(toMonth + "월 마지막 일 > " + lastDay);
		
		String change = lastDay;
		int to = Integer.parseInt(change);
		System.out.println(to);
		List<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		for(int dayvalue =1; dayvalue <= to; ++dayvalue) {

			//System.out.println(i);
			//System.out.println(toYear + "년" + toMonth+ "월" + i);
			String 
				day = dayvalue + "일"
				,yearMonthDay = toYear+"-"+toMonth+"-"+dayvalue;
			//toYear + "년" + toMonth+ "월" + 
			System.out.println(day);
			System.out.println(yearMonthDay);
			list.add(day);
			list2.add(yearMonthDay);
			//뷰로 가기 전에 모델 객체에 셋팅 후 포워드 하면 된다.
			
			
			/*
			 * System.out.println(list.size() + "<- list.size()");
			 * 
			 * for(int dayvalue1 = 0; dayvalue1<list.size();dayvalue1++) { String
			 * getyearmonthday = list.get(dayvalue1); System.out.println(getyearmonthday +
			 * "<- getyearmonthday 배열에 있는 값 꺼내오기"); }
			 */
			  
			 
		}
		model.addAttribute("workTime", workTime);
		log.info("가져오는 이름 : {}", workTime);
		model.addAttribute("list", list);
		model.addAttribute("list2", list2);
		log.info("가져오는 날짜들   :  {}",list);
		log.info("가져오는 날짜들   :  {}",list2);
		return "workWay/work_time";
		
		
	};
	@GetMapping("/work_time_management")
	public String workmanagement() {
		return "workWay/work_time_management";
	};
	@GetMapping("/work_setting")
	public String worksetting(Model model
							 ,WorkSetting workSetting
							 ,@RequestParam(name="worksystemName", required=false) String worksystemName) {
		List<WorkSetting> workSettingName = workTimeService.getWorkSettingName();
		model.addAttribute("workSetting" , workSettingName);
		log.info("근무제 항목들 : {}", workSettingName);
		 List<WorkSetting> list3 = workTimeService.getWorkSettingName();
		model.addAttribute("list3", list3);
		log.info("근무제 항목리스트 : {}", list3);
		
		if(worksystemName != null) {
			log.info("화면에서 입력한 workSetting data : {}", workSetting);
			log.info("화면에서 입력한 worksystemName : {}", worksystemName);
			//workSetting.setRegUser("백민주");
			workTimeService.addWorkSysName(workSetting);
			return "redirect:/workWay/work_setting";
		}
		
		return "workWay/work_setting";
	};
	
	
	
	
	@GetMapping("/work_setting_list")
	public String workSettingList(@RequestParam (name = "standardWorkCode", required = false) String standardWorkCode
								) {
		//List<String> workSettingList = workTimeService.getWorkSettingList();
		//model.addAttribute(workSettingList);
		//WorkSettingList workSettingList = workTimeService.getWorkSettingList()
		log.info(standardWorkCode);
		return "workWay/work_setting_list";
	};
	
	
}