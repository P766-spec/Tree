package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Zig Zag Traversal  of Binary Tree
class Node5 {
    int val;
     Node5 left, right;
     Node5(int val){
         this.val = val;
         left =null;
         right = null;
     }
}

public class BT3 {
    public static ArrayList<ArrayList<Integer>> zigzagLevelOrder(Node5 root) {
        Queue<Node5> queue = new LinkedList<Node5> ();
        ArrayList<ArrayList<Integer>> wrapList = new ArrayList<>();

        if(root == null) return wrapList;

        queue.offer(root);
        boolean flag = true;
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            ArrayList<Integer> subList = new ArrayList<Integer> (levelNum);
            for(int i =0; i< levelNum; i++) {
                int index = i;
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                if(flag == true) subList.add(queue.poll().val);
                else subList.add(0, queue.poll().val);
            }
            flag = !flag;
            wrapList.add(subList);
        }
        return wrapList;
    }

    public static void main(String[] args) {
        int i, j;
        Node5 root = new Node5(3);
        root.left = new Node5(9);
        root.right = new Node5(20);
        root.right.left = new Node5(15);
        root.right.right = new Node5(7);
        ArrayList < ArrayList < Integer >> ans;
        ans = zigzagLevelOrder(root);
        System.out.println("Zig Zag Traversal of Binary Tree ");
        for (i = 0; i < ans.size(); i++) {
            for (j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}
