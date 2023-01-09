package BST;
// Get Inorder Parent for a given value in BST

class Node6 {
    int data;
    Node6 left, right;
}

public class BST5 {
    public Node6 getInorderParent(Node6 node, int val) {
        if(node == null) {
            return null;
        }
        Node6 inorderParent = null;

        while(node != null) {
            if(val < node.data) {
                inorderParent = node;
                node = node.left;
            } else if (val > node.data) {
                node = node.right;
            } else {
                break;
            }
        }
        return node != null ? inorderParent : null;
    }
    public Node6 insert(Node6 node, int val) {
        if(node == null) {
            return createNewNode(val);
        }
        if(val < node.data) {
            node.left = insert(node.left,val);
        } else if ((val > node.data)) {
            node.right = insert(node.right, val);
        }
        return node;
    }
    public Node6 createNewNode(int k) {
        Node6 a = new Node6();
        a.data = k;
        a.left = null;
        a.right = null;
        return a;
    }
}

class BSTApp5 {
    public static void main(String[] args) {
        BST5 a = new BST5();
        Node6 root = null;

        root = a.insert(root, 8);
        root = a.insert(root, 3);
        root = a.insert(root, 6);
        root = a.insert(root, 10);
        root = a.insert(root, 4);
        root = a.insert(root, 7);
        root = a.insert(root, 1);
        root = a.insert(root, 14);
        root = a.insert(root, 13);

        Node6 inorderParentNode = a.getInorderParent(root, 3);
        if (inorderParentNode != null) {
            System.out.println("inorder Parent: " + inorderParentNode.data);
        } else {
            System.out.println("Inorder Parent not exixts");
        }
    }
    }


