package com.xworkz.java8.dto;

import com.xworkz.java8.dto.EmployeeDTO;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeTester {

    public static void main(String[] args) {

        List<EmployeeDTO> employees = Arrays.asList(new EmployeeDTO(1, "pbk", "dev", 20000.00),
                new EmployeeDTO(5, "rakshith", "dev", 400000000000000.00),
                new EmployeeDTO(2, "danu", "devOps", 400000000000000.00),
                new EmployeeDTO(3, "rahul", "it", 20000000000000.00));

        //sorting by name
        System.out.println(employees.stream().sorted(Comparator.comparing(EmployeeDTO::getEmpName)).collect(Collectors.toList()));
        //mi salary
        System.out.println(employees.stream().min(Comparator.comparing(EmployeeDTO::getSalary)).get());

        System.out.println("name ");
        employees.stream().sorted((o1, o2) -> o1.getEmpName().compareTo(o2.getEmpName())).forEach(System.out::println);

        System.out.println("salary");
        employees.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).forEach(System.out::println);

        System.out.println("limit");
        employees.stream().sorted((o1, o2) ->(int) ( o1.getSalary() - o2.getSalary())).limit(3).forEach(System.out::println);

        System.out.println("2nd min salary");
        System.out.println( employees.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).skip(1).findFirst() );

        System.out.println("min salary");
        System.out.println( employees.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).findFirst() );

        //count no of employees based on dept
        System.out.println("count no of employees based on dept");
        System.out.println(employees.stream().collect(Collectors.groupingBy(employeeByDEpt -> employeeByDEpt.getDepartment(), Collectors.counting())));

//        pure lamda expressio structure

    }
}
