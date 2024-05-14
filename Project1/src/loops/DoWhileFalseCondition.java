package loops;

public class DoWhileFalseCondition {
	
	public static void main(String[] args) {
		
		int a=11;
		
		System.out.println("Start");
		
		do
		{
			System.out.println("Hello");
			a++;
		}
		while(a<10);                    // here condition is false. but still we got o/p at one time.
		System.out.println("End");     // whatever condition may be, do while loop executes program at least once
	}                                  

}
