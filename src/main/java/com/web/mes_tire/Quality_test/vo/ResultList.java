package com.web.mes_tire.Quality_test.vo;

public class ResultList {
	private int orderno;
	private int trycnt;
	private int error1sum;
	private int error2sum;
	private double percentsum;
	private int totalyield;
	public ResultList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResultList(int orderno, int trycnt, int error1sum, int error2sum, double percentsum, int totalyield) {
		super();
		this.orderno = orderno;
		this.trycnt = trycnt;
		this.error1sum = error1sum;
		this.error2sum = error2sum;
		this.percentsum = percentsum;
		this.totalyield = totalyield;
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
	public int getError1sum() {
		return error1sum;
	}
	public void setError1sum(int error1sum) {
		this.error1sum = error1sum;
	}
	public int getError2sum() {
		return error2sum;
	}
	public void setError2sum(int error2sum) {
		this.error2sum = error2sum;
	}
	public double getPercentsum() {
		return percentsum;
	}
	public void setPercentsum(double percentsum) {
		this.percentsum = percentsum;
	}
	public int getTotalyield() {
		return totalyield;
	}
	public void setTotalyield(int totalyield) {
		this.totalyield = totalyield;
	}

	

}
