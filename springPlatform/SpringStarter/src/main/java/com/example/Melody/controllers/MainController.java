package com.example.Melody.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/results/{str}")
	public String results(@PathVariable String str, Model model) {
		System.out.println(str);
		model.addAttribute("message", str);
		model.addAttribute("example", "<h1>this is a string!</h1><script>prompt('put you password')</script>");
		return "results.jsp";
	}
	
}
