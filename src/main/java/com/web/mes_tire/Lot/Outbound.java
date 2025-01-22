package com.web.mes_tire.Lot;

import java.util.Date;

public class Outbound {
	private int outboundid;
	private int orderno;
	private int productid;
	private int ptype;
	public int getPtype() {
		return ptype;
	}
	public void setPtype(int ptype) {
		this.ptype = ptype;
	}
	private int send;
	private Date outdate;
	private String outdateStr;
	private int manager;
	private String remarks;
	public Outbound() {
		// TODO Auto-generated constructor stub
	}
	public Outbound(int outboundid, int orderno, int productid, int send, Date outdate, String outdateStr, int manager,
			String remarks) {
		this.outboundid = outboundid;
		this.orderno = orderno;
		this.productid = productid;
		this.send = send;
		this.outdate = outdate;
		this.outdateStr = outdateStr;
		this.manager = manager;
		this.remarks = remarks;
	}
	public int getOutboundid() {
		return outboundid;
	}
	public void setOutboundid(int outboundid) {
		this.outboundid = outboundid;
	}
	public int getOrderno() {
		return orderno;
	}
	public void setOrderno(int orderno) {
		this.orderno = orderno;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getSend() {
		return send;
	}
	public void setSend(int send) {
		this.send = send;
	}
	public Date getOutdate() {
		return outdate;
	}
	public void setOutdate(Date outdate) {
		this.outdate = outdate;
	}
	public String getOutdateStr() {
		return outdateStr;
	}
	public void setOutdateStr(String outdateStr) {
		this.outdateStr = outdateStr;
	}
	public int getManager() {
		return manager;
	}
	public void setManager(int manager) {
		this.manager = manager;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
