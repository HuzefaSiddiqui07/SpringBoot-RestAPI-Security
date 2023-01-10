package com.saveoperation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saveoperation.dao.EmployeeRepository;
import com.saveoperation.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		Employee employee = employeeRepository.findById(id).get(); // null
		return employee;
	}

	@Override
	public void deleteEmployee(Integer id) {
		employeeRepository.deleteById(id);
		
	}

	@Override
	public List<Employee> getListByCity(String city) {
		List<Employee> employee = employeeRepository.findByCity(city);
		return employee;
	}
	
}
