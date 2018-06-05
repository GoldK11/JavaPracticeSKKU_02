package test;

public class StaticTest {
	
	static int count;
	static void setcount(int k ) {
		count = k;
		System.out.println("setCount(): "+count);
	}
	static {
		System.out.println("I'm static block: "+count);
	}
	{
		System.out.println("I'm instance block: "+count);
	}

	public static void main(String[] args) {
		System.out.println("Main start");
		StaticTest.setcount(3);
		StaticTest s = new StaticTest();
		System.out.println("Main,,,");
		StaticTest.count++;
		StaticTest s2 = new StaticTest();

	}

}
