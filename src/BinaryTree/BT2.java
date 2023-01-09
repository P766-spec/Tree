package BinaryTree;

// Check if two tress are identical
class Node4 {
    int data;
    Node4 left, right;
    Node4(int data){
        this.data = data;
        left = right =null;
    }
}

public class BT2 {
    static boolean isIdentical(Node4 node1, Node4 node2){
        if(node1 == null && node2 == null)
            return true;
        else if (node1 == null ||  node2 == null)
            return false;

        return ((node1.data == node2.data) && isIdentical(node1.left,node2.left) && isIdentical(node1.right,node2.right));
    }

    public static void main(String[] args) {

        Node4 root1 = new Node4(1);
        root1.left = new Node4(1);
        root1.right = new Node4(2);
        root1.right.left = new Node4(4);
        root1.right.right = new Node4(5);

        Node4 root2 = new Node4(1);
        root2.left = new Node4(2);
        root2.right = new Node4(3);
        root2.right.left = new Node4(4);

        if(isIdentical(root1,root2))
            System.out.println("Two Trees are identical");
        else
            System.out.println("Two trees are non-identical");


    }

}
