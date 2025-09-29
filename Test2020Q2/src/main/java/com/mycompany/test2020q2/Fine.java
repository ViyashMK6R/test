/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test2020q2;

/**
 *
 * @author rhiya
 */
public abstract class Fine implements iFine {
   private String name;
   private int speed;
   private double finePayable;

    public Fine(String name, int speed) {
        this.name = name;
        this.speed = speed;
       calculateFine();
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public double getFinePayable() {
        return finePayable;
    }
    
    public void calculateFine(){
         if (speed >= 120) {
            finePayable = (int)Math.round(speed * 10.20);
        } else {
            finePayable = 0;
        }
    }

}
