package com.heroes.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heroes.main.models.Hero;
import com.heroes.main.models.Team;
import com.heroes.main.services.TeamService;

@RestController
public class RController {
	
	@Autowired
	private TeamService teamService;
	
	@GetMapping("/all-teams-test")
	public String all(){
		
		List<Team> myTeams = teamService.allTeams();
		
		System.out.println(myTeams.toString());
		
		Team firstTeam = myTeams.remove(0);
		
		System.out.println(firstTeam.getHeroes());
		
		// for(Team team : myTeams) {
		// 	System.out.println(team.getName());
		// }
		
		// for(Team team : myTeams) {
		//	System.out.println(team.getHeroes());
		//	for(Hero hero : team.getHeroes()) {
		//		System.out.println(hero.getName());
		//	}
		// }
		return "hello world!";
		//return myTeams;
	}
}
