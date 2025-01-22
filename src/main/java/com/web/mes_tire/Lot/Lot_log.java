package com.web.mes_tire.Lot;

public class Lot_log {
	private String label;
	private int tot_in;
	private int tot_out;
	public Lot_log() {
		// TODO Auto-generated constructor stub
	}
	public Lot_log(String label, int tot_in, int tot_out) {
		this.label = label;
		this.tot_in = tot_in;
		this.tot_out = tot_out;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public int getTot_in() {
		return tot_in;
	}
	public void setTot_in(int tot_in) {
		this.tot_in = tot_in;
	}
	public int getTot_out() {
		return tot_out;
	}
	public void setTot_out(int tot_out) {
		this.tot_out = tot_out;
	}
	
}
