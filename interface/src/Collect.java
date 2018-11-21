
public class Collect {
	
	public void poly (Interface value) {
		String className = "";
		
		if(value instanceof Rectangle) { // check if object is Rectangle to use its special methods
			className = "Rectangle";
			Rectangle r = (Rectangle)value;
			r.SquareArea();
			
		}
		if(value instanceof Square) {// check if object is Square to use its instances
			className = "Square";
			;
		}
		else
			className = "Circle"; // otherwise the object is Circle
		
		System.out.println(className+" Area : "+value.calculateArea());
		value.stringPrint();
		value.calculateParameter();
		System.out.println();
		
		
	}
	public void polyAnother(AnotherInterface value) { // new method for anotherInterface class if there a lot of methods, do this step 
		value  .SquareArea();
	}
}
