package conditionalstatements;

public class Testing1 {
	public static void main(String[] args) {
		
		int a=56;
		System.out.println("Start");
		
		switch (a)
		{
		case 10 : System.out.println("Hi");
	              break;
	              
		case 23 : System.out.println("Bye");          
	              break;
	              
		case 56 : System.out.println("Hello");  // here value of a=56 match with case no. 56 so, Hello will print
		          break;
		}
		System.out.println("End");
	}

}
