package com.company;

import java.util.Scanner;

public class Priest extends Character {
    private int heal;
    private int maxHealth=healthPoint;
    public Priest(){
        Scanner userInput=new Scanner(System.in);
        System.out.println("Give me your heal:");
        heal=userInput.nextInt();
    }
    public void Damage(int damage){
        healthPoint=healthPoint - damage;
        System.out.println();
        if (healthPoint+heal>maxHealth) {
            healthPoint = maxHealth;
        }
        else{
            healthPoint=healthPoint+heal;
            System.out.println(name + " heal himself for " + heal + "HP.");
        }
    }
}