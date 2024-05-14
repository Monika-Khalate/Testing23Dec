package variables;

public class Introduction {
	
	static int a=34;  // global variable - class variable
	       int b=67;  // global variable - instance variable
	       
	       static void test(int y)
	       {
	    	   
	    	   int c=89;
	    	   System.out.println(c);
	    	   System.out.println(a);
	    	   
	    	   Introduction x= new Introduction();
	    	   System.out.println(x.b);
	    	   System.out.println(y);
	    	   
	       }
	       
	       public static void main(String[] args) {
	    	   
	    	   test(67);
			
		}

}
