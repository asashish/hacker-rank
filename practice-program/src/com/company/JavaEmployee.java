package com.company;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class JavaEmployee {

    public static void main(String[] args) {
        ArrayList<Employee> listOfEmployee = new ArrayList<Employee>();
        ArrayList<Employee> dupListOfEmployee = new ArrayList<Employee>();

        Employee e1 = new Employee(1,"Ashish",1000.00f);
        Employee e2 = new Employee(2,"Shubhash",1100.00f);
        Employee e3 = new Employee(3,"Prity",1200.00f);
        Employee e4 = new Employee(4,"Shobha",1300.00f);
        Employee e5 = new Employee(5,"Bijay",900.00f);
        Employee e6 = new Employee(6,"Vishal",800.00f);
        listOfEmployee.add(e1);
        listOfEmployee.add(e2);
        listOfEmployee.add(e3);
        listOfEmployee.add(e4);
        listOfEmployee.add(e5);
        dupListOfEmployee.add(e1);
        dupListOfEmployee.add(e5);
        dupListOfEmployee.add(e6);
        Consumer<Employee> printValue = i->{
            System.out.println(i.getEmployeeId()+" "+i.getEmployeeName()+" "+i.getEmployeeSalary());
        };
/*        listOfEmployee.stream().sorted((i1,i2)->(i1.getEmployeeSalary()<i2.getEmployeeSalary())?+1:
                (i1.getEmployeeSalary()>i2.getEmployeeSalary())?-1:0).forEach(printValue); */
//        listOfEmployee.stream().filter(i -> dupListOfEmployee.contains(i)).forEach(printValue);
        ArrayList<Employee> uniqListOfEmployee = listOfEmployee.stream().
                filter(i -> dupListOfEmployee.contains(i)).collect(Collectors.toCollection(ArrayList::new));

        uniqListOfEmployee.stream().forEach(printValue);
        //        listOfEmployee.stream().forEach(printValue);

    }
}
