
public class linkedQueue {

	static class Node {
		Object value;
		Node next, previous;

		Node(int value) {
			this.value = value;
		}
	}

	static Node first, last;
	static int count = 0;

	static void addLast(Node current) {

		if (count == 0) {
			current.next = null;
			first = last = current;
			count++;
		} else {
			current.next = null;
			last.next = current;
			current.previous = last;
			last = current;
		}

		System.out.println("added:  " + current.value);

	}

	static void deleteFirst() {
		System.out.println("Deleted:  " + first.value);
		first = first.next;
		first.previous = null ;
		count--;

	}

	static void print() {
		Node cur = first;
		while (cur != null) {
			System.out.println("value:  " + cur.value+"\n");
			cur = cur.next;
		}
	}

	public static void main(String[] args) {

		addLast(new Node(4));
		print();
		addLast(new Node(5));
		print();
		addLast(new Node(6));
		print();
		deleteFirst();
		print();
		deleteFirst();
		print();
	}
}
