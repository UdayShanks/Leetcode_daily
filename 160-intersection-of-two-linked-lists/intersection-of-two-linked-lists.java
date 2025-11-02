/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodea=headA;
        ListNode nodeb=headB;

        while(nodea!=nodeb){
            if(nodea!=null){
                nodea=nodea.next;
            }
            else{
                nodea=headB;
            }
            if(nodeb!=null){
                nodeb=nodeb.next;
            }
            else{
                nodeb=headA;
            }
        }
        return nodea;
    }
}