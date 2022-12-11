package com.gl.admindepartment;

import com.gl.superdepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment{

	public AdminDepartment() {
		// TODO Auto-generated constructor stub
	}
	
	public String departmentName() {
		return "Admin Department";
	}

	public String getTodaysWork() {
		
		return "Complete your documents submission";
	}
	
	public String getWorkDeadline() {
		
		return "Complete by EOD";
	}

}
