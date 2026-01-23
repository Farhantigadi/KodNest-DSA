package Trees.Kodnest.Preorder;

import java.util.LinkedList;
import java.util.Queue;

public class PreorderTraversal {
    static Node root;
    public static void preOrderTraversal(Node node){
        if(node == null){
            return;
        }
        if (node.data == 0){
            System.out.print("");
        } else {
            System.out.printf(node.data + ",");
        }
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
    public static Node insert(Node root,int data){
        if (root == null){
            return new Node(data);
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node temp = q.poll();
            if (temp.left == null){
                temp.left = new Node(data);
                break;
            } else {
                q.add(temp.left);
            }
            if (temp.right == null){
                temp.right = new Node(data);
                break;
            } else {
                q.add(temp.right);
            }
        }
     return root;
    }
    public static void insertData(int data){
       root=  insert(root,data);
    }

}
