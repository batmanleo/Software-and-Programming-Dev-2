import java.util.Arrays;
import java.util.Scanner;

//this is witten by Leo Adira
public class stringpulleraparter {
public static void main(String[] args) {
 
//this splits the premade sentence 
    String test = "the quick brown fox jumped over the lazy dog";
    System.out.println("the quick brown fox jumped over the lazy dog");
String[] burger = test.split(" [a-z]");
System.out.println(Arrays.toString(burger));
System.out.println(burger.length);

//this trys it's best to split the terrible user made sentence 
    Scanner keybord = new Scanner(System.in);
    System.out.println("please enter a sentence");
    String test2 = keybord.nextLine(); 
burger = test2.split(" [a-z]");
System.out.println(Arrays.toString(burger));
System.out.println(burger.length);

}
}
