package problems.tree;


public class SizeOfBinaryTree {
    public static void main(String[] args){
        var root = new Node(10);
        var left = new Node(2);
        left.left = new Node(6);

        var right = new Node(5);
        right.left = new Node(8);
        right.right = new Node(3);
        
        root.left = left;
        root.right = right;
        System.out.println(getSolution(root));
    }

    private static int getSolution(Node root){
        if(root == null) return 0;
        int left = getSolution(root.left);
        int righ = getSolution(root.right);
        return 1 + left + righ;
    }
    
}
