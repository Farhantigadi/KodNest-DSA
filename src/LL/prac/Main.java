package LL.prac;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.display();
        list.swapNodes();
        list.display();
        list.reverseLL();
        list.display();
    }
}
