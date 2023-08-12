package BinaryTree;

import java.util.*;

class TreeNode9 {
    int val;
    TreeNode9 left;
    TreeNode9 right;
    TreeNode9() {}
    TreeNode9(int val) { this.val = val; }
    TreeNode9(int val, TreeNode9 left, TreeNode9 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static class DiagonalTraversal {
        static Map<Integer, ArrayList<Integer>> hm = new TreeMap<>(); // Declare hm here
        public ArrayList<Integer> diagonal(TreeNode9 root) {
            ArrayList<Integer> ans = new ArrayList<>();
            verticalOrder(root, 0);
            for (Map.Entry<Integer, ArrayList<Integer>> e : hm.entrySet()) {
                ans.addAll(e.getValue()); // Use addAll to add elements to ans
            }
            return ans;
        }

        public static void verticalOrder(TreeNode9 root, int hd) {
            if (root == null)
                return;

            ArrayList<Integer> ans = hm.getOrDefault(hd, new ArrayList<>()); // Initialize ans properly
            ans.add(root.val);
            hm.put(hd, ans);
            verticalOrder(root.left, hd + 1);
            verticalOrder(root.right, hd);
        }
    }

    public static void main(String[] args) {
        DiagonalTraversal diagonalTraversal = new DiagonalTraversal();
        TreeNode9 root = new TreeNode9(1);
        root.left = new TreeNode9(2);
        root.left.left = new TreeNode9(9);
        root.left.right = new TreeNode9(6);
        root.right = new TreeNode9(3);
        root.right.left = new TreeNode9(4);
        root.right.right = new TreeNode9(5);

        List<Integer> result = diagonalTraversal.diagonal(root);
        System.out.println(result);
    }
}
