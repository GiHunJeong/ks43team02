package ks43team02.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WorkController{
	
	private static final Logger log = LoggerFactory.getLogger(WorkController.class);
	@RequestMapping("/workWay/work_time")
	@GetMapping("/workWay/work_time")
	public String work(HttpServletRequest time, Model model) {
		
		int toYear = 2022;
		int toMonth = 6;
		
		LocalDateTime toNow = LocalDateTime.now();
		toNow = toNow.withYear(toYear).withMonth(toMonth);	
		toNow = toNow.with(TemporalAdjusters.lastDayOfMonth());
		
		String lastDay = toNow.format(DateTimeFormatter.ofPattern("d"));
		System.out.println(toMonth + "월 마지막 일 > " + lastDay);
		
		String change = lastDay;
		int to = Integer.parseInt(change);
		System.out.println(to);
		List<String> list = new ArrayList<String>();
		for(int dayvalue =0; dayvalue <= to; ++dayvalue) {

			//System.out.println(i);
			//System.out.println(toYear + "년" + toMonth+ "월" + i);
			String yearmonthday = toYear + "년" + toMonth+ "월" + dayvalue;
			System.out.println(yearmonthday);
			list.add(yearmonthday);
			//뷰로 가기 전에 모델 객체에 셋팅 후 포워드 하면 된다.
			
			
			/*
			 * System.out.println(list.size() + "<- list.size()");
			 * 
			 * for(int dayvalue1 = 0; dayvalue1<list.size();dayvalue1++) { String
			 * getyearmonthday = list.get(dayvalue1); System.out.println(getyearmonthday +
			 * "<- getyearmonthday 배열에 있는 값 꺼내오기"); }
			 */
			  
			 
			
		}
	  
		model.addAttribute("list", list);
		log.info("가져오는 날짜들   :  {}",list);
		time.setAttribute("list", list);
		return "workWay/work_time";
		
		
	};
	@GetMapping("/workWay/work_time_management")
	public String workmanagement() {
		return "workWay/work_time_management";
	};
	@GetMapping("/workWay/work_setting")
	public String worksetting() {
		return "workWay/work_setting";
	};
	@GetMapping("/workWay/work_setting_list")
	public String worksettinglist() {
		return "workWay/work_setting_list";
	};
	
	
}