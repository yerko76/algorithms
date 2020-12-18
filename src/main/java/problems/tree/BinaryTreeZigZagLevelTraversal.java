package problems.tree;
import java.util.*;

public class BinaryTreeZigZagLevelTraversal {
   public static void main(String[] args){
    var root = new Node(3);
    var left = new Node(9);
    var right = new Node(20);
    right.left = new Node(15);
    right.right = new Node(7);
    root.left = left;
    root.right = right;
    System.out.println(getSolution(root));
   } 

   private static List<List<Integer>> getSolution(Node root){
       boolean zigzag = false;
       List<List<Integer>> result = new ArrayList<>();
       Queue<Node> queue = new LinkedList<>();
       queue.add(root);
       while(!queue.isEmpty()){
           int size = queue.size();
           List<Integer> levelElements = new ArrayList<>();
           for(int i=0;i<size;i++){
               var node = queue.remove();
               if(zigzag){
                 levelElements.add(0, node.val);
               }else{
                levelElements.add(node.val);
               }
               if(node.left != null) queue.add(node.left);
               if(node.right != null) queue.add(node.right);
           }

           result.add(levelElements);
           zigzag = !zigzag;
       }

       return result;
   }
}
