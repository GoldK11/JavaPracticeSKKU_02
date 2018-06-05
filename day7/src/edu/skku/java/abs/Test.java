package edu.skku.java.abs;

public class Test {

	public static void main(String[] args) {
		Car c =new Bus();
		//Car는 abstract 클래스니까 new Car는 못하지만 type으로 올 수는 있다.
		c.start();
		c.stop();

	}

}
