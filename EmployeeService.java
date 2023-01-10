package com.saveoperation.service;

import java.util.List;

import com.saveoperation.model.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee); // Use for Create Table & POST(Insert) Data Into Database 
	
	public Employee getEmployeeById(Integer id);  // Use to get(retrieve) Data from Database Use 'id'
	
	public void deleteEmployee(Integer id); // Use to delete Data from Database
	
	public List<Employee> getListByCity(String city);  // Program Run on the get(retrieve) Data from Database Use 'city'

}
