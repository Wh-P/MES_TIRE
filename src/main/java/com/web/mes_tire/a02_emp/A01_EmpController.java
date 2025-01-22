package com.web.mes_tire.a02_emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class A01_EmpController {
	@Autowired(required = false)
	private A02_EmpService service;

	// http://localhost:3333/empList
	@RequestMapping("empList")
	public String empList(Emp sch, Model d){
		d.addAttribute("empList", service.getEmpList(sch));
		return "WEB-INF\\a04_empList.jsp";
	}	
	// a02_emp\empList.html
	
	
	// http://localhost:3333/ajaxEmpList
	@RequestMapping("ajaxEmpList")
	public ResponseEntity<?> ajaxEmpList(Emp sch){
		return ResponseEntity.ok(service.getEmpList(sch));
	}		
	
}
