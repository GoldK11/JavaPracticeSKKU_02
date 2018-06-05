package edu.skku.lang;

public class StringTest {

	public static void main(String[] args) {
		String s = new String("Hello World"); //원래 이게 정석
		
		String s2 = "abc";
		
		s2=s2+"d"; 
		
		System.out.println(s.length());

		System.out.println(s.substring(6, 11)); // 부분문자열 발췌
		System.out.println(s.substring(6, 10)); // 마지막 인덱스 바로앞까지 나옴
		System.out.println(s.substring(3)); // 시작 인덱스만 넣는 경우 마지막까지 나옴

		System.out.println(s.charAt(8)); // 리턴타입은 Char 

		System.out.println(s.indexOf("W")); //문자열의 위치 알려줌
		System.out.println(s.indexOf("Wor"));		
		System.out.println(s.indexOf("Wol")); // 에러 안나고 -1나옴
		//대부분의 프로그램은 찾아오라 시켰는데 못 찾을 경우 -1을 준다
		
		System.out.println(s.startsWith("Hello")); //boolean값 도출
		System.out.println(s.endsWith("w"));

	}

}
