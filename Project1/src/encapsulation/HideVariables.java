package encapsulation;

public class HideVariables {
	
	// All variables in abstraction class should be private
	
	private static int a;
	private int b;
	private int c;
	private int d;
	
	
	HideVariables()
	{
		a=12;
		b=67;
		c=45;
		d=89;
	}
	
	HideVariables(int x)
	{
	a=212;
	b=637;
	c=465;
	d=889;
			
	}
	
//---------------------------------------------------------------------------------------------------
	
	// getter - to get the value
	public int get()
	{
		return b;
	}
	
	// setter - to set the value
	public void set(int x)
	{
		c=x;
	}
	
//------------------------------------------------------------------------------------------------------	
	
	public int add()
	{
		return a+b;
	}
	
	public int sub()
	{
		return a-b-c-d;
	}

}
