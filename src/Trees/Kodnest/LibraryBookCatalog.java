package Trees.Kodnest;

import java.util.Scanner;

public class LibraryBookCatalog {
    static Node root;
    public static  Node insertBSTData(int data,Node root){
        if (root == null){
            return new Node(data);
        }
        if (data <root.data) {
            root.left = insertBSTData(data,root.left);
        } else if (data > root.data){
            root.right = insertBSTData(data,root.right);
        }
        return root;
    }
    public static void insert(int data){
        root = insertBSTData(data,root);
    }
    public static void inorder(Node node){
        if (node == null){
            return;
        }
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String [] str = sc.nextLine().split(",");
        for (int i = 0; i < str.length; i++) {
            int a = Integer.parseInt(str[i]);
            insert(a);
        }
        inorder(root);
    }
}
