package com.netjstechaccount.service;
import java.util.List;

import com.netjstechaccount.dao.EmployeeDao;
import com.netjstechaccount.dto.Employee;

public  class EmployeeServiceImpl implements EmployeeService{ 
		EmployeeDao empDao; 
		public EmployeeServiceImpl (EmployeeDao empDao) { 
			this.empDao = empDao;
	}
 public Employee getEmployeeById(int empId) { 
	Employee emp = empDao.findEmployeeById(empId);
     return emp;

	}

	public List<Employee> getEmployees() { 
		System.out.println("Service- In get Employees");
		List<Employee> empList = empDao.getEmployees();
         return empList;

}
	public List<Employee> getEmployeeByDept() {
		return null;
	
	}

@Override
	public void deleteEmployee(int EmpId) {
}
}

