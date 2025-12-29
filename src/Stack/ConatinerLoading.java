package Stack;

import java.util.Scanner;

public class ConatinerLoading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackLL2 stack = new StackLL2();
        int a = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < a; i++) {
            String line = sc.nextLine().trim();
            if (line.equals("UNLOAD")){
                stack.pop();
            } else {
                stack.push(line);
            }
        }
        stack.display();
    }
}
class StackLL2{
    Node head;
    class  Node{
        String data;
        Node next;
        
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    public void push(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Pushed data: " + data);
    }

    public void pop() {
        if (head == null) {
            System.out.println("Stack is empty");
            return;
        }
        head = head.next;
    }
    public void display(){
       displayReverse(head);
    }
    public void displayReverse(Node node){
        if (node == null){
            return;
        }
        displayReverse(node.next);
        System.out.print(node.data+" ");
    }
}
