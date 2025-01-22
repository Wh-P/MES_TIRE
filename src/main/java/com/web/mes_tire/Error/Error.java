package com.web.mes_tire.Error;

import java.util.Date;

public class Error{
	private int id;
	private String manager;
	private Date inspection;
	private String visual_in;
	private String mechanic;
	private String durabilit;
	public Error() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Error(int id, String manager, Date inspection, String visual_in, String mechanic, String durabilit) {
		super();
		this.id = id;
		this.manager = manager;
		this.inspection = inspection;
		this.visual_in = visual_in;
		this.mechanic = mechanic;
		this.durabilit = durabilit;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public Date getInspection() {
		return inspection;
	}
	public void setInspection(Date inspection) {
		this.inspection = inspection;
	}
	public String getVisual_in() {
		return visual_in;
	}
	public void setVisual_in(String visual_in) {
		this.visual_in = visual_in;
	}
	public String getMechanic() {
		return mechanic;
	}
	public void setMechanic(String mechanic) {
		this.mechanic = mechanic;
	}
	public String getDurabilit() {
		return durabilit;
	}
	public void setDurabilit(String durabilit) {
		this.durabilit = durabilit;
	}
	
	
	
	
	
}
