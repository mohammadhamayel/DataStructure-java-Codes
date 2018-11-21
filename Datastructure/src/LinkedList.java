
public class LinkedList {
	
	static class Node<T>{
		T value ;
		Node next ;
		Node(T value ){
			this.value = value ;
			
		}
	}
	static Node<Integer> first  ;
	
	/*LinkedList(Node first){
		this.first = first ;
	}*/
	static void addFirst(Node node) {
		node.next = first ;
		first = node ;
		System.out.println("added done");
		
		
	}
	static void deleteFirst() {

		first = first.next ;
	
	}
	static void printNodes() {
		Node current = first ;
		while(current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}
	public static void main(String[] args) {
		
		addFirst(new Node<Integer>(13));
		addFirst(new Node<Integer>(14));
		addFirst(new Node<Integer>(45));
		addFirst(new Node<String>("mohammad"));
		printNodes();
		System.out.println("do delete");
		deleteFirst();
		printNodes();
		
	}
	

}
