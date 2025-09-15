package org.example;

import java.util.Scanner;

public class EmployeeSalarySlip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee[] employeeList = new Employee[2];
        // Enter employee details, calculate allowances and deductions
        for(int i=0; i<2; i++){
            System.out.println("Enter Employee" +(i+1)+ " code: ");
            Employee emp = new Employee();
            emp.empCode = input.next();
            System.out.println("Enter Employee" +(i+1)+ " Basic Salary: ");
            emp.basicSalary = input.nextDouble();

            employeeList[i]=emp;
        }

        for(Employee e: employeeList){
            calculateDetails(e);
            printSalarySlip(e);
        }

    }

    private static Employee calculateDetails(Employee e){
        e.da = 0.25 * e.basicSalary;
        e.hra = 0.15 * e.basicSalary;
        e.pf = 0.0833 * e.basicSalary;
        e.net = e.basicSalary + e.da + e.hra;
        e.gross = e.net - e.pf;

        return e;
    }

    private static void printSalarySlip(Employee e){
        System.out.println("          SALARY SLIP     ");
        System.out.println("Employee Code       :"+ e.empCode + "     " + "   Basic Salary      :"+e.basicSalary);
        System.out.println("Dearness Allowance  :"+ e.da + "     " + " House Rent Allowance :"+e.hra);
        System.out.println("Net Salary          :"+ e.net + "     " + "Gross Salary :"+e.gross);
        System.out.println("********************");
    }
}

class Employee{
    String empCode;
    double basicSalary,da,hra,pf,net,gross;
}
