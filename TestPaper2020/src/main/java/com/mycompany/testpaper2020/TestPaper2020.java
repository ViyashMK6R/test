/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testpaper2020;

/**
 *
 * @author viyash sewpersadh
 */
public class TestPaper2020 {

    public static void main(String[] args) {
       // 2D array for cities: rows = years, cols = months
        int[][] cities = {
            {128, 135, 139}, //JHB
            {155, 129, 175}, //DBN
            {129, 130, 185}, //CTN
            {195, 155, 221}  //PE
        };

        String[] city = {"JHB", "DBN", "CTN", "PE"};
        String[] months = {"JAN", "FEB", "MAR"};

        int total = 0;
        int max = cities[0][0];
        int min = cities[0][0];

        // Print report header
        System.out.println("*******************************************************************");
        System.out.println("SPEEDING FINES REPORT for R");
        System.out.println("*******************************************************************\n");

        // Print months header
        System.out.printf("%-15s %8s %8s %8s\n", "", "JAN", "FEB", "MAR");

        // Print cities data
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-15s", city[i]);
            for (int j = 0; j < cities[i].length; j++) {
                int value = cities[i][j];
                System.out.printf("%8d%-2s",value , "km");

                
                total += value;
                if (value > max) max = value;
                if (value < min) min = value;
            }
            System.out.println();
        }

        System.out.println("*******************************************************************");
        System.out.println("SPEEDING FINES STATISTICS");
        System.out.println("*******************************************************************");
       // System.out.println("Total spped: " + total);
        System.out.println("Maximum speed captured: " + max + "km");
        System.out.println("Minimum speed captured: " + min + "km");
    }
}