package BinaryTree;
class Node1 {
    int data;
    Node1 left, right;

    public Node1(int key) {
        data = key;
        left = right = null;
    }
}

class BinaryTree {
    // Root of Binary Tree
    Node1 root;

    BinaryTree() {
        root = null;
    }

    void postorder(Node1 node) {
        if (node == null)
            return;

        // Traverse left
        postorder(node.left);
        // Traverse right
        postorder(node.right);
        // Traverse root
        System.out.print(node.data + "->");
    }

    void inorder(Node1 node) {
        if (node == null)
            return;

        // Traverse left
        inorder(node.left);
        // Traverse root
        System.out.print(node.data + "->");
        // Traverse right
        inorder(node.right);
    }

    void preorder(Node1 node) {
        if (node == null)
            return;

        // Traverse root
        System.out.print(node.data + "->");
        // Traverse left
        preorder(node.left);
        // Traverse right
        preorder(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node1(1);
        tree.root.left = new Node1(12);
        tree.root.right = new Node1(9);
        tree.root.left.left = new Node1(5);
        tree.root.left.right = new Node1(6);

        System.out.println("Inorder traversal");
        tree.inorder(tree.root);

        System.out.println("\nPreorder traversal ");
        tree.preorder(tree.root);

        System.out.println("\nPostorder traversal");
        tree.postorder(tree.root);
    }
}