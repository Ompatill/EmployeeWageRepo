package com.infogalxy;

import java.util.Random;

public class EmployeeWage {
    public static void main(String args[]) {
        //Displaying Welcome Message for User
        System.out.println("Welcome to Employee Wage Computation");
        //UC-2:Calculating Employee's Dail Wage
        final int WAGE_PER_HR = 20;
        final int FULL_DAY_HR = 8;
        int total_wage = 0;
        Random random = new Random();
        //UC-1: Checking Employee Attendance
        int empAttendance = random.nextInt()%2;
        System.out.println(empAttendance);
        if(empAttendance == 0) {
            System.out.println("Employee is Absent");
            total_wage = 0;
        }else {
            System.out.println("Employee is Present");
            total_wage = WAGE_PER_HR * FULL_DAY_HR;
        }
        System.out.println("Employee's Full Day Wage:"+total_wage);
    }
}