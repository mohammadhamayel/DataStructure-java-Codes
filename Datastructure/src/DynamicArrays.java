import java.util.Arrays;

public class DynamicArrays {
	static int arr[] ;
	static int size ;
	public static void main(String[] args) {
		size = 0 ;
		arr = new int[1];
		
		for (int i = 0; i < 15; i++) {
			add(i);
			System.out.println(arr[i]);
			System.out.println("lllllllllllllll:     "+arr.length);
			if(arr.length>= 14)
				break;
		}
		
		System.out.println(arr.length);
		
	}
	static void checkLength(int mincapacity) {
		
		if(arr.length < mincapacity) {
			int newlength = arr.length * 2 ;
			
			arr = Arrays.copyOf(arr, newlength);
			
		}
	}
	static void add(int value) {
		checkLength(size+1);
		arr[size++]= value;
		
	}

}
