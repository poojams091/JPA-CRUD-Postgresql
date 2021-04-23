package com.cg.insurance.service;

import java.util.List;

import com.cg.insurance.model.Employee;

public interface IEmployeeService {
	
	Employee save(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(int id);
	Employee updateEmployee(Employee employee);
	Employee deleteEmployeeById(int id);

}
