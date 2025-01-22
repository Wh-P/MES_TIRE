package com.web.mes_tire.Lot;

import java.util.Date;

public class Material {
	private int materialid;
	private String mname;
	private String unit;
	private int price;
	private int safety;
	private String supplier;
	private Date lastck;
	private int quantity;
	private int safenow;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getSafenow() {
		return safenow;
	}
	public void setSafenow(int safenow) {
		this.safenow = safenow;
	}
	public Material() {
		// TODO Auto-generated constructor stub
	}
	public Material(int materialid, String mname, String unit, int safety, String supplier, Date lastck) {
		super();
		this.materialid = materialid;
		this.mname = mname;
		this.unit = unit;
		this.safety = safety;
		this.supplier = supplier;
		this.lastck = lastck;
	}
	public int getMaterialid() {
		return materialid;
	}
	public void setMaterialid(int materialid) {
		this.materialid = materialid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public int getSafety() {
		return safety;
	}
	public void setSafety(int safety) {
		this.safety = safety;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public Date getLastck() {
		return lastck;
	}
	public void setLastck(Date lastck) {
		this.lastck = lastck;
	}
	
}
