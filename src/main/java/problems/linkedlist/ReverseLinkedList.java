package problems.linkedlist;

import java.util.Stack;

public class ReverseLinkedList {
    public static void main(String[] args){
        LinkedListNode list = new LinkedListNode(10);
        list.next = new LinkedListNode(20);
        list.next.next = new LinkedListNode(30);
        list.next.next.next = new LinkedListNode(40);

        LinkedListNode reversed = reverse(list);
         
        while(reversed != null) {
            System.out.println(reversed.val);
            reversed = reversed.next;
        }
    }

    private static LinkedListNode reverse2(LinkedListNode node){
        var current = node;
        LinkedListNode prev = null;
        while(current != null){
            var temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        return prev;
    }

    private static LinkedListNode reverse(LinkedListNode list){
       LinkedListNode current = list; 
       Stack<LinkedListNode> stack = new Stack<>();
       
       while(current != null){
           stack.push(current);
           current = current.next;
       }

       LinkedListNode reversed = new LinkedListNode(-1);
       while(!stack.isEmpty()){
         reversed.next = stack.pop();
       }
       return reversed;
    }
    
}

class LinkedListNode{
    int val;
    LinkedListNode next;
    LinkedListNode head;
    public LinkedListNode(int val){
        this.val = val;
    }

    public LinkedListNode(int val, LinkedListNode next){
        this.val = val;
        this.next = next;
    }

    public void printList(){
        LinkedListNode current = head;
        while(current != null){
            System.out.println(current.val);
            current = current.next;
        }
    }

    public void addElement(int val){
        LinkedListNode newNode = new LinkedListNode(val);
        if(head == null){
            head = newNode;
            return;
        }

        LinkedListNode current = head;
        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;
    }
    

}
