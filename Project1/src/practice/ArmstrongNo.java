package practice;



public class ArmstrongNo {
	
	public static void main(String[] args) {
		
		int n=153;
		int arm=0;
		int original=n;
		int r;

		
		while(n>0)
		{
			r=n%10;
			arm=arm+(r*r*r);
			n=n/10;
		}
		
		if(original==arm)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not Armstrong number");
		}
	}

}
