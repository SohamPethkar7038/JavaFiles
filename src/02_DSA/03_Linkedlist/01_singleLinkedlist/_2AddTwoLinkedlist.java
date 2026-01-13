// problem

// You are given the head of two singly linked lists head1 and head2 representing two non-negative integers. You have to return the head of the linked list representing the sum of these two numbers.

// Note: There can be leading zeros in the input lists, but there should not be any leading zeros in the output list.

// eg ll1 = 0->0->6->3->null
//    ll2 = 0->7->null
// output : 7->0->null


class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        next=null;
    }
}

class LinkedList{
    Node head;

    public LinkedList() {
        head=null;
    }

    public void insertAtHead(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void insertAtTail(int data){
        Node newNode=new Node(data);
        if(head==null){
            insertAtHead(data);
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }

    void display(){
        Node curr=head;

        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.print("null");
    }
}

class Solution{

    // remove leading zeroes
    Node leadingZeroes(Node head) {
        while(head!=null && head.data==0){
            head=head.next;
        }
        return head==null ? new Node(0) : head;
    }

    // reversing the linkedlist for actual mathematics for unit places.
    Node reverseLinkedList(Node head){
        Node prev=null;
        
        while(head!=null){
            Node next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }


    // add two linkedlist

    public Node addTwoLinkedlist(Node head1, Node head2){

        // leading zeros

        head1=leadingZeroes(head1);
        head2=leadingZeroes(head2);

        // reversing linkedlist

        head1=reverseLinkedList(head1);
        head2=reverseLinkedList(head2);

        // addition logic

        Node result=new Node(-1);
        Node curr=result;
        int carry=0;

        while(head1!=null || head2!=null){

            int sum=0+carry;

            if(head1!=null){
                sum+=head1.data;
                head1=head1.next;
            }

            if(head2!=null){
                sum+=head2.data;
                head2=head2.next;
            }

            carry=sum/10;
            sum=sum%10;
            
            curr.next=new Node(sum);
            curr=curr.next;
        }
        if(carry==1){
            curr.next=new Node(carry);
        }
        return reverseLinkedList(result.next);
    }
}

public class _2AddTwoLinkedlist {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        ll1.insertAtTail(1);
        ll1.insertAtTail(2);
        ll1.insertAtTail(3);

        LinkedList ll2=new LinkedList();
        ll2.insertAtTail(9);
        ll2.insertAtTail(9);
        ll2.insertAtTail(9);

        System.out.println("List 1: ");
        ll1.display();
        System.out.println("\n");

        System.out.println("List 2: ");
        ll2.display();
        System.out.println("\n");
       
        
        Solution sol=new Solution();
        Node resultHead=sol.addTwoLinkedlist(ll1.head, ll2.head);


         // 😎 Wrap result in LinkedList to reuse display()

         LinkedList resultList=new LinkedList();
         resultList.head=resultHead;

         System.out.println("addition :");
         System.out.println("\n");

         resultList.display();
         System.out.println("\n");

    }
}
