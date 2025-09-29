/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test2020q2;

import java.util.Scanner;

/**
 *
 * @author rhiya
 */
public class Test2020Q2 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Get citizen name
        System.out.print("Enter the person name: ");
        String name = sc.nextLine();

        // Get speed
        System.out.print("Enter speed : ");
        int speed = sc.nextInt();

        // Create object
        SpeedingFines fine = new SpeedingFines(name, speed);

        // Print report
        fine.PrintFine();
    }
}
