package Trees.Kodnest;

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
    public void insertdata(int data){
        root = insert(root,data);
    }

    public void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
}
