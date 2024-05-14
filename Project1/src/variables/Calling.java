package variables;

public class Calling {
	
	static int a= 34;  // global variable  - class variable
    int b= 67;  // global variable  - instance variable
    
    
    Calling(int f)       // local variable
    {
    	int d= 89;       // local variable
    }

    
    void test(int g)       // local variable
    {
    	int j=45;            // local variable
    }
    
    public static void main(String[] args) {
		
    	int c= 78;       // local variable
    	
    	for(int x=1; x<5; x++)    // x- local variable
    	{
    		int s=89;     // local variable
    	}
    	
    	if(c<89)
    	{
    		int k=56;     // local variable
    	}
	}
}
