package test2;


public class test {

	public static void main(String[] args) {
		
		InnerClass inner = new InnerClass();
		
		InnerClass.Subclass sub1 = inner.new Subclass();
		
		sub1.calculateMlut();
		
		System.out.println(sub1.val);

		InnerClass.Subclass.innerSub insub2 =  sub1.new innerSub();// define object of 3rd inner class
		
		insub2.print();
		
		/*InnerClass.subClass sub = new InnerClass.subClass();// define static subclass
		
		///System.out.println(f.toString());
		
		double s = sub.calculateSize();;
		
		System.out.println(s);*/
	}
}
