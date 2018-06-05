package edu.skku.java.inter;

public class Bus implements Car { 
				//인터페이스의 상속은 implements로 받는다

	@Override
	public void start() {
		System.out.println("버스출발");
	}

	@Override
	public void stop() {
		System.out.println("버스멈춤");
	}

}
