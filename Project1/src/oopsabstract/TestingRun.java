package oopsabstract;

public class TestingRun {
	public static void main(String[] args) {
		
		TestingSuper.test();
		
		TestingSub2 y=new TestingSub2();
		y.set();
		y.get();
		y.payment();
		y.recharge();
		
		
		}

}
