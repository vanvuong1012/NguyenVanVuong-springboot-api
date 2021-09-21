package com.example.springbootapi.service;

import com.example.springbootapi.entity.Employee;
import com.example.springbootapi.error.EmployeeNotFoundException;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();

    public Employee saveEmployee(Employee employee);

    public Employee getEmployeeById(Long employeeId) throws EmployeeNotFoundException;

    public void deleteById(Long employeeId);
    public Employee updateEmployeeById(Long id,Employee employee);

}
