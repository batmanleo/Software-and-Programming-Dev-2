//This is a program by Leo

//import java.util.Arraylist;

public class Cardsobject {
public static void main(String[] args) {
     // This makes 3 new cards and sets the number and suit
    JokerCard card1 = new JokerCard("red", true);
    ChangeableCard card2 = new ChangeableCard(4,"hearts", true);
    Card card3 = new Card(1,"spades");
  


            // This draws the cards
            card1.drawcard();
            card2.drawcard();
            card3.drawcard();
            System.out.println("You draw 3 cards");

            System.out.println(" ");

            System.out.println(card1);
            System.out.println("Is the card played? " + card1.played
            + ". Is the card in the discard pile? " + card1.inDiscardPile
            + ". Is the card in the deck? " + card1.inDeck 
            + ". Is the card in someones hand? " + card1.inAHand 
            + ". Is the card in your hand? " + card1.inPlayersHand + ".");

            System.out.println(" ");

            System.out.println(card2);
            System.out.println("Is the card played? " + card2.played 
            + ". Is the card in the discard pile? " + card2.inDiscardPile 
            + ". Is the card in the deck? " + card2.inDeck 
            + ". Is the card in someones hand? " + card2.inAHand 
            + ". Is the card in your hand? " + card2.inPlayersHand + ".");

            System.out.println(" ");

            System.out.println(card3);
            System.out.println("Is the card played? " + card3.played 
            + ". Is the card in the discard pile? " + card3.inDiscardPile 
            + ". Is the card in the deck? " + card3.inDeck 
            + ". Is the card in someones hand? " + card3.inAHand 
            + ". Is the card in your hand? " + card3.inPlayersHand + ".");

            System.out.println(" ");

            // This plays the second card
            card2.changecard(5, "diamonds");
            System.out.println("You changed the second card");
            card2.playcard();
            System.out.println("You play the second card");

            System.out.println(" ");

            
            System.out.println(card2);
            System.out.println("Is the card played? " + card2.played 
            + ". Is the card in the discard pile? " + card2.inDiscardPile 
            + ". Is the card in the deck? " + card2.inDeck 
            + ". Is the card in someones hand? " + card2.inAHand 
            + ". Is the card in your hand? " + card2.inPlayersHand + ".");

            System.out.println(" ");

            // This discards the third card
            card3.discardcard();
            System.out.println("You discard the third card");

            System.out.println(" ");

            System.out.println(card3);
            System.out.println("Is the card played? " + card3.played 
            + ". Is the card in the discard pile? " + card3.inDiscardPile 
            + ". Is the card in the deck? " + card3.inDeck 
            + ". Is the card in someones hand? " + card3.inAHand 
            + ". Is the card in your hand? " + card3.inPlayersHand + ".");

            System.out.println(" ");


        //Arraylist<Card> deck = new Arraylist<Card>();
        //deck.add (card3);      
 }
}

// Sorry for the spaghetti code!!!!