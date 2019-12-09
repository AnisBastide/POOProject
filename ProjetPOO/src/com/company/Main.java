package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Character> characters = new ArrayList();
    public static void main(String[] args) {
        // write your code here
        //System.out.println( "Hello World !" );
        System.out.println("---------------------------------");
        System.out.println("-------CHARACTER MANAGEMENT------");
        System.out.println("---------------------------------");
        System.out.println("type your command");
        boolean menu=true;
        int count=0;

        while (menu){Scanner userInput = new Scanner(System.in);
            String command = userInput.nextLine();
            switch (command){
                case "help": System.out.println(" help => give list of all the command available \n " +
                        "exit => Quit the application \n ");
                break;
                case "exit":{menu=false; System.exit(0);}
                case "create character": characters.add(new Character()) ;
                    break;
                case "list": {
                    for (Character character:
                         characters) {
                        System.out.println(character.Name());

                    }
                }
                break;
                case "info":{System.out.println("entrez l'id de votre personnage");
                    userInput = new Scanner(System.in);
                    int id = userInput.nextInt();
                CharacterInfo(id);}
                break;
                default: System.out.println("rentre une commande qui existe fdp (fruit de la passion)");
                break;
            }
        }
    }
    private static void CharacterInfo(int id){
        var name= characters.get(id).Name();
        var damage= characters.get(id).Damage();
        var healthPoint= characters.get(id).HealthPoint();
        var initiative= characters.get(id).Initiative();
        System.out.println("Name of your character :" + name);
        Integer.toString(damage);
        System.out.println("Your damage :" + damage);
        Integer.toString(healthPoint);
        System.out.println("Your health point :" + healthPoint);
        Integer.toString(initiative);
        System.out.println("Your initiative :" + initiative);
    }

}
class Character{
    private String name;
    private int damage;
    private int healthPoint;
    private int initiative;
    public Character(){
        Getters();

    }
    private void Getters(){
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
    }
    private int Strength(){
        Scanner userInput= new Scanner(System.in);
        int strength=userInput.nextInt();
        return strength;
    }
    private void Damage(int strength){
        healthPoint=healthPoint - strength;

    }
    public String Name(){
        return name;
    }
    public int Damage(){
        return damage;
    }
    public int HealthPoint(){
        return healthPoint;
    }
    public int Initiative(){
        return initiative;
    }

}



