package kr.jaen.java.custom;
class ValueExcept extends Exception
{                               
	ValueExcept(){
		super("ValueException:같은 값을 가질 수 없습니다.");
	}
	void myMethod(){
		System.out.println("Exception 처리 문들...");
	}
}
