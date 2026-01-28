package com.employee.service;

import java.util.ArrayList;
import java.util.Random;

public class EmployeeWageServiceImpl implements EmployeeWageServices {
    
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_TIME_HOURS = 8;
    public static final int PART_TIME_HOURS = 8;
    public static final int MAX_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HOURS = 100;

    private Random random = new Random();

    private ArrayList<Integer> dailyWages = new ArrayList<>();


    private int  getAttendamce(){
        return  random.nextInt(2);
    }

    @Override
    public void calculateWage(){

    }

    @Override
    public ArrayList<Integer> getDailyWages(){
        return  new ArrayList<>();
    }
}
