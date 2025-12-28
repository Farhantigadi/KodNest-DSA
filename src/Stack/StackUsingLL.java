package Stack;

public class StackUsingLL {
    public static void main(String[] args) {
 StackLL stack = new StackLL();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
        stack.peek();
        stack.pop();
        stack.display();
    }
}

 class StackLL{
    Node top;
    class Node{
     int data;
     Node next;

     Node(int data){
         this.data= data;
         this.next=null;
     }
    }
    public void push(int data){
       Node newNode = new Node(data);
       newNode.next=top;
       top=newNode;
        System.out.println("Pushed data " +data);
    }

    public void peek(){
        if (top == null){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(top.data);
    }
    public void pop(){
        if (top == null){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(top.data);
        top = top.next;
    }
    public void display(){
        if (top == null){
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;

        while (temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
 }
