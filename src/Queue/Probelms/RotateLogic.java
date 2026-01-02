package Queue.Probelms;

public class RotateLogic {
    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        display();
        WorkQueue(2);
        display();

    }
    static int size;
  static   Nodee front;
   static Nodee rear;
    public static void enqueue(int data){
         Nodee nodee = new Nodee(data);
         if (front == null){
             front = rear = nodee;
             rear.next=front;
         } else {
             rear.next = nodee;
             rear = nodee;
             rear.next=front;
         }
         size++;
    }
    public static void display(){

        Nodee temp = front;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }
    public static void WorkQueue(int steps){
        if (front == null || steps <= 0) return;
        steps = steps % size;  // normalize if steps > size
        for (int i = 0; i < steps; i++) {
            front = front.next;
            rear = rear.next;
        }
    }
}
class Nodee{
   int data;
    Nodee next;
    Nodee(int data){
        this.data=data;
    }
}

