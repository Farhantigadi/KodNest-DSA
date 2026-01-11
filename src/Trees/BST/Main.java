package Trees.BST;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(10);
        bst.insert(15);
        bst.insert(25);
        bst.insert(35);
//  bst.printManually();
  bst.inorder(bst.root);

    }
}
