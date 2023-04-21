/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
         ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < lists.length; i++) {
            while (lists[i] != null) {
                arrayList.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        Collections.sort(arrayList);
        ListNode head = new ListNode();
        ListNode answer = head;
        for (int i = 0; i < arrayList.size(); i++) {
            head.next = new ListNode(arrayList.get(i));
            head = head.next;

        }

        return answer.next;
    }
}