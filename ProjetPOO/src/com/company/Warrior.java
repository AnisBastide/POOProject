package com.company;

import java.util.Scanner;

public class Warrior extends Character {
    private int shield;
    public Warrior(){
        System.out.println("Give me your shield");
        Scanner userInput=new Scanner(System.in);
        shield=userInput.nextInt();
    }
    public void Damage(int damage){
        if (damage<=shield){
            System.out.println("");
        }
        else{
            damage=damage-shield;
            healthPoint=healthPoint - damage;
        }

    }
    public void GetInformation(){
        System.out.println("This character is a Warrior and he got " + shield + " shield");
    }
    public void GetInformationOnDeath(){
        System.out.println("This character has been deleted, it was a Warrior named : " + name);
    }

}
