package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgram {
	
	public static void main(String[] args) {
		
		         //Key, Value
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		      // Addition
		map.put(null, "Velocity");
		map.put(34, "null");
		map.put(78, "Batch");
		map.put(1, "Pune");
		map.put(2, "null");
		
		
		
		// Retrival
		String x = map.get(34);
		System.out.println(x);
		
		System.out.println("---------------------");
		
		
	//	Retrival using loop
		for(Map.Entry<Integer, String>e : map.entrySet())
		{
			
			System.out.println("Key = " + e.getKey() + " Value = " + e.getValue());
			
		}
		
		System.out.println("***********************");
		
		
		
		//key - unique -> can not be duplicate   => only 1 null key allowed
		//value - can be duplicate               => Any no. of null values allowed
		
		map.put(null, "Mumbai");      // new pair added
		map.put(78, "Class");       // value replace
		map.put(55, "Pune");        // new pair added
		
			
		for(Map.Entry<Integer, String>e : map.entrySet())
		{
			
			System.out.println("Key = " + e.getKey() + " Value = " + e.getValue());
			
		}
		
		
		
		
	System.out.println("**********************************8");	
	
	
	
	
		
		
		// deletion
		
		map.remove(34);
		
		

		for(Map.Entry<Integer, String>e : map.entrySet())
		{
			
			System.out.println("Key = " + e.getKey() + " Value = " + e.getValue());
			
		}
		

		
	System.out.println("--------------------------------------");	
		
		map.remove(2, "2024");
		
		
		for(Map.Entry<Integer, String>e : map.entrySet())
		{
			
			System.out.println("Key = " + e.getKey() + " Value = " + e.getValue());
			
		}
		
		
	}

}
