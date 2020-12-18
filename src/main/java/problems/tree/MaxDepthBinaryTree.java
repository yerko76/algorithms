package problems.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepthBinaryTree{
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
        System.out.print(getResult2(root));
    }

    private static int getResult2(BinaryTree root){
        int result = 0;
        Queue<BinaryTree> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            BinaryTree node = queue.remove();
            System.out.println(node.val);
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
            result++;
        }

        return result;
    }

    private static int getResult(BinaryTree root){
        return getResultHelper(root, 0);
    }
    
    private static int getResultHelper(BinaryTree root, int depth){
        if(root == null) return 0;
        return depth + 1 + Math.max(getResultHelper(root.left, depth), 
                                    getResultHelper(root.right, depth));
    }
    
}


class BinaryTree{
    String val;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(String val){
        this.val = val;
    }
}