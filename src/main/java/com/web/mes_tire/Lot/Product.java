package com.web.mes_tire.Lot;

import java.util.Date;

public class Product {
	private int productid;
	private String pname;
	private int ptype;
	public int getPtype() {
		return ptype;
	}
	public void setPtype(int ptype) {
		this.ptype = ptype;
	}
	private Date mandate;
	private String mandateStr;
	private Date expired;
	private String expiredStr;
	private String unit;
	private int manquan;
	private int quantity;
	private int price;
	private Date lastck;
	public Product() {
	}
	public String getMandateStr() {
		return mandateStr;
	}
	public void setMandateStr(String mandateStr) {
		this.mandateStr = mandateStr;
	}
	public String getExpiredStr() {
		return expiredStr;
	}
	public void setExpiredStr(String expiredStr) {
		this.expiredStr = expiredStr;
	}
	public Product(int productid, String pname, Date mandate, Date expired, String unit, int manquan, int quantity,
			int price, Date lastck) {
		super();
		this.productid = productid;
		this.pname = pname;
		this.mandate = mandate;
		this.expired = expired;
		this.unit = unit;
		this.manquan = manquan;
		this.quantity = quantity;
		this.price = price;
		this.lastck = lastck;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getMandate() {
		return mandate;
	}
	public void setMandate(Date mandate) {
		this.mandate = mandate;
	}
	public Date getExpired() {
		return expired;
	}
	public void setExpired(Date expired) {
		this.expired = expired;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public int getManquan() {
		return manquan;
	}
	public void setManquan(int manquan) {
		this.manquan = manquan;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getLastck() {
		return lastck;
	}
	public void setLastck(Date lastck) {
		this.lastck = lastck;
	}
	
}
