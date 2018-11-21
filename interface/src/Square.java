
public class Square implements Interface{

	private int width , height;
	
	public Square() {
		
	}
	public Square(int width , int height) {
		this.width = width ;
		this.height= height ;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void stringPrint() {
		
		System.out.println("square width: " + this.width +",  square height: "+ this.height);
	}


	public int calculateArea() {

		return this.width * this.height;
	}

	public void calculateParameter() {
		System.out.println("Square paramerter: " + width + height);
	}

}
