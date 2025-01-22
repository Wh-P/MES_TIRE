package com.web.mes_tire.mesemp;

public class Mesemp {
	private int empno;
	private int mgr;
	private String auth;
	private String job;
	private String ename;
	private String pnumber;
	private int pwd;
	private String dept;
	private int deptno;
	public Mesemp() {
		super();
		// TODO Auto-generated constructor stub
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
	
}
