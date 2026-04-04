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

    public void insertAtTail(int data) {
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

    // sorting 
    public void sorting012(Node head) {
        if(head == null && head.next == null) return;

        Node temp = head;

        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);

        Node zero = zeroHead;
        Node one = oneHead;
        Node two= twoHead;

        while(temp != null) {

            if(zero.val == 0) {
                zero.next = temp;
                zero = zero.next;
            }
            else if(one.val == 1) {
                one.next = temp;
                one = one.next;
            }
            else {
                two.next = temp;
                two = two.next; 
            }

            temp = temp.next;
        }


        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;


    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val + "->");
            temp=temp.next;
        }
        System.out.print("null");
    }

}

public class _4Sort012 {
    public static void main(String []args) {
        LinkedList ll = new LinkedList();
        ll.insertAtTail(1);
        ll.insertAtTail(2);
        ll.insertAtTail(2);
        ll.insertAtTail(1);
        ll.insertAtTail(2);
        ll.insertAtTail(0);
        ll.insertAtTail(2);
        ll.insertAtTail(2);
        ll.display();
    }
}

