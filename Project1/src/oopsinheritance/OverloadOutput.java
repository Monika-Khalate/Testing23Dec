package oopsinheritance;

public class OverloadOutput {
	
	public static void main(String[] args) {
		
		OverloadSuper x= new OverloadSuper();
		x.test();
		
		
		// overloading in sub class
		
		OverloadSub y= new OverloadSub();
		y.test();
		y.test(56);
		
	}

	
}
