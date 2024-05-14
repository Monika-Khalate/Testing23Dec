package variables;

public class StaticNonstatic {
	
	static int a= 34;  // global variable  - class variable
	       int b= 67;  // global variable  - instance variable
	       
	       
	       static StaticNonstatic z= new StaticNonstatic();  // global object reference - class reference
	       
	       static void test()
	       {
	    	   System.out.println("Static Method");
	       }

	       void demo()
	       {
	    	   System.out.println("Non-Static method");
	       }
	       
	       public static void main(String[] args) {
			test();
			StaticNonstatic.test();
			
			StaticNonstatic x= new StaticNonstatic();
			x.demo();
		}
}
