package Trees.BinaryTree;

public class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
    }
}
class BinaryTree{
    Node root;
    BinaryTree(int [] values){
        root = new Node(values[0]);
        root.left = new Node(values[1]);
        root.right = new Node(values[2]);
        root.left.left = new Node(values[3]);
        root.left.right = new Node(values[4]);
        root.right.left = new Node(values[5]);
        root.right.right = new Node(values[6]);
    }
}
