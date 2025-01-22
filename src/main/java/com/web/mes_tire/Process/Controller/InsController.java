package com.web.mes_tire.Process.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.mes_tire.Process.Service.InsService;
import com.web.mes_tire.Process.vo.Instruction;

@Controller
public class InsController {

	@Autowired
	private InsService service;
	
	// http://localhost:3333/board
    @RequestMapping("board")
    public String getBoardList(Model d) {
       
        d.addAttribute("board", service.getBoardList());
        return "Process\\INSTRUCTION2.html";
    }
	
    
    // http://localhost:3030/ajaxBoardList
    @GetMapping("ajaxBoardList")
    public ResponseEntity<?> ajaxBoardList() {
        return ResponseEntity.ok(service.getBoardList());
    }
    
    // http://localhost:3030/insertBoard
    @RequestMapping("insertBoard")
    public String insertBoard(Instruction ins, Model d) {
       
        d.addAttribute("board", service.insertBoard(ins));
        return "Process\\INSTRUCTION2.html";
    }
    
    
    
 // http://localhost:3030/updateBoard2
    @RequestMapping("updateBoard2")
    public String updateBoard(Instruction upt, Model d) {
       
        d.addAttribute("upt", service.updateBoard(upt));
        d.addAttribute("upt", service.idSerach(upt.getId()));
        
        return "Process\\INSTRUCTION2.html";
    }
    
 // http://localhost:3030/idSearch?id=5
    @RequestMapping("idSearch")
    public String idSearch(@RequestParam(value="id", 
			defaultValue="0") int id, Model d) {
    	
        
        return "Process\\INSTRUCTION2.html";
    }
    
    // http://localhost:3030/idSearchAjax?id=2
    @GetMapping("idSearchAjax")
    public ResponseEntity<?> getAjaxdetail(@RequestParam(value="id", 
			defaultValue="0") int id) {
    	
        return ResponseEntity.ok(service.idSerach(id));
    }
    
    
    	// http://localhost:3030/springweb/deleteBoard
 		@RequestMapping("deleteBoard")
 		public String deleteBoard(@RequestParam("id") int id, Model d) {
 			
 			d.addAttribute("msg", service.deleteBoard(id));
 			
 			return "Process\\INSTRUCTION2.html";
 		}	
    
    
}
