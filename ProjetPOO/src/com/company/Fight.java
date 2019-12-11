package com.company;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Random;

public class Fight {
    public void InitFight(int idPlayer1, int idPlayer2, List<Character> characters){
        Fight(idPlayer1, idPlayer2,characters);
    }

    private void Fight(int idPlayer1, int idPlayer2, List<Character> characters){
        int player1;
        int player2;

        if (characters.get(idPlayer1).GetInitiative()> characters.get(idPlayer2).GetInitiative() ){
             player1=idPlayer1;
             player2=idPlayer2;
        }
        else if(characters.get(idPlayer1).GetInitiative() < characters.get(idPlayer2).GetInitiative() ){
            player1=idPlayer2;
             player2=idPlayer1;
        }
        else{
            var rand= new Random().nextInt(1);
            if (rand==0){
                player1=idPlayer1;
                player2=idPlayer2;
            }
            else{
                player1=idPlayer2;
                player2=idPlayer1;
            }
        }
        while (characters.get(idPlayer1).GetHealthPoint()>0 && (characters.get(idPlayer2).GetHealthPoint()>0)){
            var healthPLayer1=characters.get(player1).GetHealthPoint();
            var healthPLayer2=characters.get(player2).GetHealthPoint();
            characters.get(player2).Damage(characters.get(player1).GetDamageInFight());
            System.out.println(characters.get(player1).GetName() + " attacks for " + (healthPLayer2-characters.get(player2).GetHealthPoint()) + " damage. ");
            System.out.println(characters.get(player2).GetName() + " have " + characters.get(player2).GetHealthPoint() + " HP left. ");
            if (characters.get(player2).GetHealthPoint()>0){
                characters.get(player1).Damage(characters.get(player2).GetDamageInFight());
                System.out.println(characters.get(player2).GetName() + " attacks for " + (healthPLayer1-characters.get(player1).GetHealthPoint()) + " damage. ");
                System.out.println(characters.get(player1).GetName() + " have " + characters.get(player1).GetHealthPoint() + " HP left. ");
            }
        }
        if (characters.get(player1).GetHealthPoint()<=0){
            System.out.println("Player 2 won");
        }
        else {
            System.out.println("Player 1 won");
        }
    }
}
