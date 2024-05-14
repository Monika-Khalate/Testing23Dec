package arrays;

public class AscendingArray {
	
	public static void main(String[] args) {
		
		
		int a[]= {12,76,45,90,33,72};
		
		for(int i=0; i<=(a.length-1); i++)
		{
			
	System.out.print(a[i]+ ",");
		}
		System.out.println();
		
		
		int temp;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])            // for ascending use >, for descending use <
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+ ",");
		}
	}

}
