package stringclass;

public class Methods {
	
	public static void main(String[] args) {
		
		
		String a= "velocity";
		String b= "velocity batch testing pune 2023 batch class batch";
		
		
		char x= a.charAt(5);
	    System.out.println(x);
	    
	    int size=a.length();
	    System.out.println(size);
	    
	    
	    // return the index of 1st match of input character.
	    int z=b.indexOf('e');
	    System.out.println(z);
	    
	    
	    z= b.indexOf("batch");
	    System.out.println(z);
	    
	    //if input string/character not match return -1
	    z=b.indexOf("batchclass");
	    System.out.println(z);
	    
	    //last index of input character/string
	    z=b.lastIndexOf('e');
	    System.out.println(z);
	    
	    z=b.lastIndexOf("batch");
	    System.out.println(z);
	    		
	}

	

}
