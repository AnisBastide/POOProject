package com.company;

import java.util.Scanner;

public class Character {
    protected String name;
    protected int damage;
    protected int healthPoint;
    protected int initiative;
    protected int maxHealthPoint;
    public Character(){
        Getters();

    }
    private  void Getters(){
        System.out.println("Give me your name");
        Scanner userInput = new Scanner(System.in);
        name = userInput.nextLine();
        System.out.println("Give me your damage");
        userInput = new Scanner(System.in);
        damage = userInput.nextInt();
        System.out.println("Give me your Health Point");
        userInput = new Scanner(System.in);
        healthPoint = userInput.nextInt();
        System.out.println("Give me your Initiative");
        userInput = new Scanner(System.in);
        initiative = userInput.nextInt();
        maxHealthPoint=healthPoint;
    }
    public void Damage(int damage){
        healthPoint=healthPoint - damage;
    }
    public String GetName(){
        return name;
    }
    public int GetDamage(){
        return damage;
    }
    public int GetDamageInFight(){
        return damage;
    }
    public int GetHealthPoint(){
        return healthPoint;
    }
    public int GetInitiative(){
        return initiative;
    }
    public void GetInformation(){
        System.out.println("This character is a basic character");
    }
    public void ResetStats(){
        healthPoint=maxHealthPoint;
    }
    public void GetInformationOnDeath(){
        System.out.println("This character has been deleted, it was a basic character named : " + name);
    }
}
