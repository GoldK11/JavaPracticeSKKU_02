package edu.skku.java.inter;

public interface Car {
	final int COUNT=100;
	int k =5;
	//컴파일 할 때 public static final int k = 5; 로 자동 변환된다
	
	public abstract void start();
	void stop(); 
	//컴파일 할 때 public abstract void stop(); 으로 자동 변환된다
	//class는 디폴트가 구현된 상태이기 때문애 abstract을 명시해주어야 하지만
	//interface는 굳이 abstract을 안붙여도 알아서 abstract을 붙여준다
	

}
