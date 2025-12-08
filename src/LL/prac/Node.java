package LL.prac;

public class Node {
    Node next;
    int data;

    public Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
    public Node(int data){
        this.data=data;
    }
}

class LL{
    Node head;

    public void add(int data){
        Node newNode = new Node(data);
        Node temp = head;
        if (head==null){
            head=newNode;
            return;
        }
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void display(){
        Node temp = head;
        if (head==null){
            System.out.println("No elements");
            return;
        }
        while (temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    public void rotate(){
        Node temp = head;
        if (head==null){
            return;
        }
        while (temp.next.next!=null){
            temp=temp.next;
        }

        Node last = temp.next;
        temp.next=null;
        last.next=head;
        head=last;

    }
    public void swapNodes(){
        if (head==null && head.next==null){
            return;
        }
        Node newhead = head.next;
        Node curr = head;
        Node prev = null;

     while (curr!=null && curr.next!=null){
         Node second = curr.next;
         Node nextPair = curr.next.next;

         second.next=curr;
         curr.next=nextPair;

         if (prev!=null){
             prev.next=second;
         }
         prev=curr;
         curr=nextPair;

         head=newhead;
     }
    }
    public void reverseLL(){
        Node nextNode;
        Node curr = head;
        Node prev = null;

        while (curr!=null){
            nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        head=prev;
    }



}
