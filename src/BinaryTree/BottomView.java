package BinaryTree;
// https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1

import java.util.*;

public class BottomView {
    static class Node7 {
        int data;
        int hd;
        Node7 left, right;

        Node7(int key){
            data = key;
            hd = Integer.MAX_VALUE;
            left = right = null;
        }
    }
    static class pair {
        Node7 first;
        int second;
        pair(Node7 f, int s){
            first = f;
            second = s;
        }
    }
    static void BottomView(Node7 root){
        if(root == null)
            return;
        HashMap<Integer, Integer> hash = new HashMap<>();
        int left = 0;
        Queue<pair> q = new ArrayDeque<>();

        q.add(new pair (root, 0));
        while(!q.isEmpty()) {
            pair top = q.peek();

            q.remove();
            Node7  temp = top.first;
            int ind = top.second;
            hash.put(ind, temp.data);

            left = Math.min(ind, left);
            if(temp.left != null) {
                q.add(new pair(temp.left, ind - 1));
            }
            if(temp.right != null){
                q.add(new pair(temp.right, ind + 1));
            }
        }
        while(hash.containsKey(left)) {
            System.out.println(
                    hash.getOrDefault(left++,0) + " ");

        }
    }

    public static void main(String[] args) {
        Node7 root = new Node7(20);
        root.left = new Node7(8);
        root.right = new Node7(22);
        root.left.left = new Node7(5);
        root.left.right = new Node7(3);
        root.right.left = new Node7(4);
        root.right.right = new Node7(25);
        root.left.right.left = new Node7(10);
        root.left.right.right = new Node7(14);

        System.out.println("Bottom view of the given binary tree: ");
        BottomView(root);
    }

}
