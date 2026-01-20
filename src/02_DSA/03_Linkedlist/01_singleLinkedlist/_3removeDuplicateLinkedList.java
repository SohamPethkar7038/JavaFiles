// Given a sorted linked list, delete all nodes that have duplicate numbers (all occurrences), leaving only numbers that appear once in the original list, and return the head of the modified linked list. 

// Input: Linked List = 23->28->28->35->49->49->53->53
// Output: 23 35


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
    public Node removeDuplicate(Node head){
        Node result= new Node(0); // dummmy node
        Node temp=result;

        Node curr=head;

        while(curr!=null){
            if(curr.data==curr.next.data){
                int duplicateValue=curr.data;
                
                while(curr!=null && curr.data==duplicateValue){
                        curr=curr.next;
                }
            }

            else{
                temp.next=curr;
                temp=temp.next;
                curr=curr.next;
            }
        }
        temp.next=null;
        return result.next;
    }
}


public class _3removeDuplicateLinkedList{
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insertAtHead(23);
        ll.insertAtTail(28);
        ll.insertAtTail(28);
        ll.insertAtTail(35);
        ll.insertAtTail(49);
        ll.insertAtTail(49);

        System.out.println("complete linkedlist");
        ll.display();
        System.out.println("\n");

        Solution sol=new Solution();

        ll.head=sol.removeDuplicate(ll.head);

        System.out.println("elements without duplicate values :");
        ll.display();


        
    }
}