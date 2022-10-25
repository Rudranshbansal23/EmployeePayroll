package com.blz.EmployeePayroll.Day_27_EmployeePayroll;

public class EmployeePayRollMain {
    public static void main(String[] args) {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        System.out.println("Welcolme to employee payRoll");
        employeePayrollService.readEmployeeDataFromConsole();
        employeePayrollService.writeEmployeeDataInConsole();
    }
}