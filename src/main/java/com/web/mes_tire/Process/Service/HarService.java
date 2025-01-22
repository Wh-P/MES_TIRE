package com.web.mes_tire.Process.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.mes_tire.Process.Dao.HarDao;
import com.web.mes_tire.Process.vo.Har3;

@Service
public class HarService {

	@Autowired
	private HarDao dao;
	
	public List<Har3> getList2() {
		return dao.getList2();
	} // 전체 리스트 정보

//	public List<RM> getListNo() {
//
//		return dao.getListNo();
//	} // 전체 리스트 정보 + 일련번호
	
	// list에서 상세 조회
	public Har3 getDetail2(int line) {
			dao.CntUpdate2(line);
			return dao.getDetail2(line);
		} // 라인 번호(line)로 조회
	
	
	// 새로 고침시 생산량 카운트 업
	public Har3 getDetailCnt2(int line) {
		dao.CntUpdate2(line);
		return dao.getDetail2(line);
	} // 라인으로 조회시 생산량(cnt) 카운트 업
	
	
	
	public String insertList2(Har3 ins) {
		return dao.insertList2(ins)>0?"등록성공":"등록실패";
	}
	
	
	
}
