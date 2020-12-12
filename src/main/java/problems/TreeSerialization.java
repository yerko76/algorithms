package problems;

import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

public class TreeSerialization {
    public static void main(String[] args){
        var root = new Node(1);
        var left = new Node(3);
        left.left = new Node(2);
        left.right = new Node(5);
        var right = new Node(4);
        right.right = new Node(7);
        root.left = left;
        root.right = right;
        printNode(root);
        System.out.println(" ");
        var serialized = serializeTree(root);
        System.out.println(serialized);
        var node = deserialize(serialized);
        System.out.println(" ");
        printNode(node);
    }

    private static Node deserialize(String serialized){
        Queue<String> remainingNodes = new LinkedList<>();
        remainingNodes.addAll(Arrays.asList(serialized.split(",")));
        return deserializeHelper(remainingNodes);
    }

    private static Node deserializeHelper(Queue<String> remainingNodes){
        String nodeValue = remainingNodes.remove();
        if(nodeValue.equals("X")) return null;
        Node node = new Node(Integer.valueOf(nodeValue));
        node.left = deserializeHelper(remainingNodes);
        node.right = deserializeHelper(remainingNodes);
        return node;
    }

    private static String serializeTree(Node root){
        if(root == null) return "X";
        return String.valueOf(root.val) 
            + "," + serializeTree(root.left) 
            + "," + serializeTree(root.right);
    }

    private static void printNode(Node root){
        if(root == null) return;    
        System.out.print(root.val);
        printNode(root.left);
        printNode(root.right);
    }
    
}
