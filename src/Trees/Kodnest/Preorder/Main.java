package Trees.Kodnest.Preorder;

import java.util.Scanner;

import static Trees.Kodnest.Preorder.PreorderTraversal.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] str = sc.nextLine().split(",");
        for (String s : str){
            if (s.isEmpty()){
                insertData(0);
            } else {
                int a = Integer.parseInt(s);

                insertData(a);
            }
        }
        preOrderTraversal(root);
    }
}
