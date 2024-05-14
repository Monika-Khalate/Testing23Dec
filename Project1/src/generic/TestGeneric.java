package generic;

public class TestGeneric {
	
	public static void main(String[] args) {
		
		
	System.out.println(DemoGeneric.b);	
	
	DemoGeneric x = new DemoGeneric();
	x.a = 45;
	x.c = 45;
	x.c = '&';
	System.out.println(x.a);
	x.test(x);
	
	DemoGeneric<Integer, String> y = new DemoGeneric<Integer, String>();
	y.a = 78;
	y.c = 67;
	y.d = "abcd";
	String v = y.test(67);
	
	
	
	DemoGeneric<Character,Integer> z = new DemoGeneric<Character,Integer>();
	z.a = 56;
	z.c = '$';
	z.d = 67;
	int f = z.test('&');
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
