import java.util.*;
public class FloydCycleDetectionAlgo {
	public static void main(String args[]) {		
		ListNode head = new ListNode(1);
		ListNode currNode = head;
		currNode.next = new ListNode(2);
		currNode = currNode.next;
		currNode.next = new ListNode(3);
		currNode = currNode.next;
		currNode.next = new ListNode(4);
		currNode = currNode.next;
		currNode.next = new ListNode(5);
		currNode = currNode.next;
		currNode.next = new ListNode(6);
		currNode = currNode.next;
		currNode.next = new ListNode(7);
		currNode = currNode.next;
		currNode.next = new ListNode(8);
		currNode = currNode.next;

		currNode.next = head.next.next; // tail of linked list is pointing at 3rd node in the list
		/*
		 *    Resulting linked list:
		 *     1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8
		 *               ^                       /
		 *                \---------------------                         
		 */


		 System.out.println(detectCycle(head).val);
	}

	public static ListNode detectCycle(ListNode head) {
		ListNode slow = head; // slow pointer will move one step ahead
		ListNode fast = head; // fast pointer will move two steps ahead
		while(fast.next != null && fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			// if fast and slow pointer meets at some point that means there is a cycle in linked list
			if(fast == slow) {
				slow = head;
				while(slow != fast) {
					slow = slow.next;
					fast = fast.next;
				}
				return slow;
			}
		}
		return null;
    }
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
	val = x;
	next = null;
	}
}
