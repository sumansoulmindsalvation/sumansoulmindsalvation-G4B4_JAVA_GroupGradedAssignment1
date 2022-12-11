package com.gl.techdepartment;

import com.gl.superdepartment.SuperDepartment;

public class TechDepartment extends SuperDepartment {

	public TechDepartment() {
		// TODO Auto-generated constructor stub
	}
	
	public String departmentName() {
		return "Tech Department";
	}

	public String getTodaysWork() {
		
		return "Complete coding of module 1";
	}
	
	public String getWorkDeadline() {
		
		return "Complete by EOD";
	}
	
	
	public String getTechStackInformation() {
		
		return "core java";
	}

}
