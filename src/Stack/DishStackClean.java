package Stack;

import java.util.Scanner;

public class DishStackClean {
   static Node2 head=null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int washNumber = sc.nextInt();
        sc.nextLine();
        int count =0;

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            push(data);
            count ++;

            if (count == washNumber){

                // head == null which is best approach instea of while loop
                 while (head != null){
                     pop();
                 }
                 count = 0;
            }

        }
        if (head==null){
            System.out.println("All are vanished");
        } else {
display();
        }

    }
    public static void push(int data){
        Node2 newNode = new Node2(data);
        newNode.next=head;
        head=newNode;
    }
    public static void pop(){
        if (head == null) return;
        head = head.next;
    }
    public static void display() {
        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}
class Node2{
    int data;
    Node2 next;
    Node2(int data){
        this.data=data;
        this.next=null;
    }
}

