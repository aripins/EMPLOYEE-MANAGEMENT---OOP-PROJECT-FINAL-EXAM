package com.aripin.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aripin.employee.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
