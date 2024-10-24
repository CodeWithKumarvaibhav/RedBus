package com.employeemanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagement.entity.Employee;
import com.employeemanagement.repository.EmployeeRepository;
@Service
public class ContractEmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository empoyeerepository;

	@Override
	public void saveEmployee(Employee emplyee) {

		if (emplyee.getType().equals("c")) {

			emplyee.setLeaveBalence(15);

		}
		empoyeerepository.save(emplyee);
	}

	@Override
	public void deleteEmployee(int eId) {

		empoyeerepository.deleteById(eId);

	}

	@Override
	public Employee getEmployee(int eId) {

		return empoyeerepository.findById(eId).get();
	}

}
