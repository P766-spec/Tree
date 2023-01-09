package BST;

class Node8 {
    int data;
     Node8 left, right;
}

public class BST7 {
    // Get Max value element in BST
    public int getMax(Node8 node) {
        if(node == null) {
            System.out.println("Tree is Empty");
            return -1;
        }
        while(node.right != null) {
            node = node.right;
        }
        return node.data;
    }
    // Get Min value element in BST
    public int getMin(Node8 node) {
        if(node == null) {
            System.out.println("Tree is Empty");
            return -1;
        }
        while(node.left != null) {
            node = node.left;
        }
        return node.data;
    }
    public Node8 insert(Node8 node, int val) {
        if(node == null) {
            return createNewNode(val);
        }
        if(val < node.data) {
            node.left = insert(node.left, val);
        } else if ((val > node.data)) {
            node.right = insert(node.right,val);
        }
        return node;
    }
    public Node8 createNewNode(int k ) {
        Node8 a = new Node8();
        a.data = k;
         a.left = null;
         a.right = null;
         return a;
    }
}

class BSTApp7 {
    public static void main(String[] args) {
        BST7 a  = new BST7();
        Node8 root = null;

        root = a.insert(root, 8);
        root = a.insert(root, 3);
        root = a.insert(root, 6);
        root = a.insert(root, 10);
        root = a.insert(root, 4);
        root = a.insert(root, 7);
        root = a.insert(root, 1);
        root = a.insert(root, 14);
        root = a.insert(root, 13);

        System.out.println(a.getMax(root));
        System.out.println(a.getMin(root));

    }


}
