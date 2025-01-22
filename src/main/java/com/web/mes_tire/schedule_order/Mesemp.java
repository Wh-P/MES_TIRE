package com.web.mes_tire.schedule_order;

public class Mesemp {
	
//			   empno number(4) PRIMARY KEY NOT null,
//			   mgr number(4),
//			   auth varchar2(50),
//			   job varchar2(50),
//			   ename varchar2(50),
//			   pnumber varchar2(100),
//			   pwd number(4),   
//			   dept varchar2(50),
//			   deptno number(10)    
			
     private int empno;
     private int mgr;
     private String auth;
     private String job;
     private String ename;
     private String pnumber;
     private int pwd;
     private String dept;
     private int deptno;
     
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getPnumber() {
		return pnumber;
	}
	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}
	public int getPwd() {
		return pwd;
	}
	public void setPwd(int pwd) {
		this.pwd = pwd;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public Mesemp(int empno, int mgr, String auth, String job, String ename, String pnumber, int pwd, String dept,
			int deptno) {
		super();
		this.empno = empno;
		this.mgr = mgr;
		this.auth = auth;
		this.job = job;
		this.ename = ename;
		this.pnumber = pnumber;
		this.pwd = pwd;
		this.dept = dept;
		this.deptno = deptno;
	}
	public Mesemp() {
		super();
	}
     
     
}
