package com.netjstechaccount.service;
import java.util.List;

import com.netjstechaccount.dto.Employee;

public interface EmployeeService {
	public Employee getEmployeeById(int empId);
	public List<Employee> getEmployees();
	public List<Employee> getEmployeeByDept();
	public void deleteEmployee(int empId);

}
