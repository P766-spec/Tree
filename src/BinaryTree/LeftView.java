package BinaryTree;
// https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1

import java.util.ArrayList;
import java.util.List;
class TreeNode7 {
    int val;
    TreeNode7 left;
    TreeNode7 right;
    TreeNode7() {}
    TreeNode7(int val) { this.val = val; }
    TreeNode7(int val, TreeNode7 left, TreeNode7 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class LeftView {
    public static void main(String[] args) {
        TreeNode7 root = new TreeNode7(1);
        root.left = new TreeNode7(3);
        root.right = new TreeNode7(3);
        root.left.left = new TreeNode7(4);
        root.left.right = new TreeNode7(5);
        root.right.right = new TreeNode7(6);
        root.left.left.right = new TreeNode7(7);

        LeftView leftView = new LeftView();

        List<Integer> ans = LeftView.leftSideView(root);

        System.out.println("Left Side View: " + ans);
    }
  public static List<Integer> leftSideView(TreeNode7 root){
        List<Integer> ans = new ArrayList<Integer>();
        leftView(root, ans, 0);
        return ans;
  }

  public static void leftView(TreeNode7 curr, List<Integer> ans, int currLevel){
        if(curr == null){
            return;
        }
        if(currLevel == ans.size()) {
            ans.add(curr.val);
        }
        leftView(curr.left, ans, currLevel + 1);
        leftView(curr.right, ans, currLevel + 1);
  }

}
