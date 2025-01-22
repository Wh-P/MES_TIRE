package com.web.mes_tire.Process.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.mes_tire.Process.Dao.InsDao;
import com.web.mes_tire.Process.vo.Instruction;

@Service
public class InsService {

	@Autowired
	private InsDao dao;
	
	public List<Instruction> getBoardList(){
		return dao.getBoardList();
	}
	
	
	public String insertBoard(Instruction ins) {
		return dao.insertBoard(ins)>0?"등록 성공":"등록 실패";
	}
	
	public String updateBoard(Instruction upt) {
		return dao.updateBoard(upt)>0?"수정 성공":"수정 실패";
	}
	
	
	public String deleteBoard(int id) {
		return dao.deleteBoard(id)>0?"삭제 성공":"삭제 실패";
	}
	
	
	public Instruction idSerach(int id) {
		return dao.idSerach(id);
	}

	
}
