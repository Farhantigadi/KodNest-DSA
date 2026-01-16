package Trees.Kodnest.AdvanceInventoryControl;

public class AdvanceInventoryControl {
    static Node root;
    public static Node insert(Node root,int id,int data){
        if (root == null){
            return new Node(id,data);
        }
        if (id < root.id){
            root.left = insert(root.left,id,data);
        } else if (id> root.id) {
            root.right = insert(root.right,id,data);
        }
        return root;

    }
    public static void insertData(int id,int data){
        root = insert(root,id,data);
    }
    public static void filterIDs(Node node,int min,int max){
        if (node==null){
            return;
        }
        filterIDs(node.left,min,max);
        if (node.data >= min && node.data <= max){
            System.out.print(node.id+" ");
        }
        filterIDs(node.right,min,max);
    }
}
