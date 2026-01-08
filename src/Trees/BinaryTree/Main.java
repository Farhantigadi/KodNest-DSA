package Trees.BinaryTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] data = sc.nextLine().split(",");
        int values[] = new int[7];
        for (int i = 0; i <values.length; i++) {
         values[i] = Integer.parseInt(data[i]);
        }
        BinaryTree tree = new BinaryTree(values);

        System.out.println("Root Node: " + tree.root.data);
        System.out.println("Left Child of Root: " + tree.root.left.data);
        System.out.println("Right Child of Root: " + tree.root.right.data);
        System.out.println("Left Child of Node " + tree.root.left.data + ": " + tree.root.left.left.data);
        System.out.println("Right Child of Node " + tree.root.left.data + ": " + tree.root.left.right.data);
        System.out.println("Left Child of Node " + tree.root.right.data + ": " + tree.root.right.left.data);
        System.out.println("Right Child of Node " + tree.root.right.data + ": " + tree.root.right.right.data);
        sc.close();
    }
}

