package kr.jaen.java.custom;
class MyExcept extends Exception
{                               
	MyExcept(){
		super("사용자가 만든  Exception class");
	}
	void myMethod(){
		System.out.println("Exception 처리 문들...");
	}
}
