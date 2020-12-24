package leetcode.tree;

import java.util.*;

/*
Given the root of a binary tree and a node u in the tree, return the nearest node on the same level that is to the right of u, or return null if u is the rightmost node in its level.

Input: root = [1,2,3,null,4,5,6], u = 4
Output: 5
Explanation: The nearest node on the same level to the right of node 4 is node 5.

Input: root = [3,null,4,2], u = 2
Output: null
Explanation: There are no nodes to the right of 2.

Input: root = [1], u = 1
Output: null

Input: root = [3,4,2,null,null,null,1], u = 4
Output: 2
*/

public class FindNearestRightNode {
    public static void main(String[] args){
        var left = new TreeNode(2);
        left.right = new TreeNode(4);
        var right = new TreeNode(3);
        right.left = new TreeNode(5);
        right.right = new TreeNode(6);
        var root = new TreeNode(1);
        root.left = left;
        root.right = right;
        var u = new TreeNode(4);

        var result = findNearestRightNode(root, u);
        System.out.println(result.val);

    }

    private static TreeNode findNearestRightNode(TreeNode root, TreeNode u) {
       if(root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i<size;i++){
                var node = queue.remove();
                if(node.val == u.val){
                    if(i == size -1) return null;
                    return queue.remove();
                }
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
        }
        return null;
    }
    
}
