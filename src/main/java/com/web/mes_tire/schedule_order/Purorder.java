package com.web.mes_tire.schedule_order;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Purorder {
//	purno varchar2(50) PRIMARY KEY NOT null,
//	   puremail varchar2(50),
//	   purdate varchar2(50),
//	   deaddate varchar2(50),
//	   purid number(4),
//	   pursize number(20),
//	   purcnt number(10),
//	   purprice number(10,2),
//	   empno number(4) NOT null,
	
	private String purno;  //발주번호
	private String puremail; //이메일
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date purdate;  // 발주일자
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date deaddate;  // 납기일
	private int purid;   //부자재 아이디
	private String purname;   //부자재 명

	private int pursize;  // 부자재 사이즈
	private int purcnt;   // 수량
	private Double purprice; // 단가
	private int empno;  // 사원번호
	
	 private static final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	
	public String getPurname() {
		return purname;
	}
	public void setPurname(String purname) {
		this.purname = purname;
	}
	public String getPurno() {
		return purno;
	}
	public void setPurno(String purno) {
		this.purno = purno;
	}
	public String getPuremail() {
		return puremail;
	}
	public void setPuremail(String puremail) {
		this.puremail = puremail;
	}
	public String getPurdate() {
		return formatter.format(deaddate);
	}
	public void setPurdate(Date purdate) {
		this.purdate = purdate;
	}
	public String getDeaddate() {
		return formatter.format(deaddate);
	}
	public void setDeaddate(Date deaddate) {
		this.deaddate = deaddate;
	}
	public int getPurid() {
		return purid;
	}
	public void setPurid(int purid) {
		this.purid = purid;
	}
	public int getPursize() {
		return pursize;
	}
	public void setPursize(int pursize) {
		this.pursize = pursize;
	}
	public int getPurcnt() {
		return purcnt;
	}
	public void setPurcnt(int purcnt) {
		this.purcnt = purcnt;
	}
	public Double getPurprice() {
		return purprice;
	}
	public void setPurprice(Double purprice) {
		this.purprice = purprice;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public Purorder(String purno, String puremail, Date purdate, Date deaddate, int purid, String purname, int pursize,
			int purcnt, Double purprice, int empno) {
		super();
		this.purno = purno;
		this.puremail = puremail;
		this.purdate = purdate;
		this.deaddate = deaddate;
		this.purid = purid;
		this.purname = purname;
		this.pursize = pursize;
		this.purcnt = purcnt;
		this.purprice = purprice;
		this.empno = empno;
	}
	public Purorder() {
		super();
	}
	
	
	
	
}
