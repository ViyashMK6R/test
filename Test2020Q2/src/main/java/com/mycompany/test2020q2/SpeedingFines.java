/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test2020q2;

/**
 *
 * @author rhiya
 */
public class SpeedingFines extends Fine {

    // Constructor calls parent class constructor
    public SpeedingFines(String name, int speed) {
        super(name, speed);
    }
   // Override PrintFine() method to display fine information
    @Override
    public void PrintFine() {
     System.out.println("****************");
        System.out.println("PERSON: " + getName());
        System.out.println("SPEED: " + getSpeed() + " km");
        System.out.println("FINE PAYABLE: R" + getFinePayable());
        System.out.println("***************************************");
    
    
} 
}
