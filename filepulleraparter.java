//this program was written by Leo
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class filepulleraparter {
public static void main(String[] args) throws IOException {

    String fileLineReader;

try {
//this sets up the file and file reader as well as the varibles 
File fileseer= new File("letter_frequency.csv");
Scanner readme= new Scanner(fileseer);
fileLineReader = readme.nextLine();
int fries = 0;
double drpepper = 0.0;

//this goes through the file and sepreates the different parts and puts them into varibles
for (int i = 0; i < 26; i++){

    fileLineReader = readme.nextLine();
    System.out.println(fileLineReader);
    String[] burger = fileLineReader.split(",");
    fries = fries+Integer.parseInt(burger[1].trim());
    drpepper += Double.parseDouble(burger[2].trim());
}
    //this prints out the result
    System.out.println("average frequnciy "+fries/26);
    System.out.println("total percent "+drpepper);


 //this closes the scanner and logs errors
 readme.close();

} catch (IOException ex) {   
        System.getLogger(filethatmakesfiles.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            
         }           
}
}