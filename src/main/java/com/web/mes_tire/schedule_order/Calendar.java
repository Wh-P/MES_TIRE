package com.web.mes_tire.schedule_order;

import java.text.SimpleDateFormat;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Calendar {
	private int id;
	private String title;
	private String writer;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date start; // 날짜를 ISOString형태로 처리..
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date end;
	private String content;
	private String backgroundColor;
	private String textColor; 
	private boolean allDay; // allday number(1), 1==>true, 0==>false
	
	private static final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getStart() { //start 로 보낸다
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {  //end로 보내고
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getBackgroundColor() {
		return backgroundColor;
	}
	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	public String getTextColor() {
		return textColor;
	}
	public void setTextColor(String textColor) {
		this.textColor = textColor;
	}
	public boolean isAllDay() {
		return allDay;
	}
	public void setAllDay(boolean allDay) {
		this.allDay = allDay;
	}
	public Calendar() {
		super();
	}
	public Calendar(int id, String title, String writer, Date start, Date end, String content,
			String backgroundColor, String textColor, boolean allDay) {
		super();
		this.id = id;
		this.title = title;
		this.writer = writer;
		this.start = start;
		this.end = end;
		this.content = content;
		this.backgroundColor = backgroundColor;
		this.textColor = textColor;
		this.allDay = allDay;
	}
	
}
