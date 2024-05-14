package constructorchaining;

public class Demo1 {
	static int a=12;  // global static 
	int b= 34;        // global non static
	

	// non static method
	
	void test()
	{
		System.out.println(a);
		System.out.println(b);   
	}
	
	
	public static void main(String[] args) {
		
		Demo1 x= new Demo1();
		x.b=545;
		
		
		Demo1 y= new Demo1();
		y.b=666;
		
		
		x.test();
		y.test();
		
		
	}
}
