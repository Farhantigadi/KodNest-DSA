package Stack;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
   int arr [] = new int[5];
   MyStack stack = new MyStack(arr);
   stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(60);

        stack.peek();
        stack.pop();
        stack.peek();
        stack.display();
        stack.push(70);
        stack.display();
        stack.push(80);
    }
}
class MyStack{
int []  arr;
int top;
MyStack(int [] arr){
    this.arr = arr;
    this.top = -1;
}
public void push(int data){

    if(top >= arr.length){
        System.out.println("Memory exceed");
        return;
    }
    top++;
    arr[top] = data;
    System.out.println("pushed data " + data);
}
public void peek(){
    if (top == -1){
        System.out.println("Stack is empty");
        return;
    }
    int data = arr[top];
    System.out.println("peek data "+data);
}
public void pop(){
    if (top == -1){
        System.out.println("Stack is empty");
        return;
    }

    int data = arr[top];
    System.out.println("pop the data "+data);
    top--;
}
public void display(){
    if (top == -1){
        System.out.println("Stack is empty");
        return;
    }
    for (int i = top; i >=0 ; i--) {
        System.out.print(this.arr[i]+" ");
    }
    System.out.println();
}
}

