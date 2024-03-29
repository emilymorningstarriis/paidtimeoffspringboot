package com.riis.app;

import java.sql.Date;

public class NewRequestModel {
	private Date startDate;
	private Date endDate;
	private int status=2;
	private int employeeId=0;
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		//adding one day since database was always making it the previous day
		endDate.setTime(endDate.getTime()+86400000);
		this.endDate = endDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		//adding one day since database was always making it the previous day
		startDate.setTime(startDate.getTime()+86400000);
		this.startDate = startDate;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
