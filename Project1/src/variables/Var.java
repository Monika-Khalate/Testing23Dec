package variables;

public class Var {
	
	static int a=24;
	int b=9;
	
	
	
	public static void main(String[] args) {
		
		System.out.println(a);
		
		Var v= new Var();
		System.out.println(v.b);
		
		
		a=20;
		System.out.println(a);  // 20
		System.out.println(Var.a);// 20
		
		int b=29;
		System.out.println(b); // 29
		System.out.println(v.b);  // 9
		
		
		
	}

}
