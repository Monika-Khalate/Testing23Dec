package collection;

import java.util.ArrayList;
import java.util.List;

import pack.Test1;


public class ArrayListProgram {
	
	public static void main(String[] args) {
		
		
	// List- Addressing (data storing order)	
		
		
	
		//Homogeneous
	ArrayList<Integer> a = new ArrayList<Integer>();
	// List<Integer> b = new ArrayList<Integer>();
	
	
	// Insertion
	a.add(22);
	a.add(34);
	a.add(56);
	a.add(98);
	a.add(90);
	
	int size = a.size();
	
	System.out.println("Homogeneous");
	
	for (int i=0; i<size; i++)
	{
		
		
		System.out.println(a.get(i));
	}
		
	System.out.println("----------------------------------");
	
	
	
	
	
	
	//Advance for loop or For-each loop
	
	System.out.println("by using Advance for loop or For-each loop");
	
	for(int x : a)
	
	{
		
		System.out.println(x);
	}
	
	
	
	
System.out.println("*******************************************");	
	
	
	
	
	
	
	
	
	
	
	// deletion
	
	a.remove(2);
	
	size = a.size();
	
	System.out.println("deletion");
	
	for(int i=0; i<size; i++)
	{
		
		System.out.println(a.get(i));
	}
	
	
	System.out.println("___________________________________________________");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Heterogeneous
		List b = new ArrayList();
		

		b.add(78);
		b.add("class");
		b.add(45.887);
		b.add('$');
		b.add(new Test1());
		
		size = b.size();
		
		System.out.println("Heterogeneous");
		
		for(int i = 0; i<size; i++)
		{
			
			System.out.println(b.get(i));
		}
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	

}
