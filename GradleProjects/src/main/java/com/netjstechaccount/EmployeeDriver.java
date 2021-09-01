package com.netjstechaccount;

import java.util.List;

import com.netjstechaccount.dao.EmployeeDao;
import com.netjstechaccount.dao.EmployeeDaoImpl;
import com.netjstechaccount.dto.Employee;
import com.netjstechaccount.service.EmployeeService;
import com.netjstechaccount.service.EmployeeServiceImpl;

public class EmployeeDriver {
	Employee emp;
	public static void main(String[] args) {

		EmployeeDao employeeDao = new EmployeeDaoImpl();
        EmployeeService employeeService = new EmployeeServiceImpl(employeeDao);

		List<Employee> empList = employeeService.getEmployees();
		System.out.println("Back with Employee List-  "+empList.size());
		for (Employee employee: empList) {
			System.out.println(employee);
		}

		}

		// Get Employee by Id

		//Employee emp = employeeService.getEmployeeById(1);

}