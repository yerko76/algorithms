package problems.tree;

public class MaxPathSum {
   
    public static void main(String[] args){
        var root = new Node(-10);
        var left = new Node(9);
        var right = new Node(20);
        right.left = new Node(15);
        right.right = new Node(7);
        root.left = left;
        root.right = right;
       
        //expected output 42
        System.out.println(getSolution(root));
    }
    static int answer;
    private static int getSolution(Node root){
        answer = Integer.MIN_VALUE;
        dfs(root);
        return answer;
    }

    private static int dfs(Node node){
        if(node == null) return 0;
        int left = dfs(node.left);
        int right = dfs(node.right);
        answer = Math.max(answer, node.val + left + right);
        return Math.max(0, node.val + Math.max(left, right));
    }
    
}
