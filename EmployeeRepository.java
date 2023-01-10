package com.saveoperation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.saveoperation.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	// Spring Boot => Native Query
	@Query(value = "select * from employee c where city = ?", nativeQuery = true)
	List<Employee> findByCity(String city);

}
