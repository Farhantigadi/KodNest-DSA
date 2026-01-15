package Trees.Kodnest;

 import java.util.*;

public class RetrivePlantID {
    Node root;

    public Node insertBinaryData(int data,Node root){
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
    public void insert(int data){
        root = insertBinaryData(data,root);
    }
    public void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


    public static void main(String[] args) {
        RetrivePlantID rt = new RetrivePlantID();
        Scanner sc = new Scanner(System.in);
        String [] str = sc.nextLine().split(",");
        for (int i = 0; i <str.length; i++) {
        int a = Integer.parseInt(str[i]);
        rt.insert(a);
        }
        rt.inorder(rt.root);
    }
}
