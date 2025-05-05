package com.pluralsight;

public class Employee {
    // Backing variables
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    // Constructor
    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }
    // Regular hours = max 40
    public double getRegularHours() {
        return Math.min(40, hoursWorked);
    }

    // Overtime = hours above 40
    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - 40);
    }

    // Total pay = regular pay + overtime (1.5x rate)
    public double getTotalPay() {
        return getRegularHours() * payRate + getOvertimeHours() * payRate * 1.5;
    }

    // Other getters (if needed)
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
}
