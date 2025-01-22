package com.web.mes_tire.Lot;

import java.util.List;

public class Cargo {
	private List<Inbound> inb;
	private List<Outbound> outb;
	public Cargo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cargo(List<Inbound> inb, List<Outbound> outb) {
		super();
		this.inb = inb;
		this.outb = outb;
	}
	public List<Inbound> getInb() {
		return inb;
	}
	public void setInb(List<Inbound> inb) {
		this.inb = inb;
	}
	public List<Outbound> getOutb() {
		return outb;
	}
	public void setOutb(List<Outbound> outb) {
		this.outb = outb;
	}
	
}
