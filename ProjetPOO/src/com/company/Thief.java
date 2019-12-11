package com.company;

import java.util.Random;
import java.util.Scanner;

public class Thief extends Character {
    private int dodge;
    private int critical;
    private int maxDamage;
    public Thief(){
        System.out.println("Give me your dodge /100");
        Scanner userInput=new Scanner(System.in);
        dodge=userInput.nextInt();
        System.out.println("Give me your critical");
        userInput=new Scanner(System.in);
        critical=userInput.nextInt();
        maxDamage=damage;
    }
    int baseDamage = damage;
    public int GetDamageInFight(){
        damage=maxDamage;
        var rand2 = new Random().nextInt(100);
        if (rand2 <= critical){
            damage = baseDamage * 2;
            return damage;
        }
        else {
            return damage;
        }
    }
    public void Damage(int damage){
        var rand1 = new Random().nextInt(100);
        if (rand1 <= dodge){
            System.out.println("");
        }
        else {
            healthPoint=healthPoint - damage;
        }
    }
    public void GetInformation(){
        System.out.println("This character is a thief and he got " + dodge + " dodge and " + critical + " critical");
    }
    public void GetInformationOnDeath(){
        System.out.println("This character has been deleted, it was a Thief named : " + name);
    }
}
