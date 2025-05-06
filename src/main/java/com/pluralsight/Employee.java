package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    // Backing variables
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double punchInTime;
    private double punchOutTime;

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
    public void punchIn(double time){
        this.punchInTime = time;
        System.out.println("Punched in at: " + time);
    }

    public void punchIn(){
        LocalDateTime current = LocalDateTime.now();
        this.punchInTime = current.getHour() + current.getMinute() / 60.0;
        System.out.println("Punched in at: " + punchInTime);
    }
    public void punchOut(double time){
        this.punchOutTime = time;
        System.out.println("Punched out at: " + time);
    }

    public void punchOut(){
        LocalDateTime current = LocalDateTime.now();
        this.punchOutTime = current.getHour() + current.getMinute() / 60.0;
        System.out.println("Automatically punched out at: " + punchOutTime);
    }

}
