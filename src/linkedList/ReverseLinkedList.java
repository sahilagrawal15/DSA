package linkedList;

/*
Given the head of a singly linked list, reverse the list, and return the reversed list.
*/

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null, agla = temp;
        while(temp!=null){
            agla = temp.next;
            temp.next = prev;
            prev = temp;
            temp = agla;
        }
        return prev;
    }
}
