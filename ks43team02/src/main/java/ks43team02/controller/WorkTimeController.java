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
import org.springframework.web.bind.annotation.RequestMethod;
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
	public WorkTime worklate(@RequestBody WorkTime workTime) {
		log.info("화면에서 입력받은 workTime 값 : {} " , workTime);
		/*
		 * if (workTime != null) { throw new ServerException(); } else { return new
		 * ResponseEntity<>(user, HttpStatus.CREATED); }
		 */
		
		if(workTime != null && workTime.getStandardWorksystemCpCode() =="") {
			workTimeService.addWorkTimeCumulative(workTime);
			log.info("db에 들어가야할 값 : {}",workTime);
		}
		return workTime;
	}
	
	
	
	@GetMapping(value = "/work_time")
	public String getWorkTimeEmplyName(@RequestParam(name ="worktimeCumulativeCode", required = false) String worktimeCumulativeCode 
									 , @RequestParam(name ="workStartTime", required = false)String workStartTime
									 , @RequestParam(value ="srartTime", required = false)String srartTime
									 , Model model
									 , HttpSession Session
									 ) {
		
		
		String emplyId = (String) Session.getAttribute("SEMAIL");
		List<WorkTime> workTime = workTimeService.getWorkTimeEmplyName(emplyId);
		List<WorkTime> start = workTimeService.getStartCount(emplyId);
		List<WorkTime> late = workTimeService.getLateCount(emplyId);
		List<WorkTime> out = workTimeService.getOutWorkCount(emplyId);
		//List<WorkTime> list = workTimeService.addWorkTimeCumulative(emplyId);
		/*
		 * String sessionId = (String) session.getAttribute("emplyId");
		 * model.addAttribute(sessionId);
		 */
		
		model.addAttribute("workTime", workTime);
		model.addAttribute("start",start);
		model.addAttribute("late",late);
		model.addAttribute("out",out);

		log.info("가져오는 이름 : {}", workTime);
		log.info("start 가져오는 값 : {}", start);
		log.info("late 가져오는 값 : {}", late);
		log.info("out 가져오는 값 : {}", out);
		//log.info("list 가져오는 값 : {}", list);
		
		return "workWay/work_time";
		
	};
	
	@GetMapping("/work_time_other")
	public String addWorkTimeOther() {
		return "workWay/work_time_other";
	}
}