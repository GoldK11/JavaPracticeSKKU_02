package edu.skku.lang;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student(2015,"Kim");
		Student s2 = new Student(2015,"Kim");
		
		System.out.println(s1);
		//System.out.println(s.toString());
		
		if(s1==s2) System.out.println("s1==s2");
		
		if(s1.equals(s2)) System.out.println("s1.equalse(s2)");
		//Student Ŭ���� ������ equals�� �������̵� ���� �ʾҴٸ� false�� ����
		
		if(s1.name.equals(s2.name)) System.out.println("s1.name.equals(s2.name)");

	}

}
