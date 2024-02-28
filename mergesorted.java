package Problem;


public class mergesorted {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        mergesorted ms = new mergesorted();
        ListNode head = ms.new ListNode();
        ListNode current = head; //กำหนดให้ pointer ชี้ไปที่ listNode แรก
        while (list1!=null || list2!=null) {
            if (!(list1!=null && list2!=null)) {
                if(list1==null){
                    ListNode newNode = ms.new ListNode(list2.val);
                    current.next = newNode;
                    current = current.next;
                    list2 = list2.next;
                    continue;
                }if(list2==null){
                    ListNode newNode = ms.new ListNode(list1.val);
                    current.next = newNode;
                    current = current.next;
                    list1 = list1.next;
                    continue;
                }
            }
            if (list1.val <= list2.val) {
                ListNode newNode = ms.new ListNode(list1.val);
                current.next = newNode;
                current = current.next;
                list1 = list1.next;
            }else{
                ListNode newNode = ms.new ListNode(list2.val);
                current.next = newNode;
                current = current.next;
                list2 = list2.next;
            }
        }
        head = head.next; //เปลี่ยนตัวชี้เริ่มต้นไปเป็นตัวที่ 2
        return head;
    }

    
    //fastest
    public static ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if(list1!=null && list2!=null){
            if(list1.val<list2.val){
                list1.next=mergeTwoLists2(list1.next,list2);
                return list1;
            }
            else{
                list2.next=mergeTwoLists2(list1,list2.next);
                return list2;
            }
        }
        if(list1==null)
            return list2;
        return list1;
    }

    public static void main(String[] args) {
        mergesorted ms = new mergesorted();
        ListNode litst1 = ms.new ListNode(1, ms.new ListNode(2, ms.new ListNode(4,null)));
        ListNode litst2 = ms.new ListNode(1, ms.new ListNode(3, ms.new ListNode(4,null)));
        ListNode result1 = mergeTwoLists1(litst1, litst2);
        //ListNode result2 = mergeTwoLists2(litst1, litst2);
        while (result1 != null) {
            System.out.print(result1.val + " ");
            result1 = result1.next;
        }
        System.out.println("");

        // while (result2 != null) {
        //     System.out.print(result2.val + " ");
        //     result2 = result2.next;
        // }
        // System.out.println("");
    }
}