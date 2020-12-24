package leetcode.tree;
/*
Given a binary tree, determine if it is height-balanced.
For this problem, a height-balanced binary tree is defined as:
a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
Input: root = [3,9,20,null,null,15,7]
Output: true
Input: root = [1,2,2,3,3,null,null,4,4]
Output: false
Input: root = []
Output: true
*/
public class BalancedBinaryTree {
    public static void main(String[] args){
        var root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        var result = getSolution(root);
        System.out.println(result);
    }

    private static boolean getSolution(TreeNode root){
        if(root == null) return true;
        return helper(root) != -1;
    }

    private static int helper(TreeNode node){
        if(node == null) return 0;
        int left = helper(node.left);
        int right = helper(node.right);
        int diff = Math.abs(left - right);
        if(diff > 1 || left == -1 || right == -1) return -1;
        return 1 + Math.max(left, right);
    }
    
}
