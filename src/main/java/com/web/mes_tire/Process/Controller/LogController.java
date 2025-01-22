package com.web.mes_tire.Process.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.mes_tire.Process.Service.LogService;

@Controller
public class LogController {

	
	@Autowired(required = false)
	private LogService service;
	
	//
	
	@RequestMapping("LList")
	public String LList(Model d) {
		d.addAttribute("LList", service.getList3());
		return "";
	}
		
		

	
}
