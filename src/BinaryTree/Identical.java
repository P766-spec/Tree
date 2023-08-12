package BinaryTree;
// https://leetcode.com/problems/same-tree/

import java.util.*;

class TreeNode10 {
        int val;
        TreeNode10 left;
        TreeNode10 right;
        TreeNode10() {}
        TreeNode10(int val) { this.val = val; }
        TreeNode10(int val, TreeNode10 left, TreeNode10 right) {
            this.val = val;
            this.left = left;
            this.right = right;

}
public class Identical {
            static boolean isSameTree(TreeNode10 p, TreeNode10 q){
                if( p == null && q == null) return true;
                if( p == null || q == null) return false;
                if(p.val == q.val){
                    return isSameTree(p.left,q.left) && isSameTree(p.right, q.right);
                }
                return false;
            }
}
    public static void main(String[] args) {
    TreeNode10 t1 = new TreeNode10(1);
    t1.left = new TreeNode10(2);
    t1.right = new TreeNode10(3);

     TreeNode10 t2 = new TreeNode10(1);
     t2.left = new TreeNode10(2);
     t2.right = new TreeNode10(3);

     boolean result = Identical.isSameTree(t1,t2);
        System.out.println("Are the two trees identical? " + result);
    }
}
