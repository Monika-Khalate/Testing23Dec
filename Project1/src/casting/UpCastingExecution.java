package casting;

public class UpCastingExecution {
	public static void main(String[] args) {
		
		// super class
		UpCastingSuper x= new UpCastingSuper();
		x.test();
		
		// sub class
		UpCastingSub y= new UpCastingSub();
		y.test();
		
		
		// up casting
		UpCastingSuper z= new UpCastingSub();  //  calling object of sub class with 
		                                       // reference variable of super class.
		
		z.test();                           // in o/p we get execution of method in 'sub class'
		
	}

}
