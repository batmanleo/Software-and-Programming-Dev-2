
import java.util.ArrayList;
import java.util.Scanner;

//this program was written by leo

public class cardgamewithinput {
public static void main(String[] args) {
    Card tempCard;
    Cardplayer tempPlayer;
    Deck deck;
    String input;
    String playerName;
    ArrayList<Cardplayer> playerList = new ArrayList<Cardplayer>();
    int numberOfPlayers = 0;
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
           System.out.println("player"+(i+1)+"'s hand is:");       
            System.out.println(playerList.get(i).printhand());
            System.out.println("Score: " + playerList.get(i).scorePoker());
            System.out.println(""); 
        }

    //this compares the score of every player's hand to each other and tells who won


   
    playerList.sort();



   }
}
