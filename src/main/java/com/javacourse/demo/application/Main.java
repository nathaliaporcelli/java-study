package com.javacourse.demo.application;

import com.javacourse.demo.entities.Department;
import com.javacourse.demo.entities.HourContract;
import com.javacourse.demo.entities.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();

        System.out.print("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, workerLevel.valueOf(workerLevel),baseSalary,new Department(departmentName));
        System.out.print("How many contracts to this worker?  ");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            System.out.println("Enter contract " + i +" data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.println("Value per hour");
            double valuePerHour = sc.nextDouble();
            System.out.println("Duration hours");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate,valuePerHour,hours);

        }



        sc.close();
    }
}
