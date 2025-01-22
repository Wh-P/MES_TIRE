package com.web.mes_tire.mesemp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MesempService {
	@Autowired(required=false)
	private MesempRepository dao;
	
	public Mesemp login(Mesemp login) {
		return dao.login(login);
	}
	public List<Mesemp> getMesListAll(){
		return dao.getMesListAll();
	}

	public List<Mesemp> getMesemp(Mesemp sch){
		if(sch.getJob()==null) sch.setJob("");
		if(sch.getEname()==null) sch.setEname("");
		sch.setJob("%"+sch.getJob()+"%");
		sch.setEname("%"+sch.getEname()+"%");
		return dao.getMesemp(sch);
	}
	public String insertMesemp(Mesemp ins) {
		return dao.insertMesemp(ins)>0?"등록성공":"등록실패";
	}
	public Mesemp getMesempList(int empno) {
		return dao.getMesempList(empno);
	}
	
	public String updateMesemp(Mesemp upt) {
		return dao.updateMesemp(upt)>0?"수정성공":"수정실패";
	}
	
	public String deleteMesemp(int empno) {
		return dao.deleteMesemp(empno)>0?"삭제성공":"삭제실패";
	}
}
