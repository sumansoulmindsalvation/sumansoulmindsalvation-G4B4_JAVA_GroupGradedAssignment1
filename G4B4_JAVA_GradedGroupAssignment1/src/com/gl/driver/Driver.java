package com.gl.driver;

import com.gl.admindepartment.AdminDepartment;
import com.gl.hrdepartment.HrDepartment;
import com.gl.techdepartment.TechDepartment;

public class Driver {

	public Driver() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]) {
		
		HrDepartment hr = new HrDepartment();
		TechDepartment techDept = new TechDepartment();
		AdminDepartment adminDept = new AdminDepartment();
		
		
		System.out.println("\nWelcome to "+adminDept.departmentName());
		System.out.println(adminDept.getTodaysWork());
		System.out.println(adminDept.getWorkDeadline());
		System.out.println(adminDept.isTodayAHoliday());
		
		System.out.println("\nWelcome to "+hr.departmentName());
		System.out.println(hr.departmentName());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.doActivity());
		System.out.println(hr.isTodayAHoliday());
		
		System.out.println("\nWelcome to "+techDept.departmentName());
		System.out.println(techDept.departmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(techDept.getTechStackInformation());
		System.out.println(techDept.isTodayAHoliday());
		
	

		
		
	}

}
