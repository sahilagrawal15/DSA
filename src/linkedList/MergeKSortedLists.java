package linkedList;

/*
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
Merge all the linked-lists into one sorted linked-list and return it.
*/
public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = null;
        int size = lists.length;
        for (int i = 0; i < size; i++){
            ListNode list = lists[i];
            result = mergeSortedList(result, list);
        }
        return result;

    }
    //TODO: Need to improvise this solution
    public ListNode mergeSortedList(ListNode list1, ListNode list2) {
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
