package oopsinheritance;

public class MethodHidingResult {

	public static void main(String[] args) {
		
		MethodHidingSuper.test();
		
		// method hiding
		MethodHidingSub1.test();
		
		MethodHidingSub1.test();
		
		
	}
}
