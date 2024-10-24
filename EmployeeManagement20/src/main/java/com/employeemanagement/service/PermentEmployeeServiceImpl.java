package com.employeemanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagement.entity.Employee;
import com.employeemanagement.repository.EmployeeRepository;

@Service
public class PermentEmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeerepository;

	@Override
	public void saveEmployee(Employee employee) {

		
		if (employee.getType().equals("p")) {
			employee.setLeaveBalence(40);
			
		}

		employeerepository.save(employee);

	}

	@Override
	public void deleteEmployee(int eId) {
		employeerepository.deleteById(eId);

	}

	@Override
	public Employee getEmployee(int eId) {

		return employeerepository.findById(eId).get();
	}

}
