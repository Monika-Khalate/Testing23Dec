package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgram {

	
	public static void main(String[] args) {
		
		
	// Unique (Duplicate not allowed)
		
		HashSet<String> hash = new HashSet<String>();
		
		
		//Addition 
		hash.add("Velocity");
		hash.add("Testing");
		hash.add("Batch");
		hash.add("2023");
		hash.add("Pune");
		hash.add("Testing");
		hash.add("Velocity");
		
		
		// Retrive 
		Iterator <String> i = hash.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("-------------------------------------");
		
		
		
		i = hash.iterator();
		for(String x : hash)
		{
			System.out.println(i.next());
		}
		
		
		
		System.out.println("---------------------------------");
		
		
	//deletion
		hash.remove("Pune");
		
		
		for(String x : hash)
		{
			System.out.println(x);
		}
		
		
		
		
		
		
		
		
		
	}
}
