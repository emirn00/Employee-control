package com.employeecontrol.demo.service;

import com.employeecontrol.demo.exception.UserNotFoundException;
import com.employeecontrol.demo.model.Employee;
import com.employeecontrol.demo.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;
    private EmployeeRepo employeeRepo1;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployee() {
        return employeeRepo.findAll();
    }
    public Employee findEmployeeById(long id){
        return  employeeRepo.findEmployeeById(id).orElseThrow(()->new UserNotFoundException("There is no user with" +id +"!!"));
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepo.deleteEmployeeById(id);
    }

}
