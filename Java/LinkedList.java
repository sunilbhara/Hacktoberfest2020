package Linked;

class Node{
	int val;
	Node next;
	
	Node(int a){
		val=a;
		next=null;
	}
}
public class LinkedList {
	Node head;
	LinkedList(){
		head=null;
	}
	
	public static Node kreverse(Node head,int k) {
		Node prev=null;
		Node cur=head;
		Node next=null;
		int i=0;
		while(cur!=null&&i<k) {
			next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
			i++;
		}
		if(cur!=null) {
			head.next=kreverse(cur,k);
		}
		return prev;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		Node n=new Node(1);
		l.head=n;
		n.next=new Node(2);
		n.next.next=new Node(3);
		n.next.next.next=new Node(4);
		n.next.next.next.next=new Node(5);
		n.next.next.next.next.next=new Node(6);
		Node a=l.kreverse(l.head, 5);
		while(a!=null) {
			System.out.println(a.val);
			a=a.next;
		}
		
	}

}
