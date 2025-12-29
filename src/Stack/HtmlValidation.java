package Stack;

import java.util.Scanner;

public class HtmlValidation {
    static Node head;
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean valid = true;
sc.nextLine();
        for (int i = 0; i < a; i++) {

            String tag = sc.nextLine().trim();

            //For Input validation
            if (!tag.startsWith("<") || !tag.endsWith(">")) {
                valid = false;
                break;
            }
            //For self-closing tag
            if (tag.endsWith("/>")) {
                continue;
            }
            if (tag.startsWith("</")){
                String closingtag = tag.substring(2,tag.length()-1);
                if (top()!=null && closingtag.equals(top())){
                    pop();
                } else {
                    valid = false;
                    break;
                }
            } else {
                String openingtag = tag.substring(1,tag.length()-1);
                push(openingtag);
            }
        }
        if (valid && head == null) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }
    }
    public static void push(String tag){
        Node newNode = new Node(tag);
        newNode.next=head;
        head = newNode;
    }
    public static void pop(){
        if (head == null) return;
        head = head.next;

    }
    public static String top(){
        if (head == null)  return null;
        return head.tag;
    }

}
class Node{
    Node next;
    String tag;

    Node(String tag){
        this.tag=tag;
        this.next=null;
    }
}
