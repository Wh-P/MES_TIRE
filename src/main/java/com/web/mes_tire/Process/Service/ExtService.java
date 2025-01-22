package com.web.mes_tire.Process.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.mes_tire.Process.Dao.ExtDao;
import com.web.mes_tire.Process.vo.Ext;


@Service
public class ExtService {
	
	@Autowired
	private ExtDao dao;
	
	public List<Ext> getList() {

		return dao.getList();
	} // 전체 리스트 정보

	
	public List<Ext> getListNo() {

		return dao.getListNo();
	} // 전체 리스트 정보 + 일련번호
	
	
	// list에서 상세 조회

		public Ext getDetail(int line) {
			dao.CntUpdate(line);
			return dao.getDetail(line);
		} // 라인 번호(line)로 조회
	


	// 새로 고침시 생산량 카운트 업
	public Ext getDetailCnt(int line) {
		dao.CntUpdate(line);
		return dao.getDetail(line);
	} // 라인으로 조회시 생산량(cnt) 카운트 업

	
	public String insertPro(Ext rm) {
		return dao.insertPro(rm)>0?"등록성공":"등록실패";
	}
	
	   
}
