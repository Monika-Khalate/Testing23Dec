package encapsulation;

public class CallingHideVariables {
	
	public static void main(String[] args) {
		
		HideVariables x= new HideVariables();
		
		int j= x.get();      // getter method used to get the value of variable
		                     // (in this example, we ask for the value of 'b')  return b
		                     
		System.out.println(j);  // b=67
		
		
		x.set(56);       // setter method is used to set the value(here, we set value 56 to the variable 'c')
		
		int r= x.add();
		int s= x.sub();
		
		System.out.println(r);
		System.out.println(s);
		
		
		
		HideVariables y=new HideVariables(5);
		r=y.add();
		s=y.sub();
		
		System.out.println(r);
		System.out.println(s);
		
		// As all variables in abstraction are private, we don't know the actual value of variables.
		// Here we can see the result of operations perform on variables. not variables value.
		// so, CODE SECURITY is achieved by abstraction.
		
		
		// BUT by using "getter" & "setter" method, we can get the value of particular variable and
		//we can set value to particular variable respectively.
				
	}

}
