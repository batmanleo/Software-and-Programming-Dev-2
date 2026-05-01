//this program was written by leo

public class Card implements Comparable<Card>  {

// These are the attributes
// And what they are set to by default     
    int number;
    String suit;
    boolean facecard;
    String colour; 
    boolean played = false; 
    boolean inDiscardPile = false;
    boolean inDeck = true;
    boolean inAHand = false;
    boolean inPlayersHand = false;
    boolean cardNotOffical; //This one is if the card is made up like: 15 of plates, or -11 of dragons
    int suitSort;
    String printValue;
   

// These are the methods

    public void playcard(){
        this.played=true;
        this.inDeck=false;
        this.inDiscardPile=false;
        this.inAHand=false;
        this.inPlayersHand=false;
    }

    public void discardcard(){
        this.inDiscardPile=true;
        this.inDeck=false;
        this.inAHand=false;
        this.inPlayersHand=false;
    }

    public void drawcard(){
        this.inDeck=false;
        this.inDiscardPile=false;
        this.inAHand=true;
        this.inPlayersHand=true;
    }

    public Card(int number, String suit){ //card constructor 

        this.number = number; 
        this.suit = suit;
        this.played = played;
        this.inDiscardPile = inDiscardPile;
        this.inDeck = inDeck;
        this.inAHand = inAHand;
        this.inPlayersHand = inPlayersHand; 
        this.colour = colour;

    if(this.suit == "spades") this.suitSort = 1;
    if(this.suit == "clubs") this.suitSort = 2;
    if(this.suit == "hearts") this.suitSort = 3;
    if(this.suit == "diamonds") this.suitSort = 4;
    if(this.suit == "jokers") this.suitSort = 5;
    
    this.printValue = String.valueOf(this.number);
    if(this.number == 11) this.printValue = "jack";
    if(this.number == 12) this.printValue = "queen";
    if(this.number == 13) this.printValue = "king";
    if(this.number == 14) this.printValue = "ace";

    
 }

public int getValue(){
    return number;
}


 public String toString() {
     return System.lineSeparator() + printValue + " of " + suit;
 }

 public int compareTo(Card o){
    if(o.number == this.number){ 
    return this.suitSort-o.suitSort;}
    return this.number-o.number; 
    
 }
}