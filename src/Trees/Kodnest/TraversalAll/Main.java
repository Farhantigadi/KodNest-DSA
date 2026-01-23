package Trees.Kodnest.TraversalAll;


import static Trees.Kodnest.TraversalAll.TraversalAll.*;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,7,10};
        for (int i = 0; i < arr.length; i++) {
            insertBTData(arr[i]);
        }
        System.out.print("PreOrder: ");
        preOrderTraversal(root);
        System.out.println();
        System.out.print("InOrder: ");
        inorder(root);
        System.out.println();
        System.out.print("PostOrder: ");
        postOrder(root);
        System.out.println();

    }
}
