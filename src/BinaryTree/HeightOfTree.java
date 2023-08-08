package BinaryTree;
// https://leetcode.com/problems/maximum-depth-of-binary-tree/

import java.util.List;
class TreeNode8 {
    int val;
    TreeNode8 left;
    TreeNode8 right;
    TreeNode8() {}
    TreeNode8(int val) { this.val = val; }
    TreeNode8(int val, TreeNode8 left, TreeNode8 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

public static class HeightOfTree {


        public static void main(String[] args) {
            TreeNode8 root = new TreeNode8(1);
            root.left = new TreeNode8(3);
            root.right = new TreeNode8(3);
            root.left.left = new TreeNode8(4);
            root.left.right = new TreeNode8(5);
            root.right.right = new TreeNode8(6);
            root.left.left.right = new TreeNode8(7);

            HeightOfTree heightOfTree = new HeightOfTree();

          int height = heightOfTree.maxDepth(root);

            System.out.println("Height of tree: " + height);
        }
        public int maxDepth(TreeNode8 root){
            if(root == null) return 0;
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }

}
