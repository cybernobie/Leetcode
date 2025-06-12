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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode pre=head;
        ListNode curr=head.next;
        int first=-1;
        int i=1;
        int pre_i=-1;
        int max=0;
        int min=Integer.MAX_VALUE;
        while(curr.next!=null){
            if( (curr.val>pre.val && curr.val > curr.next.val) || ( curr.val < pre.val && curr.next.val> curr.val ) ){
                
                if(first!=-1){
                    min=Math.min(min,i-pre_i);
                }
                if(first==-1){
                     first=i;
                }
                pre_i=i;
            }

            pre=curr;
            curr=curr.next;
            i++;
        }
        if(min==Integer.MAX_VALUE){
            return new int[] {-1, -1};
        }
        return new int[] {min, pre_i-first};

    }
}