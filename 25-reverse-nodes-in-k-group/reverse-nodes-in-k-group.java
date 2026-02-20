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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev=null;
        ListNode start=head;
        ListNode curr=head;
        ListNode temp=null;

int c=1;

while(curr!=null)
{
   
    if(c%k==0)
    {
        temp=curr.next;
        curr.next=null;
        ListNode res=reverse(start);
        if(prev!=null)
        {
            prev.next=res;
        }
        else{
            head=res;
        }
        prev=start;
        start=curr=temp;

    }
    else{
        curr=curr.next;
    }
    c++;
}
if(prev!=null) {
    prev.next=start;
}

return head;
    }


   public  ListNode reverse(ListNode start)
   {
    ListNode nex=start;
    ListNode curr=start;
    ListNode prev=null;

    while(curr!=null)
    {
        nex=curr.next;
        curr.next=prev;
        prev=curr;
        curr=nex;
    }
    return prev;

   } 
}