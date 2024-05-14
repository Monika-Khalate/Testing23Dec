package interfaceimplementation;

public interface AllIncomplete {
	
	// 100% abstract
	// constructor is not present in interface
	
	
	int g=78;      // It is public static final variable.
	
	
	void test();     // It is public & abstract method. Don't call it as non-static method.
	
//----------------------------------------------------------------------------------------
	
	
	// static method of interface 
	//used for security purpose.
	//static method of interface CAN NOT be inherited in implementation class.
	
	// not comes under the definition of interface. This is extra feature added by java
	
	static void set()
	{
		System.out.println("Set");
	}
	
//-----------------------------------------------------------------------------------------
	
	
	
	// default method of interface. This feature starts from JAVA 8 jdk 1.8 version
	
	// Rules for default method
	// 1. default method of interface CAN be inherited in implementation class.
	//2. default method of interface CAN be override. it is not a static method.
	
	
	// not comes under the definition of interface. This is extra feature added by java
	
	default void get()
	{
		System.out.println("Get");
	}
	
}
