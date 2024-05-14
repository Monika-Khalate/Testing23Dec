package accessmodifiers;

public class NonStaticVariable1 {
	
	public  int a=10;
            int b=20;
   private  int c=30;
    protected  int d=40;
    
    
    public static void main(String[] args) {
		
    	
    	NonStaticVariable1  var = new NonStaticVariable1();
    	
    	// within same class
    	
    	System.out.println(var.a);    // public
    	
    	System.out.println(var.b);    // default
    	
    	System.out.println(var.c);    //private
    	
    	System.out.println(var.d);    // protected
    	
    	
	}

}
