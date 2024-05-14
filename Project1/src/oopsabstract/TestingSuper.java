package oopsabstract;

           // abstract class - super class
public abstract class TestingSuper {
	
	static int a=2;
	       int b=6;
	
	       
	static void test()
	{
		System.out.println("Hi");
	}
	
	void get()
	{
		System.out.println("Non static - Complete");
	}
	
	abstract void set();
	abstract void payment();
	abstract void recharge();
	

}
   // total method 5
   // complete 2 
   // incomplete 3
   //  60 % abstract