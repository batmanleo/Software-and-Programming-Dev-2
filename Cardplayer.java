//this program was written by leo
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
import java.util.ArrayList;
import java.util.Collections;

public class Cardplayer implements Comparable<Cardplayer>{
String name;
ArrayList<Card> hand;
int handValue = 0;
String handName;
boolean debug = true;

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
public void discardcard(int cardnumber){
    hand.remove(cardnumber);
}
public void replacecard(int cardnumber,Card newcard){
    hand.remove(cardnumber);
    hand.add(cardnumber, newcard);
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

         
            for (int i = x+2; i < 4; i++) {
                if (hand.get(i).number == hand.get(i+1).number){
                    if (debug){
                    System.out.println("found two pair");}
                    handName = "twopair";
                    handValue = 300 + hand.get(x).number + hand.get(i).number + hand.get(x+1).number + hand.get(i+1).number;
                    // this does not fully work because it is possible to get a tie with different cards
                }
            }

         if (handName == "twopair"){
            break;
         }  
            

    } 
     }
     
     
    }
 
    public void checkFourofAkind(){
        Collections.sort(hand);
            if (hand.get(0).number == hand.get(1).number & hand.get(1).number == hand.get(2).number & hand.get(2).number == hand.get(3).number){
        if (debug){
            System.out.println("found four of a kind");}
            handName = "four-of-a-kind";
            handValue = 800 + hand.get(0).number + hand.get(1).number + hand.get(2).number + hand.get(3).number;
        
        }
        if (hand.get(1).number == hand.get(2).number & hand.get(2).number == hand.get(3).number & hand.get(3).number == hand.get(4).number){
        if (debug){
            System.out.println("found four of a kind");}
            handName = "four-of-a-kind";
            handValue = 800 + hand.get(1).number + hand.get(2).number + hand.get(3).number + hand.get(4).number;
        
        }
        
    }
     
 public void checkThreeOfaKind(){
        Collections.sort(hand);
        for (int x = 0; x < 3; x++) {
            if (hand.get(x).number == hand.get(x+1).number & hand.get(x+1).number == hand.get(x+2).number){
        if (debug){
            System.out.println("found three of a kind");}
            handName = "three-of-a-kind";
            handValue = 400 + hand.get(x).number + hand.get(x+1).number + hand.get(x+2).number;
        }

if (x == 0 & handName == "three-of-a-kind"){
if (hand.get(3).number == hand.get(4).number){
    System.out.println("found fullhouse");}
            handName = "fullhouse";
            handValue = 700 + hand.get(1).number + hand.get(2).number + hand.get(3).number + hand.get(4).number + hand.get(5).number;
}
if (x == 2 & handName == "three-of-a-kind"){
if (hand.get(0).number == hand.get(1).number){
    System.out.println("found fullhouse");}
            handName = "fullhouse";
            handValue = 700 + hand.get(1).number + hand.get(2).number + hand.get(3).number + hand.get(4).number + hand.get(5).number;
}
}

    }



        

        //there might be an if statement here later 

    



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
     
    return o.handValue-this.handValue;}  

}
