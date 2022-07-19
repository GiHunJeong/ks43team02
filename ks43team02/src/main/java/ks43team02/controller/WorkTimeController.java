package ks43team02.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks43team02.dto.WorkTime;
import ks43team02.service.WorkTimeService;

@Controller
@RequestMapping("/workWay")
public class WorkTimeController{
	//로거
	private static final Logger log = LoggerFactory.getLogger(WorkTimeController.class);
	/*
	 * 의존성주입
	 */
	private final WorkTimeService workTimeService;

		
	public WorkTimeController(WorkTimeService workTimeService) {
		this.workTimeService = workTimeService;
		
	}	
	
	@PostMapping("/work_time")
	@ResponseBody
	public boolean worklate(@RequestBody WorkTime workTime) {
		log.info("화면에서 입력받은 workTime 값 : {} " , workTime);
		
		return true;
	}
	
	
	
	@GetMapping("/work_time")
	public String getWorkTimeEmplyName(@RequestParam(name ="worktimeCumulativeCode", required = false) String worktimeCumulativeCode 
									 , @RequestParam(name ="workStartTime", required = false)String workStartTime
									 , Model model
									 , HttpSession Session
									 ) {
		String emplyId = (String) Session.getAttribute("SEMAIL");
		//List<WorkTime> session = workTimeService.getWorkTimeEmplyName(emplyId);
		List<WorkTime> workTime = workTimeService.getWorkTimeEmplyName(emplyId);
		log.info("입력받은 값 확인 :{}",worktimeCumulativeCode);
		
		/*
		 * String sessionId = (String) session.getAttribute("emplyId");
		 * model.addAttribute(sessionId);
		 */
		model.addAttribute("workTime", workTime);

		log.info("가져오는 이름 : {}", workTime);
		
		
		return "workWay/work_time";
		
	};
	
	/*
	 * @GetMapping("/work_time") public String workTimeList(Model model) { }
	 */
}