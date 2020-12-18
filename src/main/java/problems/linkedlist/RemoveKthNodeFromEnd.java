package problems.linkedlist;

public class RemoveKthNodeFromEnd {
    public static void main(String[] args){
        LinkedListNode head = new LinkedListNode(0);
        head.addElement(1);
        head.addElement(2);
        head.addElement(3);
        head.addElement(4);
        head.addElement(5);
        head.addElement(6);
        head.addElement(7);
        head.addElement(8);
        head.addElement(9);
  
        removeElementFrom(head, 4);

        head.printList();
    }

    private static void removeElementFrom(LinkedListNode head, int k){
        int counter = 1;
        LinkedListNode first = head;
        LinkedListNode second = head;

        while(counter <= k){
            second = second.next;
            counter++;
        }

        if(second == null){
            head.val = head.next.val;
            head.next = head.next.next;
            return;
        }

        

    }

    
    
}
