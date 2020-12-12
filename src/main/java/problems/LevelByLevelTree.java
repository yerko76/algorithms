package problems;

import java.util.*;

public class LevelByLevelTree {
   public static void main(String[] args){
       var root = new Tree("a", new ArrayList<>());
       var childrens = new ArrayList<Tree>();
       childrens.add(new Tree("b", new ArrayList<>()));
       childrens.add(new Tree("c", new ArrayList<>()));
       root.childrens.addAll(childrens);
       root.childrens.get(0).childrens.add(new Tree("g", new ArrayList<>()));
       root.childrens.get(1).childrens.add(new Tree("d", new ArrayList<>()));
       root.childrens.get(1).childrens.add(new Tree("e", new ArrayList<>()));
       root.childrens.get(1).childrens.add(new Tree("f", new ArrayList<>()));
       
       System.out.print(printTreeLevelByLevel(root));
   } 

   private static String printTreeLevelByLevel(Tree root){
       Queue<Tree> queue = new LinkedList<>();
       queue.add(root);
       StringBuilder result = new StringBuilder();
       while(!queue.isEmpty()){
            var size = queue.size(); 
            while(size > 0){
                var node = queue.remove();
                result.append(node.val);
                for(var child : node.childrens){
                    queue.add(child);
                }
                size--;
            }
            result.append("\n");
       }
       return result.toString();
   }


}


class Tree{
    String val;
    List<Tree> childrens;

    public Tree(String val, List<Tree> childrens){
        this.val = val;
        this.childrens = childrens;
    }
}
