package test2;

public class InnerClass {
	
	int  x = 1 ;
	double y = 4.2 ;
	
	class Subclass{
		int val = 17 ;
		void calculateMlut(){
			System.out.println(x*y);
		}
		
		public class innerSub{
			
			void print(){
				System.out.println("inner inner inner");
			}
		}
	}
	
	/*static int  x = 1 ;
	static double y = 4.2 ;
	
	static class subClass {
		
		int i = 3; 
		
		double calculateSize() {
			return (x*y*i);
		}
	}*/
}
