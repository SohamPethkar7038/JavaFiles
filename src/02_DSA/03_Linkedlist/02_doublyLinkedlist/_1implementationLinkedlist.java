class Node{
    int val;
    Node next;
    Node prev;
    Node(int data){
        val=data;
        next=null;
        prev=null;
    }
}

class DoublyLL{
    Node head;
    Node tail;

    public DoublyLL() {
        head=tail=null;
    }

    public void insertAtHead(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    public void insertAtTail(int data){
        Node newNode=new Node(data);
        if(tail==null){
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }

    public void insertATMiddle(int data,int pos){
        if(pos==0){
            insertAtHead(data);
            return;
        }
        Node temp=head;
        int currPos=0;

        while(currPos!=pos-1 && temp!=null){
            temp=temp.next;
            currPos++;
        }

        if(temp==tail){
            insertAtTail(data);
        }

        Node newNode=new Node(data);

        newNode.next=temp.next;
        newNode.prev=temp;

         temp.next.prev = newNode;
        temp.next = newNode;
    }

    public void insertUpdateElement(int data,int pos){
        Node temp=head;
        int currPOs=0;

        while(currPOs!=pos && temp!=null){
            temp=temp.next;
            currPOs++;
        }

        if(temp!=null){
            temp.val=data;
        }
    }


    public void deleteFront(){
        if(head==null){
            System.out.println("list is empty");
        }

        if(head==tail){
            head=tail=null;
            return;
        }
        Node temp=head;
        head=head.next;
        head.prev=null;
        temp=null;
    }

    public void deleteAtTail(){
        if(tail==null){
            System.out.println("list is empty");
            return;
        }

        if(head==tail){
            head=tail=null;
            return;
        }

        tail=tail.prev;
        tail.next=null;
    }
    
    public void display(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.val+"<->");
        temp=temp.next;
    }
    System.out.println("null");
}
}

public class _1implementationLinkedlist{

public static void main(String[] args){
    DoublyLL ll=new DoublyLL();
    ll.insertAtHead(10);
    ll.insertAtHead(20);
    ll.insertAtHead(30);
    ll.insertAtTail(40);
    ll.insertATMiddle(100, 1);

    ll.display();

}
}