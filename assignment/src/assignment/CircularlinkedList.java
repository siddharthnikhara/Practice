package assignment;

public class CircularlinkedList {

	private ListNode last;
	private int length;

	class ListNode {
		private ListNode next;
		private int data;

		public ListNode(int data) {
			this.data = data;
		}
	}

	public CircularlinkedList() {
		last = null;
		length = 0;

	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public void createCircularLinkedList() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(5);
		ListNode third = new ListNode(10);
		ListNode fourth = new ListNode(15);

		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;

		last = fourth;

	}

	public static void main(String[] args) {
		CircularlinkedList cll = new CircularlinkedList();
		cll.createCircularLinkedList();

	}

}
