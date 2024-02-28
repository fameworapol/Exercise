package Problem;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoLinkList {
    public static void main(String[] args) {
        
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(9);
        headA.next.next = new ListNode(1);
        headA.next.next.next = new ListNode(2);
        headA.next.next.next.next = new ListNode(4);

        ListNode headB = new ListNode(3);
        headB.next = new ListNode(2);
        headB.next.next = new ListNode(4);

        System.out.println(getIntersectionNode(headA, headB));
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int skipA = 3;
        int skipB = 1;
        return headB;
    }
}


