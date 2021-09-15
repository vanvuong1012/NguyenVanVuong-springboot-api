package com.example.springbootapi.service;

import com.example.springbootapi.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getAllEmployee();

    public Employee saveEmployee(Employee employee);

    public Employee getEmployeeById(Long employeeId);

    public void deleteById(Long employeeId);
    public Employee updateEmployeeById(Long id,Employee employee);

}
