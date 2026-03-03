//this program was written by leo

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
ArrayList<Card> deck;
public Deck (){ 
    deck = new ArrayList<Card>();

     // This makes 3 new cards and sets the number and suit
    Card card1;
    Card card2;
    Card card3;
    Card card4;
  


    for(int x = 1; x < 14; x++){
        card1 = new Card(x+1, "spades");
        card2 = new Card(x+1, "clubs");
        card3 = new Card(x+1, "hearts");
        card4 = new Card(x+1, "diamonds");

         deck.add (card1);
         deck.add (card2);
         deck.add (card3);
         deck.add (card4);

         }
    }
    public String shuffle(){
        Collections.shuffle(deck);
        return "The deck shuffled";
    }

    
    public Card draw(){
        if (!deck.isEmpty()){
        return deck.remove(0);
    } 
    System.out.println ("the deck is out of cards");
    return null;
    }

}
