// this program was written by Leo
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class filethatmakesfiles {
public static void main(String[] args) throws IOException {

    FileWriter filemaker= null;

    //this sets the varibles to be blank just incase so the computer doesn't read empty data
    String firstname = "";
    String lastname = "";
    String schoolyear = "";
    String school = "";

    try {
        
        //all of this reads keyboard input and sets it to the varibles
        Scanner keyboard= new Scanner(System.in);
        System.out.println("What is your first name?");
        firstname = keyboard.nextLine();
        System.out.println("What is your last name?");
        lastname = keyboard.nextLine();

        System.out.println("What year are you");
        schoolyear = keyboard.nextLine();

        System.out.println("What school do you go to?");
        school = keyboard.nextLine();
        System.out.println("hello "+firstname+" "+lastname+" your age is "+schoolyear);
        System.out.println("your school is "+school);
                filemaker = new FileWriter("student.txt");

        //this writes to the file
        filemaker.append(firstname+"\n"+lastname+"\n");

        filemaker.append(school+"\n"+schoolyear);

        filemaker.close();

    } catch (IOException ex) {   
        System.getLogger(filethatmakesfiles.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
    } finally {

        try {
            filemaker.close();
        } catch (IOException ex) {
            System.getLogger(filethatmakesfiles.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
}

