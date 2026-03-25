

public class stackofqueues {
public static void main(String[] args){

LinkedListTest Storage = new LinkedListTest();

LinkedListTest Stack = new LinkedListTest();

LinkedListTest Queue = new LinkedListTest();

for (int i = 1; i<11; i++){

Storage.addNode(new StudentObject("Student "+i,"address",""+i));    
}


System.out.println("Student 1 gets in line to pay for the new game");
Queue.enQueue(Storage.removeHead());
Queue.enQueue(Storage.removeHead());
System.out.println("Two students enter the queue");

System.out.println(Queue.deQueue()+" Checked out");

Queue.enQueue(Storage.removeHead());
Queue.enQueue(Storage.removeHead());
System.out.println("Two more students enter the queue");

System.out.println(Queue.deQueue()+" Checked out");
System.out.println(Queue.deQueue()+" Checked out");


}
}