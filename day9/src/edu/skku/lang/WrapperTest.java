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
		//n은 객체니까 원래 더하기 안되는데 컴파일러가 자동으로 언박싱해준다
		System.out.println(n2);

		Double d = 3.45;
		//Double d = new Double(3.45);
		double d2 = d+1.4;
		//d.doubleValue()+1.4;
		System.out.println(d2);
	}

}
