//this program is written by Leo
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class thethingymabob {
public static void main(String[] args) throws IOException {

boolean debug = false;
String data1;
String data2;
String data3;
String data4;
String data5;
double height;
double bigHeight = 0.0;
int numloop = 5;

//this sets up the file and the keyboard input
FileWriter filemaker = new FileWriter("supersecretdata.txt");
Scanner keybord = new Scanner(System.in);



//this is a loop that has all the questions in it so each user answers all 5 pieces of data 
for (int i = 0; i < numloop; i++) {
System.out.println("input data for user "+(i+1));
System.out.println("please enter your height in cm");
data1 = keybord.nextLine(); 
//this is a try catch incase the user(s) don't put anything that wouldn't work and would crash the program
try {
height = Double.parseDouble(data1.trim());
} catch (Exception e) 
{System.out.println("please enter a number with a . in it"); 
data1 = keybord.nextLine();
height = Double.parseDouble(data1.trim());
}
if (debug){
System.out.println("height is "+height);    
}
System.out.println("please enter your name");
data2 = keybord.nextLine();
System.out.println("please enter your address");
data3 = keybord.nextLine();
System.out.println("please enter your email");
data4 = keybord.nextLine();
System.out.println("please enter your computer operating system");
data5 = keybord.nextLine();

//this puts all of the data into the file that was set up earlier
filemaker.append(data1+"\n");
filemaker.append(data2+"\n");
filemaker.append(data3+"\n");
filemaker.append(data4+"\n");
filemaker.append(data5+"\n");
}

filemaker.close();

//this reads the file and prints it out
File fileseer= new File("supersecretdata.txt");
Scanner readme= new Scanner(fileseer); 
for (int i = 0; i < numloop; i++) {
data1 = readme.nextLine();
data2 = readme.nextLine();
data3 = readme.nextLine();
data4 = readme.nextLine();
data5 = readme.nextLine();
bigHeight += Double.parseDouble(data1.trim());
System.out.println("user "+(i+1)+"'s height is "+data1);
System.out.println("user "+(i+1)+"'s name is "+data2);
System.out.println("user "+(i+1)+"'s address is "+data3);
System.out.println("user "+(i+1)+"'s email is "+data4);
System.out.println("user "+(i+1)+"'s operating system is "+data5);
System.out.println("\s");}

System.out.println("avarge height is "+(bigHeight/numloop));

}
}
