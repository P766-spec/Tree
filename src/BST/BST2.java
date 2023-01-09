package BST;

class Node3 {
    int data;
    Node3 left, right;
}

public class BST2 {
    // Print elements in InOrder in BST
    public void inorder(Node3 node) {
        if(node == null) {
            return;
        }
        inorder(node.left);
        System.out.println(node.data + " ");
        inorder(node.right);
    }
    // Print elements in PreOrder in BST
    public void preorder(Node3 node) {
        if(node == null) {
            return;
        }
        System.out.println(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }
    //Print elements in PostOrder in BST
    public void postOrder(Node3 node) {
        if(node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data + " ");
    }

    public Node3 insert(Node3 node, int val) {
        if(node == null) {
            return createNewNode(val);
        }
        if(val < node.data) {
            node.left = insert(node.left, val);
        } else if(val > node.data) {
            node.right = insert(node.right, val);
        }

        return node;
    }


    public Node3 createNewNode(int k) {
        Node3 a = new Node3();
        a.data = k;
        a.left = null;
        a.right = null;
        return a;
    }
}

class BSTAPP2 {
    public static void main(String[] args) {
        BST2 a = new BST2();
        Node3 root = null;

        root = a.insert(root, 8);
        root = a.insert(root, 3);
        root = a.insert(root, 6);
        root = a.insert(root, 10);
        root = a.insert(root, 4);
        root = a.insert(root, 7);
        root = a.insert(root, 1);
        root = a.insert(root, 14);
        root = a.insert(root, 13);

        System.out.println("Inorder of BST is: ");
        a.inorder(root);
        System.out.println("Preorder of BST is: ");
        a.preorder(root);
        System.out.println("Postorder of BST is: ");
        a.postOrder(root);


    }
}
