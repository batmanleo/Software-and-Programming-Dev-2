//this program is written by Leo
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class filethatreadfiles {
public static void main(String[] args) throws IOException {

//this sets the varibles to be blank just incase so the computer doesn't read empty data
String firstname = "";
String lastname = "";
String schoolyear = "";
String school = "";

try {
//this sets up the file and file reader
File fileseer= new File("student.txt");
Scanner readme= new Scanner(fileseer);

//this sets the different lines of the file to varibles
 firstname = readme.nextLine();
 System.out.println(firstname);
 lastname = readme.nextLine();
 System.out.println(lastname);
 school = readme.nextLine();
 System.out.println(school);
 schoolyear = readme.nextLine();
 System.out.println(schoolyear);

System.out.println("Student's first name is "+firstname+" student's last name is "+lastname+" student attends "+school+" student is a high school "+schoolyear);

 readme.close();

} catch (IOException ex) {   
        System.getLogger(filethatmakesfiles.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            
         }
            
}

}
