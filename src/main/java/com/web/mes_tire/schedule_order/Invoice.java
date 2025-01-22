package com.web.mes_tire.schedule_order;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Invoice {

//	  invno varchar2(10) PRIMARY KEY NOT null,   
//	   invemail varchar2(50),
//	   inv_startdate varchar2(50),
//	   inv_enddate varchar2(50),
//	   productid number(10),
//	   invcnt number(10),
//	   invprice number(10,2),
//	   empno number(4) NOT null,
	
	private String invno;  //발주번호
	private String invemail; //이메일
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date inv_startdate; //발주일자
	// 보낼땐 이걸로
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date inv_enddate; // 납기일
	private int productid;  // 완제품아이디
	private String pname;  // 완제품명
	private int invcnt;  // 수량
	private double invprice; // 단가
	private int empno;
	//불러올땐 SimpleDateFormat
	private static final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	
	
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getInvno() {
		return invno;
	}
	public void setInvno(String invno) {
		this.invno = invno;
	}
	public String getInvemail() {
		return invemail;
	}
	public void setInvemail(String invemail) {
		this.invemail = invemail;
	}
	public String getInv_startdate() {
		  if (this.inv_startdate == null) {
		        return null; // 기본값을 반환하거나 적절한 처리를 추가
		    }
		return formatter.format(inv_startdate);
	}
	public void setInv_startdate(Date inv_startdate) {
		this.inv_startdate = inv_startdate;
	}
	public String getInv_enddate() {
		  if (this.inv_enddate == null) {
		        return null; // 기본값을 반환하거나 적절한 처리를 추가
		    }
		return formatter.format(inv_enddate);
	}
	public void setInv_enddate(Date inv_enddate) {
		this.inv_enddate = inv_enddate;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getInvcnt() {
		return invcnt;
	}
	public void setInvcnt(int invcnt) {
		this.invcnt = invcnt;
	}
	public double getInvprice() {
		return invprice;
	}
	public void setInvprice(double invprice) {
		this.invprice = invprice;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public int getEmpno() {
		return empno;
	}

	public Invoice(String invno, String invemail, Date inv_startdate, Date inv_enddate, int productid, String pname,
			int invcnt, double invprice, int empno) {
		super();
		this.invno = invno;
		this.invemail = invemail;
		this.inv_startdate = inv_startdate;
		this.inv_enddate = inv_enddate;
		this.productid = productid;
		this.pname = pname;
		this.invcnt = invcnt;
		this.invprice = invprice;
		this.empno = empno;
	}
	public Invoice() {
		super();
	}

	
	
	
}
