package com.web.mes_tire.Process.vo;

// 작업 지시 사항 : 
public class Instruction {

	private int id;
	private String process_name;
	private String instruction;
	private String safety_rules;
	private String created_by;
	public Instruction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Instruction(int id, String process_name, String instruction, String safety_rules, String created_by) {
		super();
		this.id = id;
		this.process_name = process_name;
		this.instruction = instruction;
		this.safety_rules = safety_rules;
		this.created_by = created_by;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProcess_name() {
		return process_name;
	}
	public void setProcess_name(String process_name) {
		this.process_name = process_name;
	}
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	public String getSafety_rules() {
		return safety_rules;
	}
	public void setSafety_rules(String safety_rules) {
		this.safety_rules = safety_rules;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	
}
