package constructor;

public class Testing3 {

	static int a=10;
	int b= 20;
	
	public static void main(String[] args) {
		
		
	System.out.println("Testing3.a = "+ Testing3.a);	// static variable a call by ClassName.VariableName
	System.out.println("a = "+ a);    // a is static variable. so directly call
	// System.out.println(b);   b is non static variable. so we cant call it directly. create object for call b
	
	
	
	
	
	Testing2 x = new Testing2();
	System.out.println("Testing3.a = "+ Testing3.a);  //10
	System.out.println("a = "+ a);                    // 10
	System.out.println("x.a is "+ x.a);   // 10
	System.out.println("x.b is "+ x.b);    // 20
	
	Testing2 y = new Testing2();
	System.out.println("Testing3.a = "+ Testing3.a);  // 10
	System.out.println("a = "+ a);                     // 10
	System.out.println("y.a is "+ y.a);   // 10
	System.out.println("y.b is "+ y.b);    // 20
	
	
	
	x.b=50;
	x.a=100;
	
	System.out.println("Testing3.a = "+ Testing3.a);	// 10
	System.out.println("a = "+ a);                      //10
	System.out.println("x.a is "+ x.a);   // 100
	System.out.println("y.a is "+ y.a);    // 100
	System.out.println("x.b is "+ x.b);   // 50
	System.out.println("y.b is "+ y.b);    // 20
}

	
}