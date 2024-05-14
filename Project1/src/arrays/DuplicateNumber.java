package arrays;

public class DuplicateNumber {
	
	public static void main(String[] args) {
		
		int a[]= {2,3,6,8,3,2,9,5,6};
		
		System.out.println("Duplicate numbers in array are");
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				System.out.println(a[i]);
			}
			
		}
		
		
	}
	
	
	

}
