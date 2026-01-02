package Queue.Probelms;

import java.util.Scanner;

public class QueueProbelms {
    static Node front,rear =null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr [] = sc.nextLine().split(",");


        for (int i = 0; i <arr.length ; i++) {
            String names = arr[i];
            enqueue(names);
        }
        display();
    }
    public static void enqueue(String data){
        Node node = new Node(data);
        if (front == null){
            front = rear = node;
        } else {
            rear.next=node;
            rear = node;
        }
    }
    public static void moveVipFirst(String vip){
        if (front == null || front.data.equals(vip)) {
            return;
        }
        Node prev = front;
        Node curr = front.next;

        while (curr != null){
            if (curr.data.equals(vip)){
                prev.next = curr.next;

                if (curr == rear){
                    rear = prev;
                }
                curr.next= front;
                front=curr;

                return;
            }
            front = curr;
            curr = curr.next;

        }


    }
    public static void display(){
        Node temp = front;
        while (temp!=null){
            System.out.print(temp.data+",");
            temp = temp.next;
        }
    }

}
class Node {
    String data;
    Node prev;
    Node next;
    Node(String data){
        this.data=data;
    }
}
