package edu.skku.lang;

public class BuilderTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("HelloWorld"); // ��� new ���� �� �� ����
		
		sb.append("d"); // ��� +�� ���� �� ����, append �޼��� ���� 
		
		System.out.println(sb.length());
		
		sb.setLength(7); //���� �ڸ���! 
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
	}
}
