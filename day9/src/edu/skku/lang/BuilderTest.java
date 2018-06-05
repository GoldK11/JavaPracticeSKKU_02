package edu.skku.lang;

public class BuilderTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("HelloWorld"); // 얘는 new 없이 쓸 수 없다
		
		sb.append("d"); // 얘는 +로 더할 수 없다, append 메서드 쓰자 
		
		System.out.println(sb.length());
		
		sb.setLength(7); //글자 자르기! 
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
	}
}
