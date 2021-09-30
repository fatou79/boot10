package com.fatou.Springboot10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
//	@RequestMapping(value = "/login")
//	@ResponseBody
//	public String TodayisThusday() {
//		return "Tomorrow is friday";
//	}
	
	@RequestMapping(value = "/login")
	public String TodayisThusday(@RequestParam String name, ModelMap model) {
		model.put("name",name);
		return "login";
	}


}
