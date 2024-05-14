package operations;

public class AndOperation {

	public static void main(String[] args) {
	
		boolean a= true;
		boolean b=true;
		
		boolean c= a && b;
		System.out.println("AND= " +c);
		
		 a= false;
		 b=true;
		
		 c= a && b;
		System.out.println("AND= " +c);
		
		
		 a= true;
		 b=false;
		
		 c= a && b;
		System.out.println("AND= " +c);
		
		
		 a= false;
		 b=false;
		
		 c= a && b;
		System.out.println("AND= " +c);
		
		
		
		
		
		
		
	}
}
