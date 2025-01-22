package com.web.mes_tire.Quality_test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.mes_tire.Quality_test.vo.Centertest;
import com.web.mes_tire.Quality_test.vo.CudVo;
import com.web.mes_tire.Quality_test.vo.Performance_standard;
import com.web.mes_tire.Quality_test.vo.ResultList;
import com.web.mes_tire.Quality_test.vo.Visualtest;



@Service
public class A02_Service {
	@Autowired(required = false)

	private A03_Dao dao;
	public List<Visualtest> getVisualtestList(){
		return dao.getVisualtest();
	}
	public List<Performance_standard> getPerformance_standardList(){
		return dao.getPerformance_standardList();
	}
	public List<Visualtest> getVisualtestList(Visualtest sch){
		return dao.getVisualtest();
	}
	
	public CudVo insVisualtestList(Visualtest ins) {
		return new CudVo(dao.insVisualtest(ins)>0?"등록성공":"등록실패",dao.getVisualtest());
	}
	public List<Centertest> getCentertest(){
		return dao.getCentertest();
	}
	
	public CudVo insCentertest(Centertest ins) {
		return new CudVo(dao.insCentertest(ins)>0?"등록성공":"등록실패",dao.getVisualtest());
	}
	public List<ResultList> getResultList(){
		return dao.getResultList();
	}

}
