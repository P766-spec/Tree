package BinaryTree;
//  https://leetcode.com/problems/binary-tree-right-side-view/

import java.util.ArrayList;
import java.util.List;
class TreeNode6 {
    int val;
    TreeNode6 left;
    TreeNode6 right;
    TreeNode6() {}
    TreeNode6(int val) { this.val = val; }
    TreeNode6(int val, TreeNode6 left, TreeNode6 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class RightView {
    public static void main(String[] args) {
        TreeNode6 root = new TreeNode6(1);
        root.left = new TreeNode6(3);
        root.right = new TreeNode6(3);
        root.left.left = new TreeNode6(4);
        root.left.right = new TreeNode6(5);
        root.right.right = new TreeNode6(6);
        root.left.left.right = new TreeNode6(7);

        RightView rightView = new RightView();

        List<Integer> ans = rightView.rightSideView(root);

        System.out.println("Right Side View: " + ans);

    }
     public List<Integer> rightSideView(TreeNode6 root) {
        List<Integer> ans = new ArrayList<Integer>();
        rightView(root, ans, 0);
        return ans;
     }

     public void rightView(TreeNode6 curr, List<Integer> ans , int currLevel) {
        if(curr == null){
            return;
        }
        if(currLevel == ans.size()) {
            ans.add(curr.val);
        }
        rightView(curr.right,ans,currLevel + 1);
        rightView(curr.left,ans,currLevel +1);
     }
}
