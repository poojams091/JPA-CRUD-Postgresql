package com.cg.insurance.test.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import javax.persistence.Id;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.cg.insurance.exception.EmployeeNotFoundException;
import com.cg.insurance.model.Employee;
import com.cg.insurance.service.EmployeeServiceImpl;
import com.cg.insurance.service.IEmployeeService;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeeTest {

	IEmployeeService empService;
	
	@BeforeEach
	void setUp() throws Exception {
		 empService = new EmployeeServiceImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		empService = null;
	}

	/*
	 * private int id;

	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;
	 */
	
	@Test
	@Order(2)
	void testShouldAddEmployee() {
		//IEmployeeService empService = new EmployeeServiceImpl();		
		Employee emp = new Employee();
		emp.setName("Ramesh");
		emp.setDesignation("System Associate");
		emp.setSalary(16000.00);
		emp.setInsuranceScheme("Scheme C");
		
		Employee persistedEmp = empService.save(emp);
		System.out.println(persistedEmp);
		
		assertAll(
		() -> assertEquals("Ramesh", persistedEmp.getName()),
		() -> assertEquals("System Associate", persistedEmp.getDesignation()),
		() -> assertEquals(16000.00, persistedEmp.getSalary()),
		() ->assertEquals("Scheme C", persistedEmp.getInsuranceScheme()));
		
	}
	
	@Test
	@Disabled
	@Order(5)
	void testShouldDeleteEmployeeById() {
		Employee emp = empService.deleteEmployeeById(30);
		assertEquals(30, emp.getId());
	}
	
	@Test
	@Order(1)
	void testShouldGetAllEmployees() {
		List<Employee> employees = empService.getAllEmployees();
		assertEquals(11, employees.size());
		
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
	
	@Order(4)
	void testShoudlUpdateEmployee() {
		Employee emp = new Employee();
		emp.setId(30);
		emp.setName("Ramesh");
		emp.setDesignation("System Associate");
		emp.setSalary(18000.00);
		emp.setInsuranceScheme("Scheme C");
		
		Employee updatedEmp = empService.updateEmployee(emp);
		System.out.println(updatedEmp);
		assertEquals(15000.00, updatedEmp.getSalary());
	}
	
	@Test
	@Order(3)
	void testShouldGetEmployeeById() throws EmployeeNotFoundException {
		Employee emp = empService.getEmployeeById(30);
		assertEquals("Ramesh", emp.getName());
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
