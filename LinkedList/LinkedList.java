package LinkedList;

public class LinkedList {
	private Node head;

	public LinkedList(Node n) {
		head = n;

	}

	public void add(Node n) {
		Node og = head;
		while (head.next != null) {
			head = head.next;
		}
		head.next = n;
		head = og;
	}

	public void print() {
		Node og = head;
		if (head != null) {
			System.out.print("[" + head.Data + "]" + "->");
		}
		while (head.next != null) {
			head = head.next;
			System.out.print("[" + head.Data + "]" + "->");
		}
		System.out.print("["+"null"+"]");
		head = og;
	}
}
