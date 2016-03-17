package com.alibaba.ppm.process.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectInfoAction {
	@RequestMapping("/projectInfo")
	public String Hello(){
		System.out.println("hello");
		return "projectInfo";
	}
}
