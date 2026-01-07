package Queue.Probelms;

import java.util.Scanner;

public class CallCenterQueue {
    static Node3 front;
    static Node3 rear;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String []str = sc.nextLine().split(",");
        String QueueCalls [] = sc.nextLine().split(",");

        for (int i = 0; i < str.length; i++) {
            int a = Integer.parseInt(str[i]);
            enqueue(a);
        }
        display();
        for (int i = 0; i < QueueCalls.length; i++) {
            Node3 temp = front;
            Node3 prev = front;
            Node3 curr = front.next;
            while (temp!=null){
                if (QueueCalls[i].equals(prev.data)){
                    prev = prev.next;
                } else {
                    
                }
                temp=temp.next;
            }
        }

    }
    public static void enqueue(int data){
        Node3 node3 = new Node3(data);
        if (front == null){
            front = rear = node3;
        } else {
            rear.next = node3;
            rear = node3;
        }
    }
    public static void CallCenterQueue(){

    }
    public static void display(){
        Node3 temp = front;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Node3{
    Node3 next;
    int data;
    Node3(int data){
        this.data=data;
    }
}
