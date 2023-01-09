package BinaryTree;

import java.util.ArrayList;
import java.util.Stack;

//  Method 1: Postorder traversal recursive
class Node2 {
 int data;
 Node2 left, right;
 Node2(int data){
  this.data = data;
  left = null;
  right = null;
 }
 }

public class TUF {
 static void postorderTrav(Node2 curr, ArrayList<Integer> postOrder) {
  if (curr == null)
   return;
  postorderTrav(curr.left, postOrder);
  postorderTrav(curr.right, postOrder);
  postOrder.add(curr.data);
 }
 // Method 2: Postorder Traversal Using Two Stack
 static ArrayList<Integer> postOrderTrav(Node2 curr) {
  ArrayList<Integer> postOrder = new ArrayList<>();
  if (curr == null) return postOrder;

  Stack<Node2> s1 = new Stack<>();
  Stack<Node2> s2 = new Stack<>();
  s1.push(curr);
  while (!s1.isEmpty()) {
   curr = s1.peek();
   s1.pop();
   s2.push(curr);
   if (curr.left != null)
    s1.push(curr.left);
   if (curr.right != null)
    s1.push(curr.right);
  }
  while (!s2.isEmpty()) {
   postOrder.add(s2.peek().data);
   s2.pop();
  }
  return postOrder;
 }
 // Method 3: Postorder Traversal Using a Single Stack
 static void  postorderTraversal(Node2 curr,  ArrayList<Integer> postOrder){
  if(curr == null)
   return;

  postorderTraversal(curr.left, postOrder);
  postorderTraversal(curr.right, postOrder);
  postOrder.add(curr.data);

 }
 public static void main(String[] args) {
  Node2 root = new Node2(1);
  root.left = new Node2(2);
  root.right = new Node2(3);
  root.left.left = new Node2(4);
  root.left.right = new Node2(5);
  root.left.right.left = new Node2(8);
  root.right.left = new Node2(6);
  root.right.right = new Node2(7);
  root.right.right.left = new Node2(9);
  root.right.right.right = new Node2(10);

  ArrayList<Integer> postOrder = new ArrayList<>();
  postorderTrav(root, postOrder);

  System.out.println("The postOrder Traversal is: ");
  for (int i = 0; i < postOrder.size(); i++) {
   System.out.println(postOrder.get(i) + " ");

  }

 }

}