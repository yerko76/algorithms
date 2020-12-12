package problems;

public class IntersectionOfLinkedList {
   public static void main(String[] args){
       LinkedListNode first = new LinkedListNode(1);
       first.next = new LinkedListNode(2);
       first.next.next = new LinkedListNode(3);
       first.next.next.next = new LinkedListNode(4);
       first.next.next.next.next = new LinkedListNode(5);
       LinkedListNode second = new LinkedListNode(7);
       second.next = new LinkedListNode(8);
       second.next.next = first.next.next.next;

       System.out.print(getResult(first, second));
   } 

   private static int getResult(LinkedListNode first, LinkedListNode second){
       var lenFirstList = getLenght(first);
       var lenSecondList = getLenght(second);
       var currentFirst = first;
       var currentSecond = second;
       if(lenFirstList > lenSecondList){
            int offset = lenFirstList - lenSecondList;
            while(offset > 0){
                currentFirst = currentFirst.next;
                offset--;
            }
       }else{
        int offset = lenSecondList - lenFirstList;
        while(offset > 0){
            currentSecond = currentSecond.next;
            offset--;
        }
       }
       while(currentFirst != currentSecond){
           currentFirst = currentFirst.next;
           currentSecond = currentSecond.next;
       }
       return currentFirst.val;
   }

   private static int getLenght(LinkedListNode node){
       int lenght = 0;
       var current = node;

       while(current != null){
           current = current.next;
           lenght++;
       }
       return lenght;
   }
}
