package com.melody.hellohuman.controllers;



import java.time.LocalTime;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DispalyDateController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String showDate(Model model) {
		Date nowdate = new java.util.Date() ;
		String date = nowdate.toString();
		model.addAttribute("showdate",date);
		System.out.println(date);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String showTime(Model model) {
		LocalTime nowtime = LocalTime.now();
		System.out.println(nowtime);
		model.addAttribute("showtime",nowtime);
		return "time.jsp";
	}

}
