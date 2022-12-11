package com.gl.hrdepartment;

import com.gl.superdepartment.SuperDepartment;

public class HrDepartment extends SuperDepartment{

	public HrDepartment() {
		// TODO Auto-generated constructor stub
	}
	
	public String departmentName() {
		return "Hr Department";
	}

	public String getTodaysWork() {
		
		return "Fill todays timesheet and mark your attandance";
	}
	
	public String getWorkDeadline() {
		
		return "Complete by EOD";
	}
	
	public String doActivity() {
		
		return "Team lunch";
	}

}
