package com.cg.insurance.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/*
 * In this package, create ?Employee? class with different attributes such as
 *  id, name, salary, designation, insuranceScheme.
 */
@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private int id;

	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;
	
	/*
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="address_id")
	private Address address;
	*/
	
	// Constructors
	public Employee() {}

	public Employee(String name, double salary, String designation, String insuranceScheme) {
		super();
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}
	
	public Employee(String name, double salary, String designation) {
		super();
		this.name = name;
		this.salary = salary;
		this.designation = designation;	
	}
	
	// Getter & Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getInsuranceScheme() {
		return insuranceScheme;
	}

	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	
	/*
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	*/

	// toString()
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}
	
}
