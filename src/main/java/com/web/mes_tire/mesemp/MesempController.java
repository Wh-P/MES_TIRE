package com.web.mes_tire.mesemp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
public class MesempController {
   @Autowired(required=false)
   private MesempService service;
   
   // http://localhost:3333/mesListHtml1
   @GetMapping("mesListHtml1")
   public String mesListHtml1(Mesemp sch,Model d) {
      d.addAttribute("mesListHtml",service.getMesemp(sch));
      return "mes\\mesListHtml1.html";
   }
 
   // http://localhost:3333/mesList   
   @RequestMapping("mesList")
   public ResponseEntity<?> mesList(Mesemp sch) {
      return ResponseEntity.ok(service.getMesemp(sch));
   }
   
   // http://localhost:3333/getMesAjax?empno=1010
   @GetMapping("getMesAjax")
   public ResponseEntity<?> getMesAjax(int empno) {
      return  ResponseEntity.ok(service.getMesempList(empno));
   }
   
   // http://localhost:3333/insertMesempAjax
   @PostMapping("insertMesempAjax")
   public ResponseEntity<?> insertMesempAjax(Mesemp ins,Model d) {
      //d.addAttribute("msg",service.insertMesemp(ins));
      return ResponseEntity.ok(service.insertMesemp(ins));
   }
   
   
   // http://localhost:3333/uptMesempAjax
   @PostMapping("uptMesempAjax")
   public ResponseEntity<?> uptMesempAjax(Mesemp upt,Model d) {
      //d.addAttribute("msg",service.updateMesemp(upt));
      //d.addAttribute("mesemp",service.getMesempList(upt.getEmpno()));
      return ResponseEntity.ok(service.updateMesemp(upt));
   }
   
   // http://localhost:3333/deleteMesemp
      @PostMapping("deleteMesemp")
      public ResponseEntity<?> deleteMesemp(@RequestParam("empno")int empno,Model d) {
         //d.addAttribute("msg",service.deleteMesemp(empno));
         return ResponseEntity.ok(service.deleteMesemp(empno));
      }
      

      
     //login ResponseEntity.ok(service.login(login))
         
   // http://localhost:3333/loginmes
      @RequestMapping("loginmes")
      public String login(Mesemp login, Model d, HttpServletRequest request) {		
          String page = "WEB-INF\\meslogin.jsp";
          if (login.getEmpno() != 0) {
              Mesemp mes = service.login(login);
              if (mes == null) { // 데이터 없음..
                  d.addAttribute("msg", "로그인 실패");
              } else {
                  HttpSession session = request.getSession();
                  session.setAttribute("sesMem", mes);
                  d.addAttribute("msg", "로그인 성공");
                  // 로그인 성공 시 mesList 페이지로 리다이렉트
                  page="redirect:/mesListHtml1";
              }
          }
          //  "mes\\mesListHtml1.html";
          return page;
      } 
      
   // http://localhost:3333/logoutmes
      @GetMapping("logoutmes")
      public String logoutmes(HttpServletRequest request) {
    	  HttpSession session= request.getSession();
  		session.removeAttribute("sesMem");
  		return "redirect:/loginmes";
      }
       	
      
}
