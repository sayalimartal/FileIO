//Class to hold instance of an employee
package com.fileio.employee;

import java.io.Serializable;

public class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String employeeName;
	private int employeeId;
	private long salary;
	
	public Employee(String employeeName, int employeeId, long salary) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.salary = salary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public long getSalary() {
		return salary;
	}

	//Display employee details
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", salary=" + salary + "]";
	}


}
