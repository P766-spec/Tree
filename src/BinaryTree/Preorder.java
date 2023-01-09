package BinaryTree;
// https://leetcode.com/problems/binary-tree-preorder-traversal/

import java.util.LinkedList;
import java.util.List;

class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;
    TreeNode1() {
    }
    TreeNode1(int val) {
        this.val = val;
    }

    TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Preorder {
    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(1);

        root.right = new TreeNode1(2);
        root.right.left = new TreeNode1(3);

        System.out.println(preorderTraversal(root));
    }

    static List<Integer> preorderTraversal(TreeNode1 root) {
        List<Integer> ls = new LinkedList<>();
        ls = preorder(root, ls);
        return ls;
    }

    static List<Integer> preorder(TreeNode1 root, List<Integer> ls) {
        if (root == null) return ls;

        ls.add(root.val);
        preorder(root.left, ls);
        preorder(root.right, ls);

        return ls;
    }
}
