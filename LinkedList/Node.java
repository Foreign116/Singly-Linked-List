package LinkedList;

public class Node {
	int Data;
	Node next;
	public Node(int CData) {
		Data = CData;
		next=null;
	}

	public int value() {
		return Data;
	}

	public void revalue(int NData) {
		Data = NData;
	}
}
