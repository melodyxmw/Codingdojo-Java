package com.example.week2.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class BonusController {
	
	@RequestMapping("/example")
	public String show(){
		return "this is a differernt route!";
		
	}
}
