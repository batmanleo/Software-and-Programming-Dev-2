//this program is written by Leo
import java.util.Scanner;

public class keyboardstuff {
public static void main(String[] args) {
//this sets up reading keyboard input
Scanner keyboard= new Scanner(System.in); 
System.out.println("What is your age?");
//this reads the next number you type
int age = keyboard.nextInt();
System.out.println("What is your name?");
//this reads everything untill you press enter
String name = keyboard.nextLine();
name = keyboard.nextLine();
System.out.println("hello "+name+" your age is "+age);
System.out.println("what is the current gas price?");
float gasprice = keyboard.nextFloat();
System.out.println("the current gas price is "+gasprice+"$ per gallon.");
}
}
//sorry this isn't all of the requrements