package LL.Kunal;

public class LL {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void insertFirst(int data) {
        Node newnode = new Node(data);
        newnode.next=head;
        head=newnode;
    }
    public void display(){
        Node temp  = head;
        while (temp!=null){
            System.out.println(temp.data +"->");
            temp= temp.next;
        }
        System.out.println("Null");
    }
    public void insertent(int data){
        Node newnode = new Node(data);
        if (head==null){
           head=newnode;
           return;
        }
      Node temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public void deletebyvalue(int data){
        Node temp = head;
        if (temp==null){
            System.out.println("No LL");
            return;
        }
        if (head.data == data){
            head= head.next;
            return;
        }


        while (temp.next !=null && temp.next.data!=data){
            temp= temp.next;
        }
        if (temp.next == null){
            System.out.println("Noo data");
            return;
        }
        temp.next = temp.next.next;
    }
}


