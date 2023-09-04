/datastructures in Java
/*
there are two datatypes-
1.primitive datatype used to define the type of data and specify the functions
2.abstract datatype- list stack(lifo) queue(fifo)  map
first application seen in last app we used and is called lifo (stack)-ordering of application 
map-key value pair....hashmap
list-..array list ,linked list
*/

/* arrays-contiguous memory, fetching of elements by index number, once declared the size of array it is not possible 
to expand or shrink the size.
this cons can be overcome by dynamic array
which may cause wastage of memory to reduce this we use linked list
   
*/

/* linked list-collection of elements and every elements linked with each other 
1.singly linked list-it is slow in accessing the elements than array but insertion and deletion is much better than array
*/
public class Node{
    int data;
    Node next;
}
// in java more than one public cannot be stored in same file so create a file with the class name.
// example-- Runner.java, LinkedList.java , Node.java
public class Runner{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(8);
        list.insert(0);
        list.insert(1);
        list.insert(3);
        list.show();
      
    }
}
public class LinkedList{
    Node head;
    public void insert(int data){
        Node node=new Node();
        node.data=data;
        if(head==null){
            head=node;
        }
        else{
            Node n=head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=node;
        }
    }
    public void show(){
        Node node=head;
        System.out.print("[");
        while(node.next!=null){
            System.out.print(node.data+",");
            node=node.next;
        }
        System.out.print(node.data+"]");
    }
}
