package problems.tree;
import java.util.List;
import java.util.ArrayList;

public class RootToLeafSum {
    public static void main(String[] args){
        var root = new Node(10);
        var left = new Node(16);
        left.right = new Node(-3);

        var right = new Node(5);
        right.left = new Node(6);
        right.right = new Node(11);
        
        root.left = left;
        root.right = right;
        System.out.println(getSolution(root, 26));
    }

    private static List<Integer> getSolution(Node root, int targetSum){
        List<Integer> result = new ArrayList<>();
        helper(root, result, targetSum);
        return result;
    }

    public static boolean helper(Node root, List<Integer> result, int targetSum){
        if(root == null) return false;
        if(root.left == null && root.right == null){
            if(root.val == targetSum){
                result.add(root.val);
                return true;
            }else{
                return false;
            }
        }
        if(helper(root.left, result, targetSum - root.val)){
            result.add(root.val);
            return true;
        }
        if(helper(root.right, result, targetSum - root.val)){
            result.add(root.val);
            return true;
        }
        return false;
    }
    
}
