package com.employeemanagement.service;

import com.employeemanagement.entity.Employee;

public interface EmployeeService {
	
	public void saveEmployee(Employee emplyee);
	public void deleteEmployee(int eId);
	public Employee getEmployee (int eId);

}
