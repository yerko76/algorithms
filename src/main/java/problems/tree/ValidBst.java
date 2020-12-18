package problems.tree;

public class ValidBst {
   public static void main(String[] args){
        var root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(7);

        System.out.print(isValidBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
   } 

   private static boolean isValidBst(Node node, int min, int max){
       if(node == null) return true;
       if(node.val < min) return false;
       if(node.val >= max) return false;
       return isValidBst(node.left, min, node.val) && isValidBst(node.right, node.val, max);
   }
}

/*
#   5
#  / \
# 4   7
*/


class Node {
    int val;
    Node left;
    Node right;

    public Node(int val){
        this.val = val;
    }
}
