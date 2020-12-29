package leetcode.linkedlist;

public class AddOneToLinkedList {
    public static void main(String[] args){
        ListNode head = ListNode.addNode(1);
        head.next = ListNode.addNode(2);
        head.next.next = ListNode.addNode(3);

        var result = execute(head);

        ListNode.printList(result);
    }


    private static ListNode execute(ListNode head){
        var reversed = reverse(head);
        var addOne = addOne(reversed);
        return reverse(addOne);
    }

    public static ListNode addOne(ListNode head){
        if(head == null) return new ListNode(1);
        ListNode current  = head;
        ListNode temp = null;
        int sum = 1;
        int carry =1;

        while(head != null){
            sum = carry + head.data;
            carry = (sum >= 10) ? 1 : 0;
            sum = sum % 10;
            head.data = sum;
            temp = head;
            head = head.next;
        }

        if(carry > 0){
            temp.next = ListNode.addNode(carry);
        }

        return current;
    }

    public static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr  = next;

        }

        return prev;
    }
    
}

class ListNode {
    int data;
    ListNode next;

    public ListNode(){}

    public ListNode(int data){
        this.data = data;
    }

    public static void printList(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    
    public static ListNode addNode(int data){
        ListNode node = new ListNode();
        node.data = data;
        node.next = null;
        return node;
    }
}