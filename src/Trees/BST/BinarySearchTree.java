package Trees.BST;

public class BinarySearchTree {
    Node root;
    public Node insert(Node root,int value){
        if (root == null){
            return new Node(value);
        }
        if (value < root.data){
            root.left = insert(root.left,value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public void insert(int value){
        root = insert(root,value);
    }
    public void printManually() {
        if (root == null) {
            System.out.println("Nothing is there");
            return;
        }

        System.out.println("root data: " + root.data);

        if (root.left != null) {
            System.out.println("root left data: " + root.left.data);

            if (root.left.left != null) {
                System.out.println("root.left.left: " + root.left.left.data);
            }

            if (root.left.right != null) {
                System.out.println("root.left.right: " + root.left.right.data);
            }
        }

        if (root.right != null) {
            System.out.println("root right data: " + root.right.data);

            if (root.right.left != null) {
                System.out.println("root.right.left: " + root.right.left.data);
            }

            if (root.right.right != null) {
                System.out.println("root.right.right: " + root.right.right.data);
            }
        }
    }
    public  void inorder(Node node){
        if (node==null){
            return;
        }
        inorder(node.left);

        System.out.print(node.data+" ");
        inorder(node.right);
    }

}


