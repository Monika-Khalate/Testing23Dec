package constructor;

public class Testing1 {
	
	static int a= 10;   //static variable
	      int b= 20;    // non static variable
	      
	      
	      
	      // user defined constructor
	      Testing1 ()
	      {
	    	  
	    	  b=400;      // initialize
	    	//  System.out.println(b);
	      }
	      
         Testing1 (int f)
         {
        	b= 800;      // initialize
        //	System.out.println(b);
         }
         
         
         public static void main(String[] args) {
			
        	 // user defined zero argument constructor
        	 
        	 
        	 // 1. object create x
        	 // 2. variable declared x.b = 20
        	 // 3.constructor call- variable initialization x.b=400
        	 
        	 Testing1 x= new Testing1();
        	 System.out.println(x.b);           // used
        	 
   
        	 
        	 
        	 // user defined int type argument constuctor
        	 
        	 
        	 // 1. object create y
        	 // 2. variable declared y.b = 20
        	 // 3.constructor call- variable initialization x.b=800
        	 
        	 Testing1 y=new Testing1(56);
        	 System.out.println(y.b);
        	 
        	 
		}
}
