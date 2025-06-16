package com.adu.service.test;

import com.adu.overloading.Employee;
import com.adu.service.EmployeeService;

public class EmployeeServiceTest2 {

	public static void main(String[] args) {
		
//		EmployeeService emService = new EmployeeService();
		EmployeeService emService = EmployeeService.getInstance();
		EmployeeService emService2 = EmployeeService.getInstance();
		EmployeeService emService3 = EmployeeService.getInstance();
		
		emService.addEmployee(new Employee(7656, "James"));
		emService.addEmployee(new Employee(7644, "이이이"));
		
		System.out.println(emService); //참조 변수 뒤엔 toString() 생략되어있음 Reference variable
		System.out.println(emService2);
		System.out.println(emService3);
		System.out.println("======================================");
		System.out.println(emService.toString()); //
		System.out.println(emService2.toString());
		System.out.println(emService3.toString());
	}

}
