import java.util.Arrays;

public class Queue {
	
	static int rear=0, front=0,size=1;
	static Object[] dynamicQueue = new Object[size];
	
	static void inqueue(Object value) {
		checkSize(front+1);
		dynamicQueue[front] = value;
		front++;
		System.out.println("added: "+ value);
	}
	
	static void checkSize(int newSize) {
		if(newSize > dynamicQueue.length) {
			int newcapacity = dynamicQueue.length* 2;
			
			dynamicQueue = Arrays.copyOf(dynamicQueue, newcapacity);
		}
	}
	static void dequeue() {
		if(rear == front) {
			System.out.println("Queue is Empty");
			return;
			
		}
		int outer = (int)dynamicQueue[rear];
		rear ++;
		System.out.println(outer);
	}
	

	public static void main(String[] args) {
		inqueue(3);
		System.out.println("Queue Length: "+dynamicQueue.length);
		inqueue(4);
		System.out.println("Queue Length: "+dynamicQueue.length);
		inqueue(2);
		
		dequeue();
		dequeue();
		dequeue();
		
		
	

	}

}
