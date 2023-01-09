package BST;
// Get Parent of a given value in BST

class Node5 {
    int data;
    Node5 left, right;
}

public class BST4 {
    public Node5 getParentNode(Node5 node, int val) {
        if (node == null) {
            return null;
        }
        Node5 getParent = null;

        while (node != null) {
            if (val < node.data) {
                getParent = node;
                node = node.left;
            } else if (val > node.data) {
                getParent = node;
                node = node.right;
            } else {
                break;
            }
        }
        return getParent;
    }

    // Get Sibling Node of a given value in BST
    public Node5 getSiblingNode(Node5 node, int val) {
        if(node == null || node.data == val) {
            return null;
        }
        Node5 parentNode = null;

        while(node != null) {
            if(val < node.data) {
                parentNode = node;
                node = node.left;
            } else if (val > node.data) {
                parentNode = node;
                node = node.right;
            } else {
                break;
            }
        }
        if(parentNode.left != null && val == parentNode.left.data) {
            return parentNode.right;
        }
        if(parentNode.right != null && val == parentNode.right.data) {
            return parentNode.left;
        }
        return null;
    }
    public Node5 insert(Node5 node, int val) {
        if (node == null) {
            return createNewNode(val);
        }
        if (val < node.data) {
            node.left = insert(node.left, val);
        } else if ((val > node.data)) {
            node.right = insert(node.right, val);
        }
        return node;
    }

    public Node5 createNewNode(int k) {
        Node5 a = new Node5();
        a.data = k;
        a.left = null;
        a.right = null;
        return a;
    }
}

class BSTApp4 {
    public static void main(String[] args) {
        BST4 a = new BST4();
        Node5 root = null;

        root = a.insert(root, 8);
        root = a.insert(root, 3);
        root = a.insert(root, 6);
        root = a.insert(root, 10);
        root = a.insert(root, 4);
        root = a.insert(root, 7);
        root = a.insert(root, 1);
        root = a.insert(root, 14);
        root = a.insert(root, 13);

//        Node5 parentNode = a.getParentNode(root,3);
//        if(parentNode != null) {
//            System.out.println("Parent: " + parentNode.data);
//        } else {
//            System.out.println("Parent is Null");
//        }
//    }
        Node5 siblingNode = a.getSiblingNode(root, 3);
        if (siblingNode != null) {
            System.out.println("Siblings: " + siblingNode.data);
        } else {
            System.out.println("No Sibling");
        }
    }
}
