package operations;

public class DifferentOperators {
	public static void main(String[] args) {
		
           byte a= 123;
            byte b=4;
	
            // By default result will be created with 4 byte(int) memory
            
            int c= a+b;
            System.out.println("Addition = "+ c);
            
            c= a-b;
            System.out.println("Substraction = "+ c);

            c= a*b;
            System.out.println("Multiplication = "+ c);

		
            c= a/b; // Quotient
            System.out.println("Division = "+ c);

		
            c= a%b; // Reminder
            System.out.println("Mod = "+ c);

		
		
            float d= a/b;
            System.out.println("Division = "+ d);
            
            
            float x=123;
            float y=4;
            d=x/y;
            System.out.println("Division = "+d);	
		
		
		
	}


}
