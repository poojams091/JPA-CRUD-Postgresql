package com.cg.insurance.test.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import javax.persistence.Id;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.cg.insurance.model.Employee;
import com.cg.insurance.service.EmployeeServiceImpl;
import com.cg.insurance.service.IEmployeeService;

class EmployeeTest {

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setup");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	
	/*
	 * private int id;

	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;
	 */
	
	@Test
	@Disabled
	void testShouldAddEmployee() {
		IEmployeeService empService = new EmployeeServiceImpl();
		
		Employee emp = new Employee();
		emp.setName("Ram");
		emp.setDesignation("Software Engineer");
		emp.setSalary(40000.00);
		emp.setInsuranceScheme("SchemeA");
		
		Employee persistedEmp = empService.save(emp);
		System.out.println(persistedEmp);
		
		assertEquals("Ram", persistedEmp.getName());
		assertEquals("Software Engineer", persistedEmp.getDesignation());
		assertEquals(40000.00, persistedEmp.getSalary());
		assertEquals("SchemeA", persistedEmp.getInsuranceScheme());
		
	}
	
	@Test
	@Disabled
	void testShouldDeleteEmployeeById() {
		IEmployeeService empService = new EmployeeServiceImpl();
		Employee emp = empService.deleteEmployeeById(9);
		assertEquals(9, emp.getId());
	}
	
	@Test
	void testShouldGetAllEmployees() {
		IEmployeeService empService = new EmployeeServiceImpl();
		List<Employee> employees = empService.getAllEmployees();
		assertEquals(3, employees.size());
		
		/*
		Employee emp1 = empService.getEmployeeById(9);
		Employee emp2 = empService.getEmployeeById(10);
		
		assertEquals(40000.00, emp1.getSalary());
		assertEquals(40000.00, emp2.getSalary());
		for(Employee emp :employees ) {
			System.out.println(emp);
		}
		*/
	}
	
	
	@Test
	@Disabled
	void testShoudlUpdateEmployee() {
		IEmployeeService empService = new EmployeeServiceImpl();
		Employee emp = new Employee();
		emp.setId(10);
		emp.setName("Ram Kumar");
		emp.setDesignation("Software Engineer");
		emp.setInsuranceScheme("SchemeB");
		emp.setSalary(45000.00);
		
		Employee updatedEmp = empService.updateEmployee(emp);
		System.out.println(updatedEmp);
		assertEquals(45000.00, updatedEmp.getSalary());
	}
	
	@Test
	@Disabled
	void testShouldGetEmployeeById() {
		IEmployeeService empService = new EmployeeServiceImpl();
		Employee emp = empService.getEmployeeById(9);
		assertEquals("Ram", emp.getName());
	}
	
	/*
	
	@Test
	void testShouldDeleteEmployeeByName() {
		
	}
	
	@Test
	void testShouldDeleteEmployeeByEmail() {
		
	}
	
	
	
	@Test
	void testShouldGetEmployeeByName() {
		
	}
	
	@Test
	void testShouldGetEmployeeById() {
		
	}
	
	@Test
	void testShouldGetEmployeeByEmail() {
		
	}
	
	@Test
	void testShouldGetEmployeeByContactNo() {
		
	}

	*/
}
