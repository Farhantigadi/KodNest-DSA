package Trees.Kodnest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DistributeWorkLoad bst = new DistributeWorkLoad();
        Scanner sc = new Scanner(System.in);
       String str [] = sc.nextLine().split(",");
        for (int i = 0; i < str.length; i++) {
            bst.insertdata(Integer.parseInt(str[i]));
        }
        bst.inorder(bst.root);
    }
}
