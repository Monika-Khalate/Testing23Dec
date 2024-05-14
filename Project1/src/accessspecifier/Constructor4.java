package accessspecifier;

import accessmodifiers.Constructor1;

public class Constructor4 extends Constructor1{
	
	public static void main(String[] args) {
		
		// outside package with inheritance
		
		Constructor4 cons = new Constructor4();
		
		new Constructor1();       // public
	//	new Constructor1(24);
	//	new Constructor1(29, 'h');
	//	new Constructor1(true);       constructor can not be inherited.   
		
	}

}
