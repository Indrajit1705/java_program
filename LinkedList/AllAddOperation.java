package LinkedList;

public class AllAddOperation {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    public static Node head;
    public static Node tail;

    //add_first in linkedlist
    public void addFirst(int data){

        //step-1= create new node
        Node newNode = new Node(data);
        if(head == null){                               //if linkedlist is empty
            head = tail = newNode;
            return;
        }
        //step-2= newNode next = head
        newNode.next = head; //link
        //step-3= head = newNode
        head = newNode;
    }

    //add_last in linkedlist
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){                              //if linkedlist is empty
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //add in the middle
    public void addMiddle(int idx,int data){
    if(idx == 0){
        addFirst(data);
        return;
    }
    Node newNode = new Node(data);
    Node temp = head;
    int i = 0;
    while(i<idx-1){
        temp =temp.next;
        i++;
    }
    //i = idx-1; temp -> prev
    newNode.next = temp.next;
    temp.next = newNode;
    }


    //for print linked list we create a method for print
    public void print(){

        if(head == null){
            System.out.println("Ll is empty");          //if linkedlist is empty
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        AllAddOperation ll = new AllAddOperation();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addMiddle(2,9 );
        ll.print();

        
    }
}
