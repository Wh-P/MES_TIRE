package com.web.mes_tire.Quality_test.vo;

public class Visualtest {
	
//	--orderno trycnt, error1cnt, error2cnt, error3cnt;
	private int orderno;
	private int trycnt;
	private int error1cnt=0;
	private int error2cnt=0;
	private int error3cnt=0;
	public Visualtest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Visualtest(int orderno, int trycnt, int error1cnt, int error2cnt, int error3cnt) {
		super();
		this.orderno = orderno;
		this.trycnt = trycnt;
		this.error1cnt = error1cnt;
		this.error2cnt = error2cnt;
		this.error3cnt = error3cnt;
	}
	public int getOrderno() {
		return orderno;
	}
	public void setOrderno(int orderno) {
		this.orderno = orderno;
	}
	public int getTrycnt() {
		return trycnt;
	}
	public void setTrycnt(int trycnt) {
		this.trycnt = trycnt;
	}
	public int getError1cnt() {
		return error1cnt;
	}
	public void setError1cnt(int error1cnt) {
		this.error1cnt = error1cnt;
	}
	public int getError2cnt() {
		return error2cnt;
	}
	public void setError2cnt(int error2cnt) {
		this.error2cnt = error2cnt;
	}
	public int getError3cnt() {
		return error3cnt;
	}
	public void setError3cnt(int error3cnt) {
		this.error3cnt = error3cnt;
	}
	
	

}
