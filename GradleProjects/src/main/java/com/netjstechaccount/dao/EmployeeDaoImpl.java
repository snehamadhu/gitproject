package com.netjstechaccount.dao;
import java.time. LocalDate;
 import java.util.ArrayList;
  import java.util.List;
import com.netjstechaccount.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
 List<Employee> empList = new ArrayList<Employee>();

   public List<Employee> getEmployees() {

System.out.println("DAO- In get Employees");

Employee employee = new Employee();

employee.setEmpNo (1);

employee.setEmpName("Hemant");

employee.setHireDate (LocalDate.of(2018, 11, 22));

employee.setSalary(8000);

employee.setJob("Developer");

empList.add(employee);

employee = new Employee();

employee.setEmpNo (2);

employee.setEmpName("Varsha");

employee.setJob("Manager");

employee.setHireDate (LocalDate.of(2016, 07, 02));
employee.setSalary(10000);
empList.add(employee);
return empList;
   }
@Override
public List<Employee> findEmployeesByDept() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public Employee findEmployeeById(int empId) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void deleteEmployee(Employee emp) {
	// TODO Auto-generated method stub
	
}

}
