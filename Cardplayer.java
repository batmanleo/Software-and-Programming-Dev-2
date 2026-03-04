//this program was written by leo

import java.util.ArrayList;
import java.util.Collections;

public class Cardplayer implements Comparable<Cardplayer>{
String name;
ArrayList<Card> hand;
int handValue = 0;
String handName;
boolean debug = false;

public Cardplayer(){
    hand=new ArrayList<Card>();
}
public Cardplayer(String name){
    this.name = name;
    hand=new ArrayList<Card>();
}
public void addcard(Card card){
    hand.add(card);
}
        //this is how it scores a high card
public void checkHighcard(){
    Collections.sort(hand);
        handName = "high card";
        handValue = 100 + hand.get(4).getValue();
}
        //this is how it scores a flush and other hands that the flush is apart of
public void checkFlush(){
 if (hand.get(0).suitSort == hand.get(1).suitSort &
     hand.get(0).suitSort == hand.get(2).suitSort &
     hand.get(0).suitSort == hand.get(3).suitSort &
     hand.get(0).suitSort == hand.get(4).suitSort){
        if (debug){
            System.out.println("found flush");}
        handName = "flush";
        handValue = 500 + hand.get(4).number;
        if (hand.get(0).number == hand.get(1).number - 1 &
        hand.get(0).number == hand.get(2).number - 2 &
        hand.get(0).number == hand.get(3).number - 3 &
        hand.get(0).number == hand.get(4).number - 4){
         if (debug){
            System.out.println("found straight flush");}
            handName = "straight flush";
            handValue = 900 + hand.get(4).number;
            if (hand.get(4).number == 14){
        if (debug){
            System.out.println("found royal flush");}
                handName = "royal flush";
                handValue = 1000;
            }
        }

    }
}
        //this is how it scores a straight
public void checkStraight(){
if (hand.get(0).number == hand.get(1).number - 1 &
        hand.get(0).number == hand.get(2).number - 2 &
        hand.get(0).number == hand.get(3).number - 3 &
        hand.get(0).number == hand.get(4).number - 4){
if (debug){
            System.out.println("found straight");}
        handName = "straight";
        handValue = 400 + hand.get(4).number;
        }
}
        //this is how it scores a pair
public void checkPair(){
    Collections.sort(hand);
    for (int x = 0; x < 4; x++) {
          
    if (hand.get(x).number == hand.get(x+1).number) {
        if (debug){
            System.out.println("found pair");}
        handName = "pair";
        handValue = 200 + hand.get(x).number + hand.get(x+1).number;
    }  

        //there might be an if statement here later 

    }

}

        //this is how it scores in total
        //it has to check lowest to highest
public int scorePoker(){

    Collections.sort(hand);
    checkHighcard();
    checkPair();
    checkStraight();
    checkFlush();
    return handValue;
}

        //this is how the players hand's gets printed
public String printhand(){
String printinghand = "";
for (int i = 0; i < hand.size(); i++) {
printinghand = printinghand + hand.get(i).toString();
}
return printinghand;
}

public int compareTo(Cardplayer o){
     
    return o.scorePoker()-this.scorePoker();}  

}
