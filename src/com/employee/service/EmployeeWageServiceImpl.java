package com.employee.service;
import java.util.ArrayList;
import java.util.Random;

import com.employee.model.Employee;

public class EmployeeWageServiceImpl implements EmployeeWageServices {
    
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_TIME_HOURS = 8;
    public static final int PART_TIME_HOURS = 6;
    public static final int MAX_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HOURS = 100;

    private Random random = new Random();

    private ArrayList<Integer> dailyWages = new ArrayList<>();


    private int  getAttendance(){
        return  random.nextInt(2);
    }

    private int getWorkingHours() {
        int empType = random.nextInt(3);
        switch (empType) {
            case 1: return FULL_TIME_HOURS;
            case 2: return PART_TIME_HOURS;
            default: return 0;
        }
    }

    @Override
    public void calculateWage(Employee employee){

        int totalDays = 0;
        int totalHours = 0;
        int totalWage = 0;

        dailyWages.clear();

        while (totalDays < MAX_WORKING_DAYS && totalHours < MAX_WORKING_HOURS) {
            totalDays++;

            int attendance = getAttendance();
            int workHours = 0;

            if (attendance == 1) {
                workHours = getWorkingHours();
            }

            if (totalHours + workHours > MAX_WORKING_HOURS) {
                workHours = MAX_WORKING_HOURS - totalHours;
            }

            int dailyWage = workHours * WAGE_PER_HOUR;

            totalHours += workHours;
            totalWage += dailyWage;

            dailyWages.add(dailyWage);
        }

        employee.setTotalWorkingDays(totalDays);
        employee.setTotalWorkingHours(totalHours);
        employee.setTotalWage(totalWage);
    }

    @Override
    public ArrayList<Integer> getDailyWages(){
        return  new ArrayList<>();
    }
}
