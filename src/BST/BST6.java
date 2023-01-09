package BST;
// Get inorder Successor of a value in BST
class Node7 {
    int data;
    Node7 left, right;
}

public class BST6 {
    public Node7 getInorderSuccessor(Node7 node, int val) {
        if (node == null) {
            return null;
        }
        Node7 inorderSuccessor = null;

        while(node != null) {
            if(val < node.data) {
                inorderSuccessor = node;
                node = node.left;
            } else if (val > node.data) {
                node = node.right;
            } else {
                if(node.right != null) {
                    inorderSuccessor = getSuccessor(node);
                }
                break;
            }
        }
        return node != null ? inorderSuccessor : null;
    }
    public Node7 getSuccessor(Node7 node) {
        if(node == null) {
            return null;
        }
        Node7 temp = node.right;

        while(temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }
    // Get Difference of Even & Odd level values
    public int getDifferenceEvenOddlevel(Node7 node) {
        if(node == null){
            return 0;
        }
        return node.data - getDifferenceEvenOddlevel(node.left) - getDifferenceEvenOddlevel(node.right);
    }
    public Node7 insert(Node7 node, int val) {
        if(node == null) {
            return createNewNode(val);
        }
        if(val < node.data) {
            node.left = insert(node.left, val);
        } else if ((val > node.data)) {
            node.right = insert(node.right, val);
        }
        return node;
    }

    public Node7 createNewNode(int k) {
        Node7 a = new Node7();
        a.data = k;
        a.left = null;
        a.right = null;
        return a;
    }
}

class BSTApp6 {
    public static void main(String[] args) {
        BST6 a = new BST6();
        Node7 root = null;

        root = a.insert(root, 8);
        root = a.insert(root, 3);
        root = a.insert(root, 6);
        root = a.insert(root, 10);
        root = a.insert(root, 4);
        root = a.insert(root, 7);
        root = a.insert(root, 1);
        root = a.insert(root, 14);
        root = a.insert(root, 13);

        Node7 inorderSuccessor = a.getInorderSuccessor(root, 3);
        if (inorderSuccessor != null) {
            System.out.println("Inorder Successor: " + inorderSuccessor.data);
        } else {
            System.out.println("Inorder Successor doesn't  exists");
        }
        System.out.println(a.getDifferenceEvenOddlevel(root));

    }
    }


