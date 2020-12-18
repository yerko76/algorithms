package problems.tree;

public class InvertBinaryTree {
            /**
         *         a
         *        / \
         *       b   c  
         *      /
         *     d
         *      \e
         *        \z
        */    
   public static void main(String[] args){
    var root = new BinaryTree("a");
    root.left = new BinaryTree("b");
    root.left.left = new BinaryTree("d");
    root.left.left.right = new BinaryTree("e");
    root.left.left.right.right = new BinaryTree("z");
    root.right = new BinaryTree("c");
    // print(root);
    print(invert(root));
   } 

   private static BinaryTree invert(BinaryTree root){
       if(root == null) return null;
       var left = invert(root.left);
       var right = invert(root.right);
       root.left = right;
       root.right = left;
       return root;
   }

   private static void print(BinaryTree tree){
       if(tree == null) return;
       System.out.println(tree.val);
       print(tree.left);
       print(tree.right);
   }
}
