package conditionalstatements;

public class Testing3 {
	public static void main(String[] args) {
		
		String power ="square";
		int number = 45;
		int result;
		
		System.out.println("Start");
		
		switch(power)
		{
		case "square" : System.out.println("Hi");
		             result = number*number;
		             System.out.println(result);
		             break;
		             
		case "cube"  : System.out.println("Bye");   
		              result = number*number*number;
		              System.out.println(result);
		              break;
		              
		default      : System.out.println("system not support this number");
		              break;
		}
		System.out.println("End");
	}

}
