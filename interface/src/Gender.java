
public enum Gender { // Enum use for define variables with countable number
	Male(10,15 , "hello i'm styding java"){
		void Name(){
		System.out.println("Male: shut up");
		}
	}
	,Female(21,57, "hello i'm waiting for new make up"){
		void Name(){
			System.out.println("Female: its not your work");
		}
	}; // deal as parameters or objects
	
	int age ;
	String message ;
	int avg ;
	
	private Gender(int age , int avg, String mes ) {
		this.age = age ;
		this.message = mes ;
		this.avg = avg ;
	}
	 void print() {
		 System.out.println(this.age + " for print"); // print parameter age
	 }
	 abstract void Name();
}