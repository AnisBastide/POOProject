package com.company;

import java.util.Scanner;

public class Wizard extends Character{
    int magicDamage;
    public Wizard(){
        System.out.println("Give me your magic damage");
        Scanner userInput=new Scanner(System.in);
        magicDamage=userInput.nextInt();
    }
    public int GetDamage(){
        damage += magicDamage;
        magicDamage=magicDamage/2;
        return damage;
    }

}
