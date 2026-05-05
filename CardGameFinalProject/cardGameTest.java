import java.util.ArrayList;

//this program was written by Leo
// this program was written by Leo
// the score should be highcard at 100 + card value
// pair at 200 + card value
// two pair at 300 + card value of both pairs
// three of a kind at 400 + card value
// straight at 500 + highest card value
// flush at 600 + highest card value
// fullhouse at 700 + three of a kind value
// four of a kind at 800 + card value
// straight flush at 900 + highest card value
// royal flush at 1000 

public class cardGameTest {
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
  playerList.add(new Cardplayer("player A"));
  deck = new Deck();
  playerList.get(0).addcard(deck.draw());
  playerList.get(0).addcard(deck.draw());
  playerList.get(0).addcard(deck.draw());
  playerList.get(0).addcard(deck.draw());
  playerList.get(0).addcard(deck.draw());

  System.out.println(playerList.get(0).printhand());
  System.out.println("Score: " + playerList.get(0).scorePoker());
  System.out.println("hand should be 4 of a kind");

  playerList.get(0).replacecard(0, deck.draw());
  
  System.out.println(playerList.get(0).printhand());
  System.out.println("Score: " + playerList.get(0).scorePoker());
  System.out.println("hand should be fullhouse");

  playerList.get(0).replacecard(4, deck.draw());
  playerList.get(0).replacecard(4, deck.draw());
  playerList.get(0).replacecard(4, deck.draw());


  System.out.println(playerList.get(0).printhand());
  System.out.println("Score: " + playerList.get(0).scorePoker());
  System.out.println("hand should be 3 of a kind");


  playerList.get(0).replacecard(2, deck.draw());
  playerList.get(0).replacecard(3, deck.draw());

  System.out.println(playerList.get(0).printhand());
  System.out.println("Score: " + playerList.get(0).scorePoker());
  System.out.println("hand should be fullhouse");


  playerList.get(0).replacecard(0, deck.draw());
  playerList.get(0).replacecard(0, deck.draw());
  

  playerList.get(0).replacecard(1, deck.draw());
  playerList.get(0).replacecard(1, deck.draw());
  playerList.get(0).replacecard(1, deck.draw());
  playerList.get(0).replacecard(1, deck.draw());
  playerList.get(0).replacecard(1, deck.draw());

  playerList.get(0).replacecard(2, deck.draw());
  playerList.get(0).replacecard(2, deck.draw());
  playerList.get(0).replacecard(2, deck.draw());
  playerList.get(0).replacecard(2, deck.draw());

  playerList.get(0).replacecard(3, deck.draw());
  playerList.get(0).replacecard(3, deck.draw());
  playerList.get(0).replacecard(3, deck.draw());
  playerList.get(0).replacecard(3, deck.draw());

  playerList.get(0).replacecard(4, deck.draw());
  playerList.get(0).replacecard(4, deck.draw());
  playerList.get(0).replacecard(4, deck.draw());
  playerList.get(0).replacecard(4, deck.draw());

  System.out.println(playerList.get(0).printhand());
  System.out.println("Score: " + playerList.get(0).scorePoker());
  System.out.println("hand should be straight");

  playerList.get(0).replacecard(0, deck.draw());
  playerList.get(0).replacecard(0, deck.draw());
  playerList.get(0).replacecard(0, deck.draw());
  playerList.get(0).replacecard(0, deck.draw());

  playerList.get(0).replacecard(1, deck.draw());
  playerList.get(0).replacecard(1, deck.draw());
  playerList.get(0).replacecard(1, deck.draw());
  playerList.get(0).replacecard(1, deck.draw());

  playerList.get(0).replacecard(2, deck.draw());
  playerList.get(0).replacecard(2, deck.draw());
  playerList.get(0).replacecard(2, deck.draw());
  playerList.get(0).replacecard(2, deck.draw());

  playerList.get(0).replacecard(3, deck.draw());
  playerList.get(0).replacecard(3, deck.draw());
  playerList.get(0).replacecard(3, deck.draw());
  playerList.get(0).replacecard(3, deck.draw());

  playerList.get(0).replacecard(4, deck.draw());
  playerList.get(0).replacecard(4, deck.draw());
  playerList.get(0).replacecard(4, deck.draw());
  playerList.get(0).replacecard(4, deck.draw());

  System.out.println(playerList.get(0).printhand());
  System.out.println("Score: " + playerList.get(0).scorePoker());
  System.out.println("hand should be royal flush");

  playerList.add(new Cardplayer("player B"));
  deck = new Deck();

  playerList.get(1).addcard(new Card(1, "spades"));
  playerList.get(1).addcard(new Card(3, "spades"));
  playerList.get(1).addcard(new Card(5, "spades"));
  playerList.get(1).addcard(new Card(7, "spades"));
  playerList.get(1).addcard(new Card(9, "spades"));

  System.out.println(playerList.get(1).printhand());
  System.out.println("Score: " + playerList.get(1).scorePoker());
  System.out.println("hand should be flush");

  playerList.get(1).replacecard(0,new Card(1, "spades"));
  playerList.get(1).replacecard(1,new Card(2, "spades"));
  playerList.get(1).replacecard(2,new Card(3, "spades"));
  playerList.get(1).replacecard(3,new Card(4, "spades"));
  playerList.get(1).replacecard(4,new Card(5, "spades"));


  System.out.println(playerList.get(1).printhand());
  System.out.println("Score: " + playerList.get(1).scorePoker());
  System.out.println("hand should be straight flush");

  playerList.get(1).replacecard(0,new Card(1, "spades"));
  playerList.get(1).replacecard(1,new Card(3, "hearts"));
  playerList.get(1).replacecard(2,new Card(5, "hearts"));
  playerList.get(1).replacecard(3,new Card(7, "hearts"));
  playerList.get(1).replacecard(4,new Card(9, "hearts"));


  System.out.println(playerList.get(1).printhand());
  System.out.println("Score: " + playerList.get(1).scorePoker());
  System.out.println("hand should be high card");

}
}