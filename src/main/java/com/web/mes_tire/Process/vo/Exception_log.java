package com.web.mes_tire.Process.vo;

import java.util.Date;
// 예외 상황 로그 :
public class Exception_log {

	 private int id;
	 private String process_name;
	 private String exception_type;
	 private Date logged_at;
	 private int typeno;
	 
	public Exception_log() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exception_log(int id, String process_name, String exception_type, Date logged_at, int typeno) {
		super();
		this.id = id;
		this.process_name = process_name;
		this.exception_type = exception_type;
		this.logged_at = logged_at;
		this.typeno = typeno;
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
	public String getException_type() {
		return exception_type;
	}
	public void setException_type(String exception_type) {
		this.exception_type = exception_type;
	}
	public Date getLogged_at() {
		return logged_at;
	}
	public void setLogged_at(Date logged_at) {
		this.logged_at = logged_at;
	}
	public int getTypeno() {
		return typeno;
	}
	public void setTypeno(int typeno) {
		this.typeno = typeno;
	}
}
