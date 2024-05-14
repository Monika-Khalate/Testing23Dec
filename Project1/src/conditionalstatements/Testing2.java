package conditionalstatements;

public class Testing2 {
	public static void main(String[] args) {
		
		int a = 45;
		System.out.println("Start");
		
		switch(a)
		{
		case 10 : System.out.println("Hi");
		          break;
		 
		case 23 : System.out.println("Bye");
		          break;
		          
		case 56 : System.out.println("Hello");
		          break;
		
		 default : System.out.println("default output"); // a=45 does not match with any case. so, default msg print
		           break;
		}
		
		System.out.println("End");
	}

}
