import java.util.Arrays;

public class Stack <T>{
	static int size=1,top = -1;
	static Object [] dynamicStack = new Object[size];
	
	static void puch(Object item) {
		top+=1 ;
		checkSize(top+1);
		dynamicStack[top] = item ;
		
		System.out.println("add Done "+ item);
		
	}
	static void checkSize(int newSize) {
		if(newSize> dynamicStack.length) {
			int newCapacity = dynamicStack.length * 2 ;
			
			dynamicStack = Arrays.copyOf(dynamicStack, newCapacity);
		}
	}
	static int pop() {
		int item= (int) dynamicStack[top];
		top-- ;
		return item ;
		
	}
	static void print() {
		System.out.println(pop());
	}
	
	public static void main(String[] args) {
		puch(4);
		puch(3);
		puch(1);
		puch(67);
		System.out.print("top number:"+dynamicStack.length+"    value: ");
		
		print();
		
		System.out.print("top number:"+(dynamicStack.length-1) +"    value: ");
		
		print();
		
	}
}
