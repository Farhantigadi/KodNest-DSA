package Queue.UsingLL;

public class QueueLL {
    public static void main(String[] args) {
  Queue q = new Queue();

  q.dequeue();
  q.enqueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display();
        q.dequeue();
        q.peek();
        q.display();
    }
}

class Queue{
     Node head;
     Node front , rear = null;
     class Node{
         Node next=null;
         int data;

         Node(int data){
             this.data=data;
         }
     }
     public void enqueue(int data){
         Node node = new Node(data);
         if (front == null){
             front = rear = node;
         } else {
             rear.next=node;
             rear=node;
         }
     }
     public void dequeue(){
         if (front == null){
             System.out.println("Queue is empty");
             return;
         }
         int removed = front.data;
          front = front.next;

          if (front == null){
              rear = null;
          }
         System.out.println("Dequed data is: "+removed);
     }
     public void peek(){
         if (front == null){
             System.out.println("Queue is empty");
             return;
         }
         System.out.println(front.data);
     }
     public void display(){
         if (front == null){
             System.out.println("Queue is empty");
             return;
         }
       Node temp = front;
       while (temp!=null){
           System.out.print(temp.data+" ");
          temp= temp.next;
       }
         System.out.println();
     }
}
