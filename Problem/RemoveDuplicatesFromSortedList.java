package Problem;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        // 1,1,2,3,3
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        ListNode result = deleteDuplicates(head);
        ListNode current = result;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        // ListNode result = new ListNode();
        int i = 0;
        ListNode currentResult = new ListNode();
        while (current != null) {
            // ListNode newNode = new ListNode(current.val);
            // currentResult = currentResult.next;
            if (i==0) {
                currentResult = new ListNode(current.val);
            }else{
                appendToList(currentResult, current.val);
            }
            if (current.val == current.next.val) {
                current = current.next.next;
            } else {
                current = current.next;
            }
            i++;
        }
        return currentResult;
    }

    public static void appendToList(ListNode head, int value) {
        ListNode newNode = new ListNode(value);
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
}
