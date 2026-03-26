

public class stackofqueues {
public static void main(String[] args){

LinkedListTest Storage = new LinkedListTest();

LinkedListTest Stack = new LinkedListTest();

LinkedListTest Queue = new LinkedListTest();

for (int i = 1; i<11; i++){

Storage.addNode(new StudentObject("Student "+i,"address",""+i));    
}

Storage.addNode(new StudentObject(null,null,null));


System.out.println("Student 1 and Student 2 get in line to pay for the new game");
Queue.enQueue(Storage.removeHead());
Queue.enQueue(Storage.removeHead());
System.out.println("Two students enter the queue");

System.out.println(Queue.deQueue()+" Checked out");

Queue.enQueue(Storage.removeHead());
Queue.enQueue(Storage.removeHead());
System.out.println("Two more students enter the queue");

System.out.println(Queue.deQueue()+" Checked out");
System.out.println(Queue.deQueue()+" Checked out");

for (int i = 0; i < 6; i++) {
   Queue.enQueue(Storage.removeHead()); 
}
System.out.println("Six more students enter the queue");


//It crashes if the linked list in empty 
//so I made this dataless object to put in at the end
Queue.addNode(new StudentObject(null,null,null)); 


for (int i = 0; i < 7; i++) {
   System.out.println(Queue.deQueue()+" Checked out"); 
}



for (int i = 1; i<11; i++){

Storage.addNode(new StudentObject("Game copy #"+i,"Store",""+i));    
}

System.out.println("\s");
System.out.println("Games are being stacked on shelves");

for (int i = 1; i<6; i++){
Stack.push(Storage.removeHead());
}

System.out.println("Five games were stacked on the shelves");

System.out.println(Stack.pop()+" Checked out");

}
}