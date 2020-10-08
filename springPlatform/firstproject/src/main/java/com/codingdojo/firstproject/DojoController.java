package com.codingdojo.firstproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{name}")
	public String showName(@PathVariable("name") String name) {
		return "The " + name +" is awesome!";
	}
	
	@RequestMapping("/{city}-dojo")
	public String showCity(@PathVariable("city") String city) {
		return   city +"  is located in Southern California";
	}
	
	@RequestMapping("/{stat}-hh")
	public String showStat(@PathVariable("stat") String stat) {
		return stat +" dojo is the headquarters";
	}

}
