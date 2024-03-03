package com.xworkz.java8.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeDTO {

    private int id;

    private String empName;

    private String department;
    private double salary;


}
