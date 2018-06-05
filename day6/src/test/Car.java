package test;

public abstract class Car {
	String num;
	int price;
	
	public abstract void start();
	//public void start(){} 얘는 {}가 비었어도 미완성 아니다! 구현 된것
	
	public void stop() {
		System.out.println("~~~~~stop~~~");
	}
	
}
