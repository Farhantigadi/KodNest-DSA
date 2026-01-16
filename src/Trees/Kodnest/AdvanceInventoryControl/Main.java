package Trees.Kodnest.AdvanceInventoryControl;

import java.util.Scanner;

import static Trees.Kodnest.AdvanceInventoryControl.AdvanceInventoryControl.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] str = sc.nextLine().split(",");

        String[] MinMax = sc.nextLine().split(",");
        int min = Integer.parseInt(MinMax[0]);
        int max = Integer.parseInt(MinMax[1]);
        for (int i = 0; i < str.length; i++) {
            String [] str2 = str[i].split(":");
                int id = Integer.parseInt(str2[0]);
                int data = Integer.parseInt(str2[1]);
              insertData(id,data);
        }
        filterIDs(root,min,max);
    }
}

