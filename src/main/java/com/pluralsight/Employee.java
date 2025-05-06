package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    private double punchInTime;
    private double punchOutTime;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    // Overloaded punchIn methods
    public void punchIn(double time) {
        punchInTime = time;
        System.out.println(name + " punched in at " + punchInTime);
    }

    public void punchIn() {
        punchInTime = 9.0; // Default start time
        System.out.println(name + " punched in at default time " + punchInTime);
    }

    // Overloaded punchOut methods
    public void punchOut(double time) {
        punchOutTime = time;
        calculateHoursWorked();
        System.out.println(name + " punched out at " + punchOutTime);
    }

    public void punchOut() {
        punchOutTime = 17.0; // Default end time
        calculateHoursWorked();
        System.out.println(name + " punched out at default time " + punchOutTime);
    }

    private void calculateHoursWorked() {
        double worked = punchOutTime - punchInTime;
        if (worked > 0) {
            hoursWorked += worked;
        }
    }

    // Payroll getters
    public double getTotalPay() {
        return payRate * hoursWorked;
    }

    public double getRegularHours() {
        return Math.min(40, hoursWorked);
    }

    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - 40);
    }

    public String getName() {
        return name;
    }
}