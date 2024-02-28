package Problem;

public class deleteDuplicate {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val;this.next = next;}
    }

    public static void main(String[] args) {
        deleteDuplicate dp = new deleteDuplicate();
        ListNode litst = dp.new ListNode(1, dp.new ListNode(1, dp.new ListNode(2,dp.new ListNode(3,dp.new ListNode(3,null)))));
        ListNode result = deleteDuplicates(litst);
        // while (result != null) {
        //     System.out.print(result.val + " ");
        //     result = result.next;
        // }
        System.out.println("");
    }

    public static ListNode deleteDuplicates(ListNode head) {
        deleteDuplicate dp = new deleteDuplicate();
        while (head != null) {
            System.out.print(head.val+" > "+head.next.val+" , ");
            if(head.val == head.next.val){
                //if pointer to same value
                System.out.println("same");
            }
            head = head.next;
        }
        return head;
    }
}


