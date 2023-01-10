package com.saveoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.saveoperation.model.Employee;
import com.saveoperation.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	// Inject the EmployeeService here...
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")    //  http://localhost:8080/employee/save
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		Employee emp = employeeService.saveEmployee(employee);
		return ResponseEntity.ok(emp);
		
	}
	
	@GetMapping("/get/{id}")    //  http://localhost:8082/employee/get/1
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Integer id){
		Employee employee = employeeService.getEmployeeById(id);
		return ResponseEntity.ok().body(employee);
	}
	
	@DeleteMapping("/delete/{id}")  //  http://localhost:8080/employee/delete/2
	public void deleteEmployeeById(@PathVariable ("id") Integer id) {
		employeeService.deleteEmployee(id);
	}

	@GetMapping("/getcity/{city}")  // http://localhost:8080/employee/getcity/mumbai
	public ResponseEntity<List<Employee>> getEmployeeByCity(@PathVariable ("city") String city){
		List<Employee> employee = employeeService.getListByCity(city);
		return ResponseEntity.ok().body(employee);
	}
}
