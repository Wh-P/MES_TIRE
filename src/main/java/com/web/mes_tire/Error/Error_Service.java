package com.web.mes_tire.Error;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class Error_Service {

	@Autowired(required=false)
	private Error_Dao dao;
	
	public List<Error> getErrorList(Error sch){
	 return dao.getErrorList(sch);
	}
	public Error getError(int id) {
		return dao.ckId(id);
	}
	public String insertError(Error ins) {
		return dao.insertError(ins)>0?"등록성공":"등록실패";
	}
	public String updateError(Error upt) {
		return dao.updateError(upt)>0?"수정성공":"수정실패";
	}
	public String deleteError(int id) {
		return dao.deleteError(id)>0?"삭제성공":"삭제실패";
	}
	
	
	
	
}
