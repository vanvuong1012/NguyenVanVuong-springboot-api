package com.example.springbootapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_employeeapi")

public class Employee {
    @Id
    @GeneratedValue
    private Long EmployeeID;
    private String firstName;
    private String lastName;
    private String email;
}
