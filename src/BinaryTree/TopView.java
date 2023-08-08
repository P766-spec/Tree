package BinaryTree;
// https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1

import java.util.*;
class TopSideView {
    static class Node6 {
        int data;
        Node6 left, right;
        public Node6(int data) {
            this.data = data;
            left = right = null;
        }
    }
    static class QueueObj {
        Node6 node;
        int hd;

        QueueObj(Node6 node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    static void topView(Node6 root){
        if(root == null)
            return;

        Queue<QueueObj> q = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int min = 0;
        int max = 0;

        q.add(new QueueObj(root,0));
        while(!q.isEmpty()){
            QueueObj curr = q.poll();

            if(!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node.data);
            }

            if(curr.node.left != null){
                min = Math.min(min, curr.hd - 1);
                q.add(new QueueObj(curr.node.left, curr.hd - 1));
            }
            if(curr.node.right != null){
                max = Math.max(max, curr.hd + 1);
                q.add(new QueueObj(curr.node.right, curr.hd + 1));
            }
        }
        for(; min <=max; min++){
            System.out.println(map.get(min) + " ");
        }
    }
    public static void main(String[] args) {
        Node6 root = new Node6(1);
        root.left = new Node6(2);
        root.right = new Node6(3);
        root.left.right = new Node6(4);
        root.left.right.right = new Node6(5);
        root.left.right.right.right = new Node6(6);
        System.out.println("Following are nodes in" + " top view of Binary Tree");

        topView(root);




    }
}
