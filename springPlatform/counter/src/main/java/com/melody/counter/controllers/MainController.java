package com.melody.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	private static final String COUNT = "count";
	@RequestMapping("/")	
	public String index(HttpSession session){
        Integer count = (Integer) session.getAttribute(COUNT);
        if(count==null) {
        	count = 1;
        } else {
        	count +=1;
        }
    	session.setAttribute("count", count);		
        return "index.jsp";
    }
	
	
	
	@RequestMapping("/counter")
	public String counter(Model model, HttpSession session) {
		Integer count = (Integer) session.getAttribute(COUNT);
		model.addAttribute("count",count);
		return "counter.jsp";
    }

}
