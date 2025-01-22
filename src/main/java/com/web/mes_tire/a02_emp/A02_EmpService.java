package com.web.mes_tire.a02_emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A02_EmpService {
	@Autowired(required = false)
	private A03_EmpDao dao;
	
	public List<Emp> getEmpList(Emp sch){
		if(sch.getEname()==null) sch.setEname("");
		if(sch.getJob()==null) sch.setJob("");
		 sch.setEname("%"+sch.getEname()+"%");
		 sch.setJob("%"+sch.getJob()+"%");
		return dao.getEmpList(sch);
	}
}
