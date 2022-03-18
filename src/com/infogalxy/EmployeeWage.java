package com.infogalxy;

import java.util.Random;

public class EmployeeWage {
    public static void main(String args[]) {
        //Displaying Welcome Message for User
        System.out.println("Welcome to Employee Wage Computation");
        //UC-2:Calculating Employee's Dail Wage
        final int WAGE_PER_HR = 20;
        final int PART_TIME_HR = 4;
        final int FULL_DAY_HR = 8;
        Random random = new Random();
        //UC-5:Calculating Wages for 20days
        for(int i = 1; i <= 20; i++) {
            int total_wage = 0;
            //UC-1:Checking Employee's Attendance
            int empAttendance = random.nextInt() % 2;
            System.out.println(empAttendance);
            if (empAttendance == 0) {
                System.out.println("Employee is Absent");
                total_wage = 0;
            } else {
                System.out.println("Employee is Present");
                //UC-3: ADD Part Time Employee And Wage
                int empType = random.nextInt() % 2;
                //UC-4:Solving Using Switch Case Statement
                switch (empType) {
                    case 0:
                        System.out.println("Employee is Part Time");
                        total_wage = WAGE_PER_HR * PART_TIME_HR;
                        break;
                    case 1:
                    case -1:
                        System.out.println("Employee is Full Time");
                        total_wage = WAGE_PER_HR * FULL_DAY_HR;
                        break;
                }

            }
            System.out.println("Employee's Full Day Wage:" + total_wage);
        }
    }
}
