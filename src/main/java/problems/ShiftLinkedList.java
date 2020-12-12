package problems;

import facebook.LinkedList;

public class ShiftLinkedList {
     //10-20-30-40-50-60
    //50-60-10-20-30-40
   public static void main(String[] args){
    LinkedListNode list = new LinkedListNode(10);
    list.next = new LinkedListNode(20);
    list.next.next = new LinkedListNode(30);
    list.next.next.next = new LinkedListNode(40);
    list.next.next.next.next = new LinkedListNode(50);
    list.next.next.next.next.next = new LinkedListNode(60);

    LinkedListNode shifted = shiftLinkedList(list, 2);
   
    while(shifted != null){
        System.out.println(shifted.val);
        shifted = shifted.next;
    }

   }
   
   private static LinkedListNode shiftLinkedList(LinkedListNode head, int k){
       var listTail = head;
       var size = 1;

       while(listTail.next != null){
          listTail = listTail.next;
          size++;
       }

       int newTailPosition = size - k;

       LinkedListNode newTail = head;
       for(int i=1;i < newTailPosition;i++){
           newTail = newTail.next;
       }

       LinkedListNode newHead = newTail.next;
       newTail.next = null;
       listTail.next = head;
       return newHead;

   }
}
