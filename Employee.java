package com.company;

public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;

    // default constructor
    public Employee(){
        this.firstName = "John";
        this.lastName = "Doe";
        this.ssn = "000-00-0000";
    }
    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    // Accessors
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return ssn;
    }


    // Mutators
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocialSecurityNumber(String ssn) {
        this.ssn = ssn;
    }
}
