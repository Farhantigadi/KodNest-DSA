package Trees.Kodnest;
import java.util.*;

public class DistributeWorkLoad {
    Node root;
    public Node insert(Node root,int data){
        if (root == null){
            return new Node(data);
        }
        if (data < root.data){
            root.left = insert(root.left,data);
        } else if(data > root.data) {
            root.right = insert(root.right,data);
        }
        return root;
    }
    public void insertData(int data){
        root = insertBT(root,data);
    }

    public void inorder(Node node){
        if (node == null){
            return;
        }
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }

    public Node insertBT(Node root, int data) {

        // Case 1: Tree empty
        if (root == null) {
            return new Node(data);
        }


        // Case 2: Tree not empty → level order traversal
        Queue<Node> q = new LinkedList<>();
        q.add(root);



        while (!q.isEmpty()) {
            Node temp = q.poll();


            // LEFT child
            if (temp.left == null) {
                temp.left = new Node(data);
                break;
            } else {
                q.add(temp.left);
            }

            // RIGHT child
            if (temp.right == null) {
                temp.right = new Node(data);
                break;
            } else {
                q.add(temp.right);
            }
        }
        return root;
    }

}
