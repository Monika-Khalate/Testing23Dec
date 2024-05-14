package interfacecities;

public interface Bengluru {
	
	int g = 78;   //  public static final
	
	static  void set()
	{
		System.out.println("Set");
	}
	
	default void get()
	{
		System.out.println("Get");
	}
	
	void test();      // public abstract
	

}
