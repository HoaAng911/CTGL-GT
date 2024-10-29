package leetcode;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class leetcode141 {
    public boolean hasCycle(ListNode Head) {
        if (Head == null || Head.next == null) {
            return false;
        }
        ListNode Slow = Head;
        ListNode Fast = Head.next;
        while (Slow != Fast) {
            if (Fast == null || Fast.next == null) {
                return false;
            }
            Slow = Slow.next;
            Fast = Fast.next.next;
        }
        return true;
    }

}