package com.web.mes_tire.schedule_order;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;





@Controller
public class A01_ScController {
   
	@Autowired(required = false)
	A02_Sc_Service service;
	
	// http://localhost:3333/SO_Controller
	@RequestMapping("SO_Controller")
	public String SC_Controller(Model d,Process_Yel yel) {
		
		  d.addAttribute("material",service.getMaterial(yel));
		  d.addAttribute("tot",service.getErrorAndTotal(yel));
		  d.addAttribute("one",service.getYelByOne(yel));
		  d.addAttribute("two",service.getYelByTwo(yel));

		return "WEB-INF/Schedule_Order.jsp";
	}
	
	// http://localhost:3333/SO_Scheduler
	@RequestMapping("SO_Scheduler")
	public String SO_Scheduler() {
	
		return "a04_calendar\\index.html";
	}
	
	// http://localhost:3333/SO_invoice
	@RequestMapping("SO_invoice")
	public String SO_invoice() {
		return "Schedule_Order\\invoice.html";
	}
	
	// http://localhost:3333/SO_purorder
	@GetMapping("SO_purorder")
	public String SO_purorder() {
		return "Schedule_Order/purorder.html";
	}
	// http://localhost:3333/getInvoiceList
	@GetMapping("getInvoiceList")
	public ResponseEntity<?> getInvoiceList(Invoice ins){
		
		return ResponseEntity.ok(service.getInvoiceList(ins));
	}
  
// -----------scheduler
	// http://localhost:3333/getProcess_Yel_One
	@RequestMapping("getProcess_Yel_One")
	public ResponseEntity<?> getProcess_Yel_One(Process_Yel yel){
	    return ResponseEntity.ok(service.getYelByOne(yel));
	}
	// http://localhost:3333/getProcess_Yel_Two
	@RequestMapping("getProcess_Yel_Two")
	public ResponseEntity<?> getProcess_Yel_Two(Process_Yel yel){
	    return ResponseEntity.ok(service.getYelByTwo(yel));
	}
	
// -----------invoice
	
	
	// http://localhost:3333/InsertInvoiceList
	@RequestMapping("InsertInvoiceList")
	public ResponseEntity<?> InsertInvoiceList(Invoice ins){
	    return ResponseEntity.ok(service.insertInvoice(ins));
	}

	// http://localhost:3333/getInvoiceByInvno
		@RequestMapping("getInvoiceByInvno")
			public ResponseEntity<?> getInvoiceByInvno(Invoice ins){
				    return ResponseEntity.ok(service.getInvoiceByinvno(ins));
		}
	
	// http://localhost:3333/UpdateInvoice
	@RequestMapping("UpdateInvoice")
		public ResponseEntity<?> UpdateInvoice(Invoice ins){
			    return ResponseEntity.ok(service.updateInvoice(ins));
	}
	
	// http://localhost:5050/DelInvoice
		@RequestMapping("DelInvoice")
			public ResponseEntity<?> DelInvoice(Invoice ins){
				    return ResponseEntity.ok(service.DeleteInvoice(ins));
		}
		
		
		
		// http://localhost:3333/GetMesempList
		@RequestMapping("GetMesempList")
		public ResponseEntity<?> GetMesempList(Mesemp mes){
			    return ResponseEntity.ok(service.getMesList(mes));
		}
		
		
 //---------- purorder
		
		// http://localhost:3333/getPurorderList
		@GetMapping("getPurorderList")
		public ResponseEntity<?> getPurorderList(Purorder ins){
			
			return ResponseEntity.ok(service.getPurorderLists(ins));
		}
		
		// http://localhost:3333/getPurorderListByPurno
		@GetMapping("getPurorderListByPurno")
		public ResponseEntity<?> getPurorderListByPurno(Purorder ins){
			
			return ResponseEntity.ok(service.getPurorderByPurno(ins));
		}
		
		// http://localhost:3333/insertPurorder
		@RequestMapping("insertPurorder")
		public ResponseEntity<?> insertPurorder(Purorder ins){
			return ResponseEntity.ok(service.insertPurorder(ins));
		}	
		
		// http://localhost:3333/UpdatePurorder
		@RequestMapping("UpdatePurorder")
		public ResponseEntity<?> UpdatePurorder(Purorder ins){
			return ResponseEntity.ok(service.updatePurorder(ins));
		}
		// http://localhost:3333/DeletePurorder
		@RequestMapping("DeletePurorder")
		public ResponseEntity<?> DeletePurorder(Purorder ins){
			return ResponseEntity.ok(service.DeletePurorder(ins));
		}	
		
		
 //--------------schedule
		
		// http://localhost:3333/getCalListByInvoice
		@RequestMapping("getCalListByInvoice")
		public ResponseEntity<?> getCalListByInvoice(Calendar cal){
		    return ResponseEntity.ok(service.getCalListByInvoice(cal));
		}
		
	// http://localhost:3333/getCalList
		@RequestMapping("getCalList")
	public ResponseEntity<?> getCalList(Calendar cal) {
		return ResponseEntity.ok(service.getCallList(cal));
		}
		
		// http://localhost:3333/insertCalList
			@RequestMapping("insertCalList")
		public ResponseEntity<?> insertCalList(Calendar cal) {
			return ResponseEntity.ok(service.insertCalList(cal));
			}
		
		// http://localhost:3333/uptCal
		@RequestMapping("uptCal")
		public ResponseEntity<?> uptCal(Calendar cal){
			return ResponseEntity.ok(service.uptCal(cal));
		}
				
		// http://localhost:3333/delCal
		@RequestMapping("delCal")
		public ResponseEntity<?> delCal(Calendar cal){
			return ResponseEntity.ok(service.delCal(cal));
		}
		
}
