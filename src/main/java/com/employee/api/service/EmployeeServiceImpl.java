package com.employee.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.api.domain.Employee;
import com.employee.api.repository.EmployeeRepository;
import com.google.common.collect.Lists;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeServiceImpl(final EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return Lists.newArrayList(employeeRepository.findAll());
	}

	@Override
	public Employee createOrUpdateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Optional<Employee> getEmployeeById(Long employeeId) {
		
		return employeeRepository.findById(employeeId);
	}

	@Override
	public void deteleEmployee(Employee employee) {
		employeeRepository.delete(employee);
		
	}

}
