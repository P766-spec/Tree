package BST;
// Check if a value exists in BST

class Node4 {
    int data;
    Node4 left, right;
}

public class BST3 {
    public boolean ifNodePresent(Node4 node, int val) {
        if(node == null) {
            return false;
        }
        boolean isPresent = false;
        while(node != null) {
            if(val < node.data) {
                node = node.left;
            } else if (val > node.data) {
                node = node.right;
            } else {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }
    public Node4 insert(Node4 node, int val) {
        if(node == null) {
            return createNewNode(val);
        }
        if(val < node.data) {
            node.left = insert(node.left, val);
        } else if (val > node.data) {
            node.right = insert(node.right,val);
        }
        return node;
    }
    public Node4 createNewNode(int k) {
        Node4 a = new Node4();
        a.data = k;
        a.left = null;
         a.right = null;
         return a;
    }
}


class BSTApp3 {
    public static void main(String[] args) {


        BST3 a = new BST3();
        Node4 root = null;

        root = a.insert(root, 8);
        root = a.insert(root, 3);
        root = a.insert(root, 6);
        root = a.insert(root, 10);
        root = a.insert(root, 4);
        root = a.insert(root, 7);
        root = a.insert(root, 1);
        root = a.insert(root, 14);
        root = a.insert(root, 13);

        System.out.println(a.ifNodePresent(root,6));
        System.out.println(a.ifNodePresent(root, 16));


    }
}
