package com.employeecontrol.demo.repo;

import com.employeecontrol.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee , Long> {

}
