package edu.skku.lang;

public class WrapperTest {

	public static void main(String[] args) {
		String a = "123";
		System.out.println(a);
		
		int i = Integer.parseInt(a);
		System.out.println(i+3);
		
		String aa=i+"";
		System.out.println(aa);
		
		Integer n = 40;
		//Integer n = new Integer(40);
		System.out.println(n);
		int n2 = n+50;
		//n�� ��ü�ϱ� ���� ���ϱ� �ȵǴµ� �����Ϸ��� �ڵ����� ��ڽ����ش�
		System.out.println(n2);

		Double d = 3.45;
		//Double d = new Double(3.45);
		double d2 = d+1.4;
		//d.doubleValue()+1.4;
		System.out.println(d2);
	}

}
