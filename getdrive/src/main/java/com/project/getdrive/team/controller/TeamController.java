package com.project.getdrive.team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeamController {

	@RequestMapping("teamMain.do")
	public String moveTeamMain() {
		return "team/teamMain";
	}
}
