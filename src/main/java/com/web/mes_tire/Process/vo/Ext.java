package com.web.mes_tire.Process.vo;

import java.util.Date;
// 공정1단계 혼합 : 
public class Ext {
//	id NUMBER PRIMARY KEY,--공정 아이디 1
//	process_name varchar2(50),--공정명 2
//	order_number NUMBER, --발주번호 3
//	rubbera NUMBER,-- 고무A 4
//	rubberb NUMBER,-- 고무B 5
//	rubbera1 NUMBER(5,2),-- 고무A랜덤 범위 6
//	rubberb1 NUMBER(5,2),-- 고무B랜덤 범위 7
//	STARTDTE varchar2(100), -- 시작일 8
//	ENDDTE varchar2(100) -- 9
//  cnt number -- 10
//  typeno number -- 11
//  line number -- 12
// 이상 상황 로그 테이블:
//	  ID              NUMBER NOT null,			-- 공정아이디 13
//    PROCESS_NAME    VARCHAR2(50) NOT NULL, 	-- 공정명		14
//    EXCEPTION_TYPE  VARCHAR2(100) NOT NULL, 	-- 예외 유형  15
//    LOGGED_AT       TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- 예외 발생 시간 16
//    typeno number -- 예외 유형 번호 16
	
	private int id; // 1
    private String process_name; // 2
    private int invno; // 3
    private int rubbera; // 4
    private int rubberb; // 5
    private double rubbera1; // 6
    private double rubberb1; // 7
    private String startdte; // 8
    private String enddte; // 9
    private int cnt; // 10
    private int typeno; // 11 
    private int line; // 12
    
//    private int id;
//    private String process_name;
      private String exception_type; // 13
      private Date logged_at; // 14
//    private int typeno;
      
      private Date inv_startdate; // 15
      private Date inv_enddate; // 16   
	public Ext() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ext(int id, String process_name, int invno, int rubbera, int rubberb, double rubbera1, double rubberb1,
			String startdte, String enddte, int cnt, int typeno, int line, String exception_type, Date logged_at,
			Date inv_startdate, Date inv_enddate) {
		super();
		this.id = id;
		this.process_name = process_name;
		this.invno = invno;
		this.rubbera = rubbera;
		this.rubberb = rubberb;
		this.rubbera1 = rubbera1;
		this.rubberb1 = rubberb1;
		this.startdte = startdte;
		this.enddte = enddte;
		this.cnt = cnt;
		this.typeno = typeno;
		this.line = line;
		this.exception_type = exception_type;
		this.logged_at = logged_at;
		this.inv_startdate = inv_startdate;
		this.inv_enddate = inv_enddate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProcess_name() {
		return process_name;
	}
	public void setProcess_name(String process_name) {
		this.process_name = process_name;
	}
	public int getInvno() {
		return invno;
	}
	public void setInvno(int invno) {
		this.invno = invno;
	}
	public int getRubbera() {
		return rubbera;
	}
	public void setRubbera(int rubbera) {
		this.rubbera = rubbera;
	}
	public int getRubberb() {
		return rubberb;
	}
	public void setRubberb(int rubberb) {
		this.rubberb = rubberb;
	}
	public double getRubbera1() {
		return rubbera1;
	}
	public void setRubbera1(double rubbera1) {
		this.rubbera1 = rubbera1;
	}
	public double getRubberb1() {
		return rubberb1;
	}
	public void setRubberb1(double rubberb1) {
		this.rubberb1 = rubberb1;
	}
	public String getStartdte() {
		return startdte;
	}
	public void setStartdte(String startdte) {
		this.startdte = startdte;
	}
	public String getEnddte() {
		return enddte;
	}
	public void setEnddte(String enddte) {
		this.enddte = enddte;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getTypeno() {
		return typeno;
	}
	public void setTypeno(int typeno) {
		this.typeno = typeno;
	}
	public int getLine() {
		return line;
	}
	public void setLine(int line) {
		this.line = line;
	}
	public String getException_type() {
		return exception_type;
	}
	public void setException_type(String exception_type) {
		this.exception_type = exception_type;
	}
	public Date getLogged_at() {
		return logged_at;
	}
	public void setLogged_at(Date logged_at) {
		this.logged_at = logged_at;
	}
	public Date getInv_startdate() {
		return inv_startdate;
	}
	public void setInv_startdate(Date inv_startdate) {
		this.inv_startdate = inv_startdate;
	}
	public Date getInv_enddate() {
		return inv_enddate;
	}
	public void setInv_enddate(Date inv_enddate) {
		this.inv_enddate = inv_enddate;
	}
}
