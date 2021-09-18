package com.example.springbootapi.entity;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "tbl_employeeapi")

public class Employee {
    @Id
    @GeneratedValue
    private Long EmployeeID;

    @NotBlank(message = "FirstName is mandatory")
    @Length(min = 1,max = 15,message = "less than 15 and greater than one")
    private String firstName;

    @NotBlank(message = "LastName is mandatory")
    @Length(min = 1,max = 15,message = "less than 15 and greater than one")
    private String lastName;

    @Email(message = "Please Input Email")
    private String email;

    @NotBlank(message = "Phone is mandatory")
    @Length(min = 9,max = 10,message = "phone min 9 and max 10")
    private String phone;
}
