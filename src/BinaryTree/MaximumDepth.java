package BinaryTree;
//  https://leetcode.com/problems/maximum-depth-of-binary-tree/


class TreeNode5 {
      int val;
     TreeNode5 left;
      TreeNode5 right;
      TreeNode5() {}
      TreeNode5(int val) { this.val = val; }
    TreeNode5(int val, TreeNode5 left, TreeNode5 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

  class MaximumDepth {
      public int maxDepth(TreeNode5 root) {
          if(root == null ) return 0;
          return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
      }
  }

