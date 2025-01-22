package com.web.mes_tire.schedule_order;

public class Process_Yel {

	private Integer total_cnt_one;
	private Integer total_cnt_two;
	private Double percentsum;
	private Integer totalyield;
	private String mname;
	private Integer total;
	
	public Process_Yel(Integer total_cnt_one, Integer total_cnt_two, Double percentsum, Integer totalyield,
			String mname, Integer total) {
		super();
		this.total_cnt_one = total_cnt_one;
		this.total_cnt_two = total_cnt_two;
		this.percentsum = percentsum;
		this.totalyield = totalyield;
		this.mname = mname;
		this.total = total;
	}



	public String getMname() {
		return mname;
	}



	public void setMname(String mname) {
		this.mname = mname;
	}



	public Integer getTotal() {
		return total;
	}



	public void setTotal(Integer total) {
		this.total = total;
	}






	public Double getPercentsum() {
		return percentsum;
	}



	public void setPercentsum(Double percentsum) {
		this.percentsum = percentsum;
	}



	public Integer getTotalyield() {
		return totalyield;
	}



	public void setTotalyield(Integer totalyield) {
		this.totalyield = totalyield;
	}


	public Integer getTotal_cnt_one() {
		return total_cnt_one;
	}



	public void setTotal_cnt_one(Integer total_cnt_one) {
		this.total_cnt_one = total_cnt_one;
	}



	public Integer getTotal_cnt_two() {
		return total_cnt_two;
	}



	public void setTotal_cnt_two(Integer total_cnt_two) {
		this.total_cnt_two = total_cnt_two;
	}



	public Process_Yel() {
		super();
	}
	
	
}
