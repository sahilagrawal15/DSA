package linkedList;

/*
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.
*/

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1, temp2 = list2;
        ListNode result=null;
        if(list1==null)
            return list2;
        else if (list2==null)
            return list1;

        if(temp1.val <= temp2.val){
            result = temp1;
            temp1 = temp1.next;
        }
        else if(temp1.val > temp2.val){
            result = temp2;
            temp2 = temp2.next;
        }
        ListNode curr = result;

        while(temp1!=null && temp2!=null){
            if(temp1.val <= temp2.val){
                curr.next = temp1;
                temp1 = temp1.next;
            }
            else if(temp1.val > temp2.val){
                curr.next = temp2;
                temp2 = temp2.next;
            }
            curr=curr.next;
        }
        if(temp1!=null)
            curr.next = temp1;
        else
            curr.next = temp2;

        return result;

    }
}
