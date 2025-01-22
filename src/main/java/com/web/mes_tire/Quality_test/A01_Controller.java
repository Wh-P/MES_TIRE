package com.web.mes_tire.Quality_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.mes_tire.Quality_test.vo.Centertest;
import com.web.mes_tire.Quality_test.vo.ResultList;
import com.web.mes_tire.Quality_test.vo.Visualtest;




@Controller
public class A01_Controller {
	@Autowired(required=false)
	private A02_Service service;
	// http://localhost:3333/performancetest
	@RequestMapping("performancetest")
	public String performancetest() {
//		d.addAttribute("boardList", service.getBoardList(sch));
		return "Quality_test\\performancetest.html";
	}
 	// http://localhost:3333/visualtest
	@GetMapping("visualtest")
	public String visualtest(){
		return "Quality_test\\visualtest.html";
	}
	// http://localhost:3333/resultlist
	@GetMapping("resultlist")
	public String resultlist(){
		return "Quality_test\\result.html";
	}
	
 	// http://localhost:3333/centertest
	@GetMapping("centertest")
	public String centertest(){
		return "Quality_test\\centertest.html";
	
	}
 	// http://localhost:3333/insajaxvisualtestList
	@RequestMapping("insajaxvisualtestList")
	public ResponseEntity<?> ajaxvisualtestListins(Visualtest ins, Model d){
		//d.addAttribute("msg", service.insVisualtestList(ins));
		return ResponseEntity.ok(service.insVisualtestList(ins));
	}
	

	//-----------------------------------------------------------------
	public ResponseEntity<?> getPerformance_standardList(){
		return ResponseEntity.ok(service.getPerformance_standardList());
	}
 	// http://localhost:3333/ajaxvisualtestList
	@RequestMapping("ajaxvisualtestList")
	public ResponseEntity<?> ajaxvisualtestList(Visualtest sch){
		return ResponseEntity.ok(service.getVisualtestList());
	}

 	// http://localhost:3333/ajaxcentertest
	@RequestMapping("ajaxcentertest")
	public ResponseEntity<?> ajaxcentertest(Centertest sch){
		return ResponseEntity.ok(service.getCentertest());
	}
 	// http://localhost:3333/inscentertest
	@RequestMapping("inscentertest")
	public ResponseEntity<?> inscentertest(Centertest ins, Model d){
		//d.addAttribute("msg", service.insVisualtestList(ins));
		return ResponseEntity.ok(service.insCentertest(ins));
	}
 	// http://localhost:3333/ajaxresultlist
	@RequestMapping("ajaxresultlist")
	public ResponseEntity<?> ajaxresultlist(ResultList sch){
		return ResponseEntity.ok(service.getResultList());
	}
}
	

