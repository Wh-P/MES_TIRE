package com.web.mes_tire.Error;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Error_Controller {

	@Autowired(required=false)
	private Error_Service service;
	
	// http://localhost:3333/ErrorListHTML
	@GetMapping("ErrorListHTML")
	public String ErrorListHTML(){
			return "Error\\ErrorList.html";
		}
	// http://localhost:3333/ajaxErrorList
	@RequestMapping("ajaxErrorList")
	public ResponseEntity<?> ajaxErrorList(@ModelAttribute("error") 
							Error sch, Model d){
			return ResponseEntity.ok(service.getErrorList(sch));
		}	
	// http://localhost:3333/errorckIdajax?id=
	@GetMapping("errorckIdajax")
	public ResponseEntity errorckIdajax(@RequestParam("id") int id, Model d) {
		
		return ResponseEntity.ok(service.getError(id));
	}
	
	// http://localhost:3333/insertErrorajax
	@RequestMapping("insertErrorajax")
	public ResponseEntity<?> insertErrorajax(Error ins){
		return ResponseEntity.ok(service.insertError(ins));
	}
	// http://localhost:3333/updateErrorajax
	@RequestMapping("updateErrorajax")
	public ResponseEntity<?> updateErrorajax(Error upt){
		return ResponseEntity.ok(service.updateError(upt));
	}
	// http://localhost:3333/deleteErrorajax
	@RequestMapping("deleteErrorajax")
	public ResponseEntity<?> deleteErrorajax(
							@RequestParam("id") int id){
		return ResponseEntity.ok(service.deleteError(id));
	}
	
	
		
}
