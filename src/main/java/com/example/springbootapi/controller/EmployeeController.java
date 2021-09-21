package com.example.springbootapi.controller;

import com.example.springbootapi.dto.EmployeeDTO;
import com.example.springbootapi.entity.Employee;
import com.example.springbootapi.error.EmployeeNotFoundException;
import com.example.springbootapi.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long employeeId) throws EmployeeNotFoundException {
        return employeeService.getEmployeeById(employeeId);
    }
    @DeleteMapping("employees/{id}")
    public String deleteById(@PathVariable("id") Long employeeId){
        employeeService.deleteById(employeeId);
        return "Successfully";
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployeeById(@PathVariable("id") Long employeeId,@RequestBody Employee employee){
        return  employeeService.updateEmployeeById(employeeId,employee);
    }


    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/employeesDTO")
    public List<EmployeeDTO> getListUsers(){
        List<Employee> list= employeeService.getAllEmployee();
        List<EmployeeDTO> list1= new ArrayList<>();
        for (Employee employee:list) {
            list1.add(new EmployeeDTO(employee));
        }
        return list1;
    }
}
