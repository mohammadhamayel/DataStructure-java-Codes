
public class Rectangle implements Interface, AnotherInterface{
	
	private int width=5, height=5 ;
	
	public Rectangle() {
		
	}
	public Rectangle(int width , int height) {
		this.width = width ;
		this.height = height;
	}
	
	int getWidth() {
		return width;
	}
	
	void setWidth(int width) {
		this.width = width;
	}
	
	int getHeight() {
		return height;
	}
	void setHeight(int height) {
		this.height = height;
	}
	
	public void stringPrint() {
		System.out.println("Rectangle width: "+ this.width + ",   Rectangle height :"+ height);
	}
	
	public int calculateArea() {
		return width * height ;
	}
	
	public void calculateParameter() {
		System.out.println("Rectangle Parameter: "+ width + height);
	}
	public void SquareArea() {
		 System.out.println("Sqr Rectangle: "+ Math.sqrt(calculateArea()));
	}
	
}
