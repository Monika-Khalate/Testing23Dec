package operations;

public class OrOpeation {
	
	public static void main(String[] args) {
		
		
		boolean a= true;
		boolean b=true;
		
		boolean c= a || b;
		System.out.println("OR= " +c);
		
		 a= false;
		 b=true;
		
		 c= a || b;
		System.out.println("OR= " +c);
		
		
		 a= true;
		 b=false;
		
		 c= a || b;
		System.out.println("OR= " +c);
		
		
		 a= false;
		 b=false;
		
		 c= a || b;
		System.out.println("OR= " +c);
		
				
		
		
	}

}
