package com.web.mes_tire.Quality_test.vo;

public class Centertest {
	private int cnt;
	private double code;
	private double deviation;
	private double error_rate;
	public Centertest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Centertest(int cnt, double code, double deviation, double error_rate) {
		super();
		this.cnt = cnt;
		this.code = code;
		this.deviation = deviation;
		this.error_rate = error_rate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public double getCode() {
		return code;
	}
	public void setCode(double code) {
		this.code = code;
	}
	public double getDeviation() {
		return deviation;
	}
	public void setDeviation(double deviation) {
		this.deviation = deviation;
	}
	public double getError_rate() {
		return error_rate;
	}
	public void setError_rate(double error_rate) {
		this.error_rate = error_rate;
	}
	
	
}
