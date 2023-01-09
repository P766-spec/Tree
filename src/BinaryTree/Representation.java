package BinaryTree;
class Node {
    int data;
    Node left;
    Node right;
    public Node (int key){
        data = key;
        left = right = null;
    }
}

public class Representation {
    Node root;
    Representation(int key){
        root = new Node(key);
    }
    Representation(){
        root = null;
    }
    public static void main(String[] args) {

        Representation tree = new Representation();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
    }
}