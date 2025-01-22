package com.web.mes_tire.Lot;

public class Pro_type {
	private int ptype;
	private String pname;
	private int price;
	private int mat1;
	private int mat1_vol;
	private int mat2;
	private int mat2_vol;
	private int mat3;
	private int mat3_vol;
	private int quantity;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Pro_type() {
	}
	public Pro_type(int ptype, String pname, int price, int mat1, int mat1_vol, int mat2, int mat2_vol, int mat3,
			int mat3_vol) {
		this.ptype = ptype;
		this.pname = pname;
		this.price = price;
		this.mat1 = mat1;
		this.mat1_vol = mat1_vol;
		this.mat2 = mat2;
		this.mat2_vol = mat2_vol;
		this.mat3 = mat3;
		this.mat3_vol = mat3_vol;
	}
	public int getPtype() {
		return ptype;
	}
	public void setPtype(int ptype) {
		this.ptype = ptype;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMat1() {
		return mat1;
	}
	public void setMat1(int mat1) {
		this.mat1 = mat1;
	}
	public int getMat1_vol() {
		return mat1_vol;
	}
	public void setMat1_vol(int mat1_vol) {
		this.mat1_vol = mat1_vol;
	}
	public int getMat2() {
		return mat2;
	}
	public void setMat2(int mat2) {
		this.mat2 = mat2;
	}
	public int getMat2_vol() {
		return mat2_vol;
	}
	public void setMat2_vol(int mat2_vol) {
		this.mat2_vol = mat2_vol;
	}
	public int getMat3() {
		return mat3;
	}
	public void setMat3(int mat3) {
		this.mat3 = mat3;
	}
	public int getMat3_vol() {
		return mat3_vol;
	}
	public void setMat3_vol(int mat3_vol) {
		this.mat3_vol = mat3_vol;
	}
	
}
