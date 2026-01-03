class Node{
    int val;
    Node next;

    Node(int data){
        val=data;
        next=null;
    }
}

class LinkedList{
    Node head;

    LinkedList() {
        head=null;
    }

    // insert at head

    public void insertAtHead(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    // insert at tail

    public void insertAtTail(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    // insert at middle position (0-based)

    public void insertAtMiddlePosition(int data,int pos){
        if(pos==0){
            insertAtHead(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        int currPos=0;

        while(currPos!=pos-1){
            temp=temp.next;
            currPos++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    // update element at given position

    public void updateElementAtPosition(int data,int pos){
        Node temp=head;
        int currPos=0;

        while(currPos!=pos){
            temp=temp.next;
            currPos++;
        }
        temp.val=data;
    }

    // delete alternate element

    public void deleteAlternate(){
        Node curr=head;

        while(curr!=null && curr.next!=null){
            Node temp=curr.next;
            curr.next=curr.next.next;
            temp=null;   // garbage collection handled by jvm
            curr=curr.next;
        }
    }

    // display linkedlist

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val + "->");
            temp=temp.next;
        }
        System.out.print("null");
    }

}

public class _1implementationLinkedlist {
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtHead(10);
        ll.insertAtTail(20);
        ll.insertAtTail(30);
        ll.display();
        // insert at position

        System.out.println("\ninsert at any middle postition : ");
        ll.insertAtMiddlePosition(25, 2);
        ll.display();

        // update at position

        System.out.println("\nupdation at position 2");
        ll.updateElementAtPosition(26,2);
        ll.display();

        // delete alternate
        System.out.println("\ndelete at alternate");

        ll.deleteAlternate();
        ll.display();
    }
}
