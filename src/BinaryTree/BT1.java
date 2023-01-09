package BinaryTree;

// Maximum Sum Path in Binary Tree
class Node3 {
    int val;
    Node3 left, right;
    Node3(int val){
        this.val = val;
        left = null;
        right = null;
    }
}

public class BT1 {
    public static int maxPathSum(Node3 root){
        int maxValue[] = new int[1];
        maxValue[0] = Integer.MIN_VALUE;
        maxPathDown(root, maxValue);
        return maxValue[0];
    }
    public static int maxPathDown(Node3 node, int maxValue[]){
        if(node == null) return 0;
        int left = Math.max(0, maxPathDown(node.left,maxValue));
        int right = Math.max(0, maxPathDown(node.right,maxValue));
        maxValue[0] = Math.max(maxValue[0], left + right + node.val);
        return Math.max(left, right)  + node.val;
    }

    public static void main(String[] args) {
        Node3 root = new Node3(-10);
        root.left = new Node3(9);
        root.right = new Node3(20);
        root.right.left = new Node3(15);
        root.right.right = new Node3(7);

        int answer = maxPathSum(root);
        System.out.println("The Max Path Sum for this tree is : " + answer);

    }

}
