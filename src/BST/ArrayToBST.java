package BST;
// https://practice.geeksforgeeks.org/problems/array-to-bst4443/1

import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
        left = right = null;
    }
}
public class ArrayToBST {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] root = sortedArrayToBST(nums);
        for(int val : root) {
            System.out.println(val + " ");
        }

    }

    static int i =0;
    static void preorder(TreeNode node, int[] arr){
        if( node == null) return;
        arr[i++] = node.val;
        preorder(node.left,arr);
        preorder(node.right,arr);
    }

    static TreeNode helper(int[] arr, int start, int end){
        if(start > end) return null;
        int mid = start + (end - start)/2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = helper(arr, start,mid - 1);
        node.right = helper(arr, mid + 1, end);
        return node;
    }
    static int[] sortedArrayToBST(int[] nums) {
        ArrayList<Integer> ls = new ArrayList<>();
        int n = nums.length;
        TreeNode root  = helper(nums, 0, n - 1);
        int[] ans = new int[n];
        preorder(root, ans);
        return ans;

    }



}
