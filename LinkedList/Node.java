//By Kim.gross@malad.us
//Sample linked list node class for my students to use as a starting point for their linked list.  This is not a complete implementation, but it should be enough to get you started.  You will need to add some methods to this class, and you will need to create a StudentObject class.  The StudentObject class should have

public class Node {

    Node next;
    Node previous;
    StudentObject data;
    // constructor for the node class.  Takes in an object to store in the data field, and a node to point to as the next node in the list.  The previous node is set to null by default, but can be set using the setPrevious method.


    Node (StudentObject data, Node next,Node previous){
        this.data=data;
        this.next=next;
        this.previous=previous;
        }
// getter and setter methods for the node class.  These are used to set and get the data, next and previous fields of the node.  You will need to use these methods in your linked list implementation to manipulate the nodes in the list.
    public void setNext(Node next){
            this.next=next;
        }

    public void setPrevious (Node previous){
            this.previous=previous;
        }

    public Node getNext(){
            return next;
        }

    public Node getPrevious(){
            return previous;
        }

    public void setData(StudentObject data){
            this.data=data;
        }

    public StudentObject getData(){
        return data;

    }    

}