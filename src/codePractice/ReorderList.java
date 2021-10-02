package codePractice;

import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/reorder-list/
public class ReorderList {


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public void reorderList(ListNode head) {

        Stack<ListNode> s = new Stack<>();
        ListNode ans = head;
        ListNode tmp = head;
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        head = tmp;

        if (size % 2 != 0) size = (size / 2) + 1;
        else size = size / 2;

        while (head != null) {
            if (size <= 0) s.push(head);
            head = head.next;
            size--;
        }
        head = tmp;
        while (!s.empty()) {
            head = head.next;
            tmp.next = s.pop();
            tmp.next.next = head;
            tmp = tmp.next.next;
        }
        head.next = null;
        head = ans;
    }

    public static void main(String[] args) {

    }
}
