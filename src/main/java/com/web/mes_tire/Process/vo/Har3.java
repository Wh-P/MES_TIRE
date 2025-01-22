package com.web.mes_tire.Process.vo;

import java.util.Date;
// 공정2 경화 : 
public class Har3 {
	private int id; // 1
	private String process_name; // 2
	private int invno; // 3 발주서 조인
	private double mass; // 4 고무 길이당 질량
	private double radius; // 5 드럼 반경
	private double area; // 6 면적
	
	private double tension; // 7 텐션
	private double pressure; // 8 압력
	private double pressureRange; // 9 압력 범위 랜덤
	
	private int cnt; // 10 생산계획 조인
	private String startdte1; // 11
	private String enddte1; // 12
	private int typeno; // 13 이상 상황 로그 조인
	private int line; // 14
	
	
// 이상 상황 로그 테이블 :
//  private int id; 
//  private String process_name; 
    private String exception_type; // 15
    private Date logged_at; // 16
    
    private Date inv_startdate; // 17
    private Date inv_enddate; // 18 
	public Har3() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Har3(int id, String process_name, int invno, double mass, double radius, double area, double tension,
			double pressure, double pressureRange, int cnt, String startdte1, String enddte1, int typeno, int line,
			String exception_type, Date logged_at, Date inv_startdate, Date inv_enddate) {
		super();
		this.id = id;
		this.process_name = process_name;
		this.invno = invno;
		this.mass = mass;
		this.radius = radius;
		this.area = area;
		this.tension = tension;
		this.pressure = pressure;
		this.pressureRange = pressureRange;
		this.cnt = cnt;
		this.startdte1 = startdte1;
		this.enddte1 = enddte1;
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
	public double getMass() {
		return mass;
	}
	public void setMass(double mass) {
		this.mass = mass;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getTension() {
		return tension;
	}
	public void setTension(double tension) {
		this.tension = tension;
	}
	public double getPressure() {
		return pressure;
	}
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	public double getPressureRange() {
		return pressureRange;
	}
	public void setPressureRange(double pressureRange) {
		this.pressureRange = pressureRange;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getStartdte1() {
		return startdte1;
	}
	public void setStartdte1(String startdte1) {
		this.startdte1 = startdte1;
	}
	public String getEnddte1() {
		return enddte1;
	}
	public void setEnddte1(String enddte1) {
		this.enddte1 = enddte1;
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
