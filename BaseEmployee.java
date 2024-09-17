package com.company;

// Should have a base salary.
public class BaseEmployee extends CommissionEmployee{
    private double baseSalary;

    public BaseEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, commissionRate, grossSales);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

}
