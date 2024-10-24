package com.employeemanagement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.entity.Employee;
import com.employeemanagement.service.EmployeeService;

@RestController
public class EmpolyeeController {

	@Autowired
	ApplicationContext applicationcontext;

	// EmployeeService employeeservice; there is to class
	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employee employee) {

		if (employee.getType().equals("p")) {
			EmployeeService es = (EmployeeService) applicationcontext.getBean("permentEmployeeServiceImpl");
			es.saveEmployee(employee);
		}
		

		if (employee.getType().equals("c")) {

			EmployeeService es = (EmployeeService) applicationcontext.getBean("contractEmployeeServiceImpl");
			es.saveEmployee(employee);
		}

		// employeeservice.saveEmployee(employee);

		return "Done";

	}
	

	@DeleteMapping("/deleteEmp/{eId}/{type}")
	public String deleteEmployee(@PathVariable("eId") int eId, @PathVariable("type") String type) {
		
		if (type.equals("p")) {

			EmployeeService es = (EmployeeService) applicationcontext.getBean("permentEmployeeServiceImpl");
			es.deleteEmployee(eId);
		}

		if (type.equals("c")) {

			EmployeeService es = (EmployeeService) applicationcontext.getBean("contractEmployeeServiceImpl");
			es.deleteEmployee(eId);
		}

		return "delete";

	}

}
