package test;

public class Abc {
	
	static int k=5;
	
	
	public void m() {
		System.out.println("m");
	}
	
	public static void m2() {
		System.out.println("m2");
	}
	
	//이 스태틱 블럭은 클래스가 메모리에 로딩될 때 제일 먼저 실행된다
	static {
		System.out.println("I'm static block: "+k);
		Abc a = new Abc();
		a.m();
		a.m2();
		a.m();
	}

}
