package com.employee.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.employee.api.domain.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
