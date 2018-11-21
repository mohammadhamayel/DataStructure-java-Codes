//import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {// Run classes
		
		for (Gender gen : Gender.values()) {
			gen.Name();
		}
		System.out.println(Gender.Male.age);
		
		Collect c = new Collect();
		System.out.println(c.getClass().getName());
		
		System.out.println(Gender.Male.getClass().getComponentType());;
		
		//test enum data 
		/*System.out.println(Gender.Female.message);// implement Enum state that done in gender class
		System.out.println(Gender.Male.avg);
		Gender.Male.print();
		Gender.Male.Name();
		Gender.Female.Name();*/
		
		//Gender var = Gender.Male ;
		
		
		
		/*switch(var) {
		case Male: System.out.println("Male");break;
		case Female: System.out.println("Female");break ;
		}*/
		
		//System.out.println("Enter your Genger ");
		/*Scanner input = new Scanner(System.in);
		
		String var= input.nextLine();*/
		
		
		//test Interface data 
		/*Square s = new Square(5,5);
		Rectangle r = new Rectangle(8,6);
		
		Collect c = new Collect();
		
		Interface i = new Interface() {
			int radius = 5 ;
			public void stringPrint() {
				System.out.println("Cicle");
			}
			public int calculateArea() {
				return (int)3.14 * radius ;
			}
			public void calculateParameter() {
				System.out.println("Circle Parameter: "+(int) 2*3.14*radius);
			}
		};
		
		c.poly(r);
		c.poly(s);
		c.poly(i);
		
		c.polyAnother(r);*/
	}

}
