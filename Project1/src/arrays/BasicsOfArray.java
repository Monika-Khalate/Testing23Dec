package arrays;

public class BasicsOfArray {
	
	public static void main(String[] args) {
		
		// declaration & initialization
		
		int a[]= {10,20,30,40,50,60,70,80,90} ; // size=9
		
		// index   0  1  2  3  4  5  6  7  8
		
		//                  a of 4
		System.out.println(a[4]);   // use of array
		
		
		a[4]= 100;   // re assignment of data
		
		System.out.println(a[4]);  
		
		
		
		
		
		// declaration
		int b[]= new int [4]; // size=4
		                      // index:-  0, 1, 2, 3
		
		
		// initialization
		
		b[0]= 5;
		b[1]= 25;
		b[2]= 10;
		b[3]= 1;
		
		
		System.out.println(b[2]);  // use
		System.out.println(b[3]);
  
	
	}

}
