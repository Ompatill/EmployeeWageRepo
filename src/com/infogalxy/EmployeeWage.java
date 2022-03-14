package com.infogalxy;

import java.util.Random;

public class EmployeeWage {
    public static void main(String args[]) {
        //Displaying Welcome Message for User
        System.out.println("Welcome to Employee Wage Computation");
        Random random = new Random();
        //UC-1: Checking Employee Attendance
        int empAttendance = random.nextInt()%2;
        System.out.println(empAttendance);
        if(empAttendance == 0) {
            System.out.println("Employee is Absent");
        }else {
            System.out.println("Employee is Present");
        }
    }
}
