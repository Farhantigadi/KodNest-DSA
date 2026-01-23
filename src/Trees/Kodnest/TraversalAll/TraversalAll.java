package Trees.Kodnest.TraversalAll;

import java.util.LinkedList;
import java.util.Queue;

public class TraversalAll {
  static   Node root;
    public static Node insertBT(Node root,int data){
        if (root == null) return new Node(data);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node temp = q.poll();
            if (temp.left == null){
                temp.left = new Node(data);
                break;
            } else {
                q.add(temp.left);
            }
            if (temp.right == null){
                temp.right = new Node(data);
                break;
            } else {
                q.add(temp.right);
            }
        }
        return root;
    }
    public static void insertBTData(int data){
        root = insertBT(root,data);
    }
    public static void preOrderTraversal(Node node){
        if (node== null){
            return;
        }
        System.out.print(node.data+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
    public static void inorder(Node node){
        if (node== null){
            return;
        }
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }
    public static void postOrder(Node node){
        if (node== null){
            return;
        }

        postOrder(node.left);

        postOrder(node.right);
        System.out.print(node.data+" ");
    }
    public static Node insertBST(Node node, int data){
        if(node == null){
            return new Node(data);
        }
        if(data < node.data){
            node.left = insertBST(node.left,data);
        } else if(data > node.data){
            node.right = insertBST(node.right,data);
        }
        return node;
    }
    public void insertBSTData(int data){
        insertBST(root,data);
    }
    public static Node buildTree(String[] arr) {
        if (arr.length == 0 || arr[0].isEmpty()) return null;

        Node root = new Node(Integer.parseInt(arr[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;

        while (i < arr.length) {
            Node temp = q.poll();
            if (i < arr.length && !arr[i].isEmpty()) {
                temp.left = new Node(Integer.parseInt(arr[i]));
                q.add(temp.left);
            }
            i++;
            if (i < arr.length && !arr[i].isEmpty()) {
                temp.right = new Node(Integer.parseInt(arr[i]));
                q.add(temp.right);
            }
            i++;
        }
        return root;
    }
    public static Node buildTreeNull(String[] arr) {
        if (arr.length == 0 || arr[0] == null || arr[0].equals("null"))
            return null;

        Node root = new Node(Integer.parseInt(arr[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (i < arr.length && !queue.isEmpty()) {
            Node temp = queue.poll();

            // LEFT child
            if (i < arr.length && arr[i] != null && !arr[i].equals("null")) {
                temp.left = new Node(Integer.parseInt(arr[i]));
                queue.add(temp.left);
            }
            i++;

            // RIGHT child
            if (i < arr.length && arr[i] != null && !arr[i].equals("null")) {
                temp.right = new Node(Integer.parseInt(arr[i]));
                queue.add(temp.right);
            }
            i++;
        }

        return root;
    }
    private static boolean isValidNode(String s) {
        return s != null && !s.trim().isEmpty() && !s.equalsIgnoreCase("null");
    }

    public static Node buildTreeHelperMethod(String[] parts) {
        if (parts == null || parts.length == 0 || !isValidNode(parts[0])) {
            return null;
        }

        Node root = new Node(Integer.parseInt(parts[0].trim()));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;

        while (i < parts.length && !queue.isEmpty()) {
            Node current = queue.poll();

            // LEFT child
            if (i < parts.length && isValidNode(parts[i])) {
                current.left = new Node(Integer.parseInt(parts[i].trim()));
                queue.add(current.left);
            }
            i++;

            // RIGHT child
            if (i < parts.length && isValidNode(parts[i])) {
                current.right = new Node(Integer.parseInt(parts[i].trim()));
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }
}
