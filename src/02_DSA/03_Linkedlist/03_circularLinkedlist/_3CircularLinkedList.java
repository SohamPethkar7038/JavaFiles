class Node{
    int val;
    Node next;
    
    Node(int data){
        val=data;
        next=null;
    } 
}

class CircularLL{
    Node head;
    Node tail;

    public CircularLL() {
        head=tail=null;
    }

    public void insertAtHead(int data){
        Node newNode=new Node(data);

        if(head==null){
            tail=head=newNode;
            return;
        }
    }
    
}