package test;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		/*
		Abc a = new Abc();
		a.m();

		Abc a2 = new Abc();
		
		Abc.m2();
		a.m2(); // static�̾ new �ϰ� �ҷ��� �ȴ�.
		
		System.out.println(Abc.k);
		
		Abc.k = 15;
		System.out.println(Abc.k);
		System.out.println(a.k);
		
		a2.k = 40;
		System.out.println(Abc.k); 
		System.out.println(a.k);
		//a2�� k�� �ٲ�µ� a�� k�� �ٲ����
		*/
		
		//��ȣ �ȿ� �ִ� �ָ� �޸𸮿� �о�Ͷ� 
		Class.forName("test.Abc");
		
		System.out.println(Math.round(25.46));
		// Math�� staticŬ������  Math m = new Math()�̷������� ���� ������ �ʾƵ� ��� ����
		
		
	}

}
