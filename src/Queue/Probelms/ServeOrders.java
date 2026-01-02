package Queue.Probelms;

import java.util.Scanner;

public class ServeOrders {
    static Node2 front;
    static Node2 rear;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(",");

         for (String s : str) {
            enqueue(Integer.parseInt(s.trim()));
        }

         serveOrders();
    }

     public static void enqueue(int data) {
        Node2 node = new Node2(data);
        if (front == null) {
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
    }

     public static void serveOrders() {
        StringBuilder result = new StringBuilder();

        while (front != null) {

             if (front.data % 3 == 0) {
                result.append(front.data).append(",");
                front = front.next;

                if (front == null) {
                    rear = null;
                }
            }
             else {
                 if (front == rear) {
                    result.append(front.data).append(",");
                    front = rear = null;
                } else {
                    Node2 temp = front;

                     while (temp.next != rear) {
                        temp = temp.next;
                    }

                    result.append(rear.data).append(",");
                    temp.next = null;
                    rear = temp;
                }
            }
        }

         System.out.println(result.substring(0, result.length() - 1));
    }
}

class Node2 {
    int data;
    Node2 next;

    Node2(int data) {
        this.data = data;
    }
}
