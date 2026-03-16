import java.util.Scanner;

//code by Kim Gross, edited by Leo

public class LinkedListWrapper {

    public static void main(String[] args){
        System.out.println("This program uses a student object that is stored in a linked list.  The student object has a name, address and studentID");
        System.out.println("This is to help explain a linked list.  this program will create 4 student objects, and add them to the linked list");
        System.out.println("Your linked list will need more methods than this. You will need to be able to traverse the linked list using the data in the nodes");
        LinkedListTest studentList=new LinkedListTest();

        StudentObject student=new StudentObject("Fred","Here","12");
        studentList.addNode(student);
        student=new StudentObject("Jane","There","13");
        studentList.addNode(student);
        student=new StudentObject("Kate","Everywhere","14");
        studentList.addNode(student);
        student=new StudentObject("Tre","Nowhere","15");
        studentList.addNode(student);
        student=new StudentObject("Clyde.","Somewhere","16");
        studentList.addNode(student);
        
        //this sets up keyboard input and the varibles that are used in the loop
        Scanner keyboard = new Scanner(System.in);
        String userInputName = null;
        String userInputAddress = null;
        String userInputID = null;

        //this is a loop that asks for data for 5 different students
        for (int i = 0; i < 5; i++) {
            
        System.out.println("Please input the name of a Student");
        userInputName = keyboard.nextLine();

        System.out.println("Please input the student's address");
        userInputAddress = keyboard.nextLine();

        System.out.println("Please input the student's studentID");
        userInputID = keyboard.nextLine();


        
        student=new StudentObject(userInputName,userInputAddress,userInputID);
        studentList.addNode(student);
        }

        // I can't get insertNode to work
        // I'm trying to set current to head then set current to one before that
        // then insertNode(student) should put the test studentObject I made after current which should mean that it's where the head was
        studentList.getHead();
        studentList.getPrevious();
        student=new StudentObject("test","test","test");
        studentList.insertNode(student);


        //this makes blank lines to see the result easier
        System.out.println("\s");
        System.out.println("\s");

        // gets the student at the head of the list, and then prints out each student until it reaches the tail. 
        student=studentList.getHead();
        System.out.println(student);
        while (studentList.hasNext()){
          
            student=studentList.getNext();
            System.out.println(student);
        }

           System.out.println("\s");
           System.out.println("This had read from head to tail"); 
           System.out.println("\s");

        // gets the student at the tail of the list, and then prints out each student until it reaches the head.
        student=studentList.getTail();
        System.out.println(student);
        while (studentList.hasPrevious()){
            
            student=studentList.getPrevious();
            System.out.println(student);
            
        }
            
            System.out.println("\s");
            System.out.println("This had read from tail to head");
            System.out.println("\s");

    }

}
// sorry this isn't all the requirements
// I couldn't get it to work