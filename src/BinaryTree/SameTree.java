package BinaryTree;

//  https://leetcode.com/problems/same-tree/
class TreeNode2 {
    int val;
    TreeNode2 left;
    TreeNode2 right;

    TreeNode2() {
    }

    TreeNode2(int val) {
        this.val = val;
    }

    TreeNode2(int val, TreeNode2 left, TreeNode2 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class SameTree {
    public static void main(String[] args) {
        TreeNode2 p = new TreeNode2(1);
        p.left = new TreeNode2(2);
        p.right = new TreeNode2(3);

        TreeNode2 q = new TreeNode2(1);
        q.left = new TreeNode2(2);
        q.right = new TreeNode2(3);
        System.out.println(isSameTree(p, q));

    }

    static boolean isSameTree(TreeNode2 p, TreeNode2 q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;

    }
}
