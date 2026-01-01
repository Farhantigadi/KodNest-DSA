package Queue.UsingArray;

public class QueueArray {
    public static void main(String[] args) {
        int arr [] = new int[5];
     Queuee queuee = new Queuee(arr);
        queuee.enqueue(1);
        queuee.enqueue(2);
        queuee.enqueue(3);
        queuee.enqueue(4);
        queuee.enqueue(5);
        queuee.display();
        queuee.peek();
        queuee.dequeue();
        queuee.display();
    }
}

class Queuee{
    int [] arr;
    int front = 0;
    int rear = 0;
int data;
    Queuee(int [] arr){
        this.arr=arr;
    }
    public  void enqueue(int data){
        if (rear == arr.length ){
            System.out.println("Queue is full");
            return;
        }
        arr[rear++] = data;
    }
    public  void dequeue(){
        if (front == rear){
            System.out.println("Array is empty ");
            return;
        }
        int removed = arr[front++];
        System.out.println(removed+ " dequeed");

    }
    public void peek(){
        if (front == rear){
            System.out.println("queue is empty");
            return;
        }
        System.out.println(arr[front]+" peeked");
    }

    public void display(){
        for (int i = front; i < rear; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}