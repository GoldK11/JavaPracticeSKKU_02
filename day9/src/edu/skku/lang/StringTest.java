package edu.skku.lang;

public class StringTest {

	public static void main(String[] args) {
		String s = new String("Hello World"); //���� �̰� ����
		
		String s2 = "abc";
		
		s2=s2+"d"; 
		
		System.out.println(s.length());

		System.out.println(s.substring(6, 11)); // �κй��ڿ� ����
		System.out.println(s.substring(6, 10)); // ������ �ε��� �ٷξձ��� ����
		System.out.println(s.substring(3)); // ���� �ε����� �ִ� ��� ���������� ����

		System.out.println(s.charAt(8)); // ����Ÿ���� Char 

		System.out.println(s.indexOf("W")); //���ڿ��� ��ġ �˷���
		System.out.println(s.indexOf("Wor"));		
		System.out.println(s.indexOf("Wol")); // ���� �ȳ��� -1����
		//��κ��� ���α׷��� ã�ƿ��� ���״µ� �� ã�� ��� -1�� �ش�
		
		System.out.println(s.startsWith("Hello")); //boolean�� ����
		System.out.println(s.endsWith("w"));

	}

}
