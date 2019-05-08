package com.employee.api.service;

import java.util.List;
import java.util.Optional;

import com.employee.api.domain.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	
	Employee createOrUpdateEmployee(Employee employee);
	
	Optional<Employee> getEmployeeById(Long employeeId);
	
	void deteleEmployee(Employee employee);

}
