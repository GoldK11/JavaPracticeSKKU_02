package test;

public class Abc {
	
	static int k=5;
	
	
	public void m() {
		System.out.println("m");
	}
	
	public static void m2() {
		System.out.println("m2");
	}
	
	//�� ����ƽ ���� Ŭ������ �޸𸮿� �ε��� �� ���� ���� ����ȴ�
	static {
		System.out.println("I'm static block: "+k);
		Abc a = new Abc();
		a.m();
		a.m2();
		a.m();
	}

}
