package com.web.mes_tire.Lot;

import java.util.Date;

public class Inbound {
	private int inboundid;
	private int orderno;
	private int materialid;
	private String unit;
	private int received;
	private int quantity;
	private Date indate;
	private String indateStr;
	private String manager;
	private String remarks;
	public Inbound() {
		// TODO Auto-generated constructor stub
	}
	public String getIndateStr() {
		return indateStr;
	}
	public void setIndateStr(String indateStr) {
		this.indateStr = indateStr;
	}
	public int getOrderno() {
		return orderno;
	}
	public void setOrderno(int orderno) {
		this.orderno = orderno;
	}
	public Inbound(int inboundid, int materialid, String unit, int received, int quantity, Date indate, String manager,
			String remarks) {
		super();
		this.inboundid = inboundid;
		this.materialid = materialid;
		this.unit = unit;
		this.received = received;
		this.quantity = quantity;
		this.indate = indate;
		this.manager = manager;
		this.remarks = remarks;
	}
	public int getInboundid() {
		return inboundid;
	}
	public void setInboundid(int inboundid) {
		this.inboundid = inboundid;
	}
	public int getMaterialid() {
		return materialid;
	}
	public void setMaterialid(int materialid) {
		this.materialid = materialid;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public int getReceived() {
		return received;
	}
	public void setReceived(int received) {
		this.received = received;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getIndate() {
		return indate;
	}
	public void setIndate(Date indate) {
		this.indate = indate;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
