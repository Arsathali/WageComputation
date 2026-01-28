package com.employee.model;

public class Employee {
    
    private int employeeId;
    private int totalWorkingHours;
    private int totalWorkingDays;
    private int totalWage;

    public Employee(int employeeId){
        this.employeeId = employeeId;
    }

    public int getTotalWorkingHours() {
        return totalWorkingHours;
    }

    public void setTotalWorkingHours(int totalWorkingHours) {
        this.totalWorkingHours = totalWorkingHours;
    }

    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }

    public void setTotalWorkingDays(int totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }

    public int getTotalWage() {
        return totalWage;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    
}
