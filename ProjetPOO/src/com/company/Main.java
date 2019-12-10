package com.company;

import org.jetbrains.annotations.NotNull;

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
        boolean menu = true;
        int count = 0;

        while (menu) {
            Scanner userInput = new Scanner(System.in);
            String command = userInput.nextLine();
            switch (command) {
                case "help":
                    System.out.println("help => give list of all the command available \n"
                            + "quit => Quit the application\n" + "create character => create a new character\n"
                            + "list => print the list of all character\n"
                            + "info => give all information about a character \n"
                            + "fight => launch a fight beetween two characters \n"
                            + "create warrior => create a character with a shield \n"
                            + "create priest => create a character with heal \n"
                            + "create wizard => create a character with magic \n"
                            + "create thief => create character with critical hits and dodges");
                    break;
                case "exit": {
                    menu = false;
                    System.exit(0);
                }
                case "create":
                    characters.add(new Character());
                    System.out.println("Character has been created");
                    break;
                case "create warrior":
                    characters.add(new Warrior());
                    System.out.println("Warrior has been created");
                    break;
                case "create wizard":
                    characters.add(new Wizard());
                    System.out.println("Wizard has been created");
                    break;
                case "create thief":
                    characters.add(new Thief());
                    System.out.println("Thief has been created");
                    break;
                case "create priest":
                    characters.add(new Priest());
                    System.out.println("Priest has been created !!!");
                    break;
                case "list": {
                    for (Character character :
                            characters) {
                        System.out.println(character.GetName());

                    }
                }
                break;
                case "info": {
                    System.out.println("entrez l'id de votre personnage");
                    userInput = new Scanner(System.in);
                    int id = userInput.nextInt();
                    CharacterInfo(id);
                }
                break;
                case "fight": {
                    System.out.println("Enter the id of your first fighter");
                    var id1 = new Scanner(System.in);
                    int idPlayer1 = userInput.nextInt();
                    System.out.println("Enter the id of your second fighter");
                    var id2 = new Scanner(System.in);
                    int idPlayer2 = userInput.nextInt();
                    var Fight = new Fight();
                    Fight.InitFight(idPlayer1, idPlayer2, characters);
                }
                break;
                default:
                    System.out.println("rentre une commande qui existe fdp (fruit de la passion)");
                    break;
            }
        }
    }

    private static void CharacterInfo(int id) {
        var name = characters.get(id).GetName();
        var damage = characters.get(id).GetDamage();
        var healthPoint = characters.get(id).GetHealthPoint();
        var initiative = characters.get(id).GetInitiative();
        System.out.println("Name of your character :" + name);
        Integer.toString(damage);
        System.out.println("Your damage :" + damage);
        Integer.toString(healthPoint);
        System.out.println("Your health point :" + healthPoint);
        Integer.toString(initiative);
        System.out.println("Your initiative :" + initiative);
    }

}



