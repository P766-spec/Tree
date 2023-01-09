package BST;
// Delete a node of BST
class Node1 {
    int data;
    Node1 left, right;

}

class BST1 {
  public Node1 delete(Node1 node, int val) {
      if (node == null) {
          return node;
      }
      if (val < node.data) {
          node.left = delete(node.left, val);
      } else if (val > node.data) {
          node.right = delete(node.right, val);
      } else {
          if (node.left == null || node.right == null) {
              Node1 temp = node.left != null ? node.left : node.right;

              if (temp == null) {
                  return null;
              } else {
                  return temp;
              }
          } else {
              Node1 successor = getSuccessor(node);
              node.data = successor.data;

              node.right = delete(node.right, successor.data);
              return node;
          }
      }
      return node;
  }
  public Node1 getSuccessor(Node1 node) {
      if(node == null) {
          return null;
      }
      Node1 temp = node.right;

      while(temp.left != null) {
          temp = temp.left;
      }
      return temp;
  }
  public Node1 insert(Node1 node, int val) {
      if(node == null) {
          return createNewNode(val);
      }
      if(val < node.data) {
          node.left = insert(node.left,val);
      } else if ((val > node.data)) {
          node.right = insert(node.right, val);
      }
      return node;
  }


  public Node1 createNewNode(int k) {
      Node1 a = new Node1();
      a.data = k;
      a.left = null;
      a.right = null;
      return a;
  }
  }

class BSTApp1 {
    public static void main(String[] args) {
        BST1 a = new BST1();
        Node1 root = null;

        root = a.insert(root, 8);
        root = a.insert(root, 3);
        root = a.insert(root, 6);
        root = a.insert(root, 10);
        root = a.insert(root, 4);
        root = a.insert(root, 7);
        root = a.insert(root, 1);
        root = a.insert(root, 14);
        root = a.insert(root, 13);

        root = a.delete(root, 8);

    }
}

