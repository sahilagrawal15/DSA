package binarySearchTree;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class CreateBSTFromArray {
    static Node insertIntoTree(Node root, int data){
        if (root == null){
            return new Node(data);
        }
        if(root.data > data)
            root.left = insertIntoTree(root.left, data);
        else
            root.right = insertIntoTree(root.right, data);
        return root;

    }
    public static void printInorder(Node root){
        if(root == null)
            return;
        printInorder(root.left);
        System.out.println(root.data);
        printInorder(root.right);
    }

    public static void main(String[] args) {
        int arr [] = {1,4,5,3,7,9};
        Node root = null;
        for(int i = 0; i < arr.length; i++) {
            root = CreateBSTFromArray.insertIntoTree(root, arr[i]);
        }
        printInorder(root);
    }
}
