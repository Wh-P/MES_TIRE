package com.web.mes_tire.Process.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.mes_tire.Process.Service.ExtService;
import com.web.mes_tire.Process.Service.LogService;
import com.web.mes_tire.Process.vo.Exception_log;
import com.web.mes_tire.Process.vo.Ext;


@Controller
public class ExtController {
	
	@Autowired(required = false)
	private ExtService service;
	

		
		// http://localhost:3333/getDetail
	    @RequestMapping("getDetail")
	    public String getDetail(@RequestParam(value="line", 
				defaultValue="0") int line,Model d) {
	    
	        return "Process\\detail.html";
	    }

	    
	    // http://localhost:3030/getAjaxdetail
	    @GetMapping("getAjaxdetail")
	    public ResponseEntity<?> getAjaxdetail(@RequestParam(value="line", 
				defaultValue="0") int line) {
	        return ResponseEntity.ok(service.getDetail(line));
	    }
	    
	    // http://localhost:3333/Ajaxrandom
	    @GetMapping("Ajaxrandom")
	    public ResponseEntity<?> Ajaxrandom() {
	        return ResponseEntity.ok(service.getList());
	    }
	    
	    
	    	// http://localhost:7080/springweb/insertPro
	 		@RequestMapping("insertPro")
	 		public String insertList2(Ext rm, Model d) {
	 			d.addAttribute("msg",service.insertPro(rm));
	 			
	 			return "Process\\monitoring.html";
	 		}
	    
	    
	    
	 // http://localhost:3030/AjaxListNo
//	    @GetMapping("AjaxListNo")
//	    public ResponseEntity<?> AjaxListNo() {
//	        return ResponseEntity.ok(service.getListNo());
//	    } // 일련번호 + 혼합 리스트 출력
	    
	 		
		// http://localhost:3333/color
		@GetMapping("color")
		public String color() {
			return "Process\\monitoring.html";
		}
	 
			@Autowired(required = false)
	 		private LogService Lservice;
	 		// 예외 상황 로그 테이블 데이터를 가져오기
	 		// 의존성 주입
	 		
	 		
	 		@ModelAttribute("LList")
	 		public List<Exception_log> getList3(){
	 			return Lservice.getList3();
	 		} // 로그 테이블 전체 출력

	 		
		
	 	
}
