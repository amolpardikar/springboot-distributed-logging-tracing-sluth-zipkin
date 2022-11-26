package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CommonUtil;
@Controller
public class AppController {

	@GetMapping("/")
	public String viewHomePage(Model model) {
		
		String appName = CommonUtil.getAppName();
		model.addAttribute("appName", appName);
		System.out.println("IN the controller ->"+model.getAttribute("appName"));
		return "index";
	}
}
