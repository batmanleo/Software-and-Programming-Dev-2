import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//this program was written by Leo

public class cardgamewithinput {
public static void main(String[] args) {
    // this sets up all of the variables
    int tempNumber;
    int temperNumber;
    Card tempCard;
    Cardplayer tempPlayer;
    Deck deck;
    String input;
    String playerName;
    int numberOfPlayers = 0;
    //this sets up the arraylist with all of the players in it
    ArrayList<Cardplayer> playerList = new ArrayList<Cardplayer>();
    //this sets up keyboard input
    Scanner keyboard = new Scanner(System.in);
    while (numberOfPlayers == 0){
    System.out.println("How many players?");
    input = keyboard.nextLine();
    try {
     numberOfPlayers = Integer.parseInt(input.trim());   
    } catch (Exception e) {
        System.out.println("Please input a number");        
    }
    }
    for (int i = 0; i < numberOfPlayers; i++) {
    System.err.println("Player"+(i+1)+"'s name");
    playerList.add(new Cardplayer(keyboard.nextLine()));   
    }
    //this makes the deck and players and shuffles the deck
       deck = new Deck();
       deck.shuffle();
    //this draws the cards for each player
       for(int x=0; x<5; x++){
        for (int i = 0; i < numberOfPlayers; i++) {
            playerList.get(i).addcard(deck.draw());
        }
       }
    //this prints each players hand and what score they got
    for (int i = 0; i < numberOfPlayers; i++) {
           System.out.println("player"+" "+(i+1)+"'s hand is:");       
            System.out.println(playerList.get(i).printhand());
            System.out.println("do you want to discard any cards?   Y/N");
            input = keyboard.nextLine();  
            if (input.contains("y")||input.contains("Y")){
                System.out.println(playerList.get(i).printhand());
                System.out.println("how many cards do you want to discard?");
                try {
                        input = keyboard.nextLine();
                        tempNumber = Integer.parseInt(input.trim());
                    } catch (Exception e) {
                        System.out.println("please input a number");
                        input = keyboard.nextLine();
                        tempNumber = Integer.parseInt(input.trim());
                    }
                    System.out.println(playerList.get(i).printhand());
                    for (int j = 0; j < tempNumber; j++) {
                    System.out.println("whitch card do you want to discard?");
                    try {
                            input = keyboard.nextLine();
                            temperNumber = Integer.parseInt(input.trim());
                        } catch (Exception e) {
                            System.out.println("please input a number");
                            input = keyboard.nextLine();
                            temperNumber = Integer.parseInt(input.trim());
                        }
                        playerList.get(i).replacecard(temperNumber-1,deck.draw());
                    }
        }
    //this compares the score of every player's hand to each other and tells who won
    } 
    for (int i = 0; i < numberOfPlayers; i++) {
           System.out.println("player"+" "+(i+1)+"'s hand is:");       
            System.out.println(playerList.get(i).printhand());
            System.out.println("Score: " + playerList.get(i).scorePoker());
            System.out.println("");  }

    Collections.sort(playerList);
    System.out.println(playerList.get(0).name+" Wins!"+" With a score of "+playerList.get(0).handValue);
    }
}