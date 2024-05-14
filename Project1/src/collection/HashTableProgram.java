package collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableProgram {
	
	public static void main(String[] args) {
		
		
	// Null key not allowed -> run time exception => NullPointer Exception
	// Null value not allowed -> run time exception => NullPointer Exception	
		
		
		
		
		      //key , value
	Hashtable<String,Integer> student1 = new Hashtable<String,Integer>();
	
		student1.put("Math", 80);
		student1.put("Science", 81);
		student1.put("History", 80);
		student1.put("Testing", 40);
		
		
		int mark = student1.get("Math");
		System.out.println(mark);
		System.out.println("------------------------------");
		
		
		
//		Retrival using loop
			for(Map.Entry<String, Integer>e : student1.entrySet())
			{
				
				System.out.println("Key = " + e.getKey() + " Value = " + e.getValue());
				
			}
			
			System.out.println("------------------------------");
			
			
		
		
			student1.remove("Testing");
		

		for(Map.Entry<String, Integer>e : student1.entrySet())
		{
			
			System.out.println("Key = " + e.getKey() + " Value = " + e.getValue());
			
		}
		
		
	System.out.println("--------------------------------------");
	
	
	
	
	student1.put("History", 46);
	student1.put("Science", 88);
		
		
	for(Map.Entry<String, Integer>e : student1.entrySet())
	{
		
		System.out.println("Key = " + e.getKey() + " Value = " + e.getValue());
		
	}
		
		
		
		
		
	}

}
