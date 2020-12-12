package problems;

import java.util.*;

public class IncreasingOrderSearchTree {

    public static void main(String[] args){
        TreeNode leftTree = new TreeNode(3);
        leftTree.left = new TreeNode(2);
        leftTree.right = new TreeNode(4);
        leftTree.left.left = new TreeNode(1);

        TreeNode rightTree = new TreeNode(6);
        rightTree.right = new TreeNode(8);
        rightTree.right.left = new TreeNode(7);
        rightTree.right.right = new TreeNode(9);
        
        TreeNode root = new TreeNode(5);
        root.left = leftTree;
        root.right = rightTree;

        var result = increasingBST(root);
        printTree(result);
    }

    private static void printTree(TreeNode root){
        if(root == null) return;
        System.out.println(root.val);
        printTree(root.left);
        printTree(root.right);
    }


    public static TreeNode increasingBST(TreeNode root) {
        Queue<Integer> queue = new LinkedList<Integer>();
        addNodesToList(root, queue);
        var rootValue = queue.remove();
        TreeNode head = new TreeNode(rootValue);
        TreeNode current = head;
        while(!queue.isEmpty()){
            TreeNode next = new TreeNode(queue.remove());
			current.right = next;
            current = current.right;
        }

        return head;

    }
    private static void addNodesToList(TreeNode root, Queue<Integer> queue){
        if(root == null) return;
        addNodesToList(root.left, queue);
        queue.add(root.val);
        addNodesToList(root.right, queue);
    }
    
}


class TreeNode{
    Integer val;
    TreeNode left;
    TreeNode right;

    public TreeNode(Integer val){
        this.val = val;
    }
}