package com.company;

/**
 * driver program for homework 1
 *
 */
public class Main {
    public static void main(String[] args) {
        // Create instances of each employee type
        Employee regularEmployee = new Employee("Chris", "Dublin", "121-21-2121");
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Doe", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Jane", "Smith", "222-22-2222", 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 0.15, 10000);
        BaseEmployee baseEmployee = new BaseEmployee("Bob", "Lewis", "444-44-4444", 0.10, 5000, 300);

        // Display each employee's information
        System.out.println("Super class Employee:");
        System.out.println("Name: " + regularEmployee.getFirstName() + " " + regularEmployee.getLastName());
        System.out.println("SSN: " + regularEmployee.getSocialSecurityNumber());

        System.out.println("Salaried Employee:");
        System.out.println("Name: " + salariedEmployee.getFirstName() + " " + salariedEmployee.getLastName());
        System.out.println("SSN: " + salariedEmployee.getSocialSecurityNumber());
        System.out.println("Weekly Salary: $" + salariedEmployee.getWeeklySalary());
        System.out.println();

        System.out.println("Hourly Employee:");
        System.out.println("Name: " + hourlyEmployee.getFirstName() + " " + hourlyEmployee.getLastName());
        System.out.println("SSN: " + hourlyEmployee.getSocialSecurityNumber());
        System.out.println("Wage: $" + hourlyEmployee.getWage());
        System.out.println("Hours Worked: " + hourlyEmployee.getHoursWorked());
        System.out.println();

        System.out.println("Commission Employee:");
        System.out.println("Name: " + commissionEmployee.getFirstName() + " " + commissionEmployee.getLastName());
        System.out.println("SSN: " + commissionEmployee.getSocialSecurityNumber());
        System.out.println("Commission Rate: " + commissionEmployee.getCommissionRate());
        System.out.println("Gross Sales: $" + commissionEmployee.getGrossSales());
        System.out.println();

        System.out.println("Base Employee:");
        System.out.println("Name: " + baseEmployee.getFirstName() + " " + baseEmployee.getLastName());
        System.out.println("SSN: " + baseEmployee.getSocialSecurityNumber());
        System.out.println("Commission Rate: " + baseEmployee.getCommissionRate());
        System.out.println("Gross Sales: $" + baseEmployee.getGrossSales());
        System.out.println("Base Salary: $" + baseEmployee.getBaseSalary());
    }
}
