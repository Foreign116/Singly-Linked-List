package LinkedList;

public class Driver {

	public static void main(String args[]) {
		LinkedList ll = new LinkedList(new Node(1));
		ll.add(new Node(2));
		ll.add(new Node(3));
		ll.add(new Node(100));
		ll.print();
	}
}
