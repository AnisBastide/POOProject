package com.company;

import java.util.Scanner;

public class Wizard extends Character{
    int  magicDamage;
    int maxMagicDamage;
    int maxDamage;
    public Wizard(){
        System.out.println("Give me your magic damage");
        Scanner userInput=new Scanner(System.in);
        magicDamage=userInput.nextInt();
        maxMagicDamage=magicDamage;
        maxDamage=damage;
    }
    public int GetDamageInFight(){
        damage=maxDamage;
        damage += magicDamage;
        magicDamage=magicDamage/2;
        return damage;
    }
    public void GetInformation(){
        System.out.println("This character is a Wizard and he got " + magicDamage + " magicDamage");
    }
    public void ResetStats(){
        healthPoint=maxHealthPoint;
        magicDamage=maxMagicDamage;
        damage=maxDamage;
    }
    public void GetInformationOnDeath(){
        System.out.println("This character has been deleted, it was a Wizard named : " + name);
    }
}
