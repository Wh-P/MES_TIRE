package com.web.mes_tire.schedule_order;

import java.util.List;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class A02_Sc_Service {

	
	@Autowired(required = false)
	A03_Sc_Dao dao;
	
	
	// 1공정 총 생산량
	public List<Process_Yel> getYelByOne(Process_Yel yel){
		
		return dao.getYelOne(yel);
	}
	
	//2공정 총 생산량
	public List<Process_Yel> getYelByTwo(Process_Yel yel){
		
		return dao.getYelTwo(yel);
	}
	
	//불량 검출율, 총 생산량 
	public List<Process_Yel> getErrorAndTotal(Process_Yel yel){
		
		return dao.getErrorandTotalYel(yel);
	}
	
	//부자재 수량
	public List<Process_Yel> getMaterial(Process_Yel yel){
		
		return dao.getMaterial(yel);
	}
	
	public List<Invoice> getInvoiceList(Invoice ins){
		
		return dao.getInvoiceLists(ins);
	}
	

	public String insertInvoice(Invoice ins) {
		if(ins.getInvno() == null) {
			ins.setInvno(" ");
		}
		
		return dao.insertInvoice(ins)>0?"등록성공":"등록실패";
	}
	
	public List<Invoice> getInvoiceByinvno(Invoice ins) {
		
		return dao.getInvoiceByInvno(ins);
	}
	
	public String updateInvoice(Invoice ins) {
		
		return dao.updateInvoice(ins)>0?"수정성공":"수정실패";
	} 
	
    public String DeleteInvoice(Invoice ins) {
		
		return dao.DeleteInvoice(ins)>0?"삭제성공":"삭제실패";
	} 
    
    
    
	public List<Mesemp> getMesList(Mesemp mes){
		if(mes.getEmpno() == 0) mes.setEmpno(0);
		
		return dao.getMesempList(mes);
	}
	
    
	public List<Purorder> getPurorderLists(Purorder order){
		
		return dao.getPurorderLists(order);
	}
	
    public String insertPurorder(Purorder order){
		if(order.getPurno() ==null ) order.setPurno(" ");
		return dao.insertPurorder(order)>0?"등록성공":"등록실패";
	}
    
    public List<Purorder> getPurorderByPurno(Purorder order){
		
		return dao.getPurorderByPurno(order);
	}
    
    public String updatePurorder(Purorder order) {
    	
    	return dao.UpdatePurorder(order)>0?"수정성공":"수정실패";
    }
  public String DeletePurorder(Purorder order) {
    	
    	return dao.DeletePurno(order)>0?"삭제성공":"삭제실패";
    }
  
  
  public List<Calendar> getCallList(Calendar cal){
	  
	  return dao.getCalList(cal);
  }
  
  public List<Calendar> getCalListByInvoice(Calendar cal){
	   
	  List<Calendar> calendars = dao.getCalListByInvoice(cal);

      // 랜덤 색상 설정
      for (Calendar calendar : calendars) {
          calendar.setBackgroundColor("#96b477");
          calendar.setTextColor("#a01ad3");
      }

      return calendars;
  }
  
	public String insertCalList(Calendar cal) {

		return dao.insertCalendar(cal)>0? "등록성공":"등록실패";
	}
	
	public String uptCal(Calendar cal) {
		
		return dao.uptCalendar(cal)>0?"수정성공":"수정실패";
	}
	
	public String delCal(Calendar cal) {
		
		return dao.delCal(cal)>0?"삭제성공":"삭제실패";
		
	}
  
}



