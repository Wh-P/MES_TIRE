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

import com.web.mes_tire.Process.Service.HarService;
import com.web.mes_tire.Process.Service.LogService;
import com.web.mes_tire.Process.vo.Exception_log;
import com.web.mes_tire.Process.vo.Har3;

@Controller
public class HarController {


	@Autowired(required = false)
	private HarService service;
	
	// 시각화 페이지에서 클릭시 공정 상세 정보 확인하기
		// line(라인 식별번호)로 상세 확인
		
		// http://localhost:3030/getDetail2
	    @RequestMapping("getDetail2")
	    public String getDetail2(@RequestParam(value="line", 
				defaultValue="0") int line,Model d) {
	    
	        return "Process\\detail2.html";
	    }

	    
	    // http://localhost:3030/getAjaxdetail2
	    @GetMapping("getAjaxdetail2")
	    public ResponseEntity<?> getAjaxdetail(@RequestParam(value="line", 
				defaultValue="0") int line) {
	        return ResponseEntity.ok(service.getDetail2(line));
	    }
	    
	    // http://localhost:3030/Ajaxrandom2
	    @GetMapping("Ajaxrandom2")
	    public ResponseEntity<?> Ajaxrandom2() {
	        return ResponseEntity.ok(service.getList2());
	    }
	    
	 // http://localhost:7080/springweb/insertList2
		@RequestMapping("insertList2")
		public String insertList2(Har3 ins, Model d) {
			d.addAttribute("msg",service.insertList2(ins));
			
			return "Process\\monitoring2.html";
		}
	    
		// http://localhost:3030/color2
		@GetMapping("color2")
		public String color2() {
			return "Process\\monitoring2.html";
		}
	    
// http://localhost:3030/AjaxListNos
//	    @GetMapping("AjaxListNo")
//	    public ResponseEntity<?> AjaxListNo() {
//	        return ResponseEntity.ok(service.getListNo());
//	    } // 일련번호 + 리스트 출력
	    
	    
	 
			@Autowired(required = false)
	 		private LogService Lservice;
	 		// 예외 상황 로그 테이블 데이터를 가져오기
	 		// 의존성 주입
	 		
	 		
	 		@ModelAttribute("LList")
	 		public List<Exception_log> getList3(){
	 			return Lservice.getList3();
	 		} // 로그 테이블 전체 출력
	
	
}
