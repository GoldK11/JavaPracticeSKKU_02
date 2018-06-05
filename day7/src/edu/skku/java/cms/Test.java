package edu.skku.java.cms;

public class Test {

	public static void main(String[] args) {
		Car c = new Car();
		Car c1 = new Car("11가 4772",3000);
		Bus c2 = new Bus("12너 3493",8000,20);
		Truck c3 = new Truck("32하 4554",9000,"파란트럭",3);

		//Polymorphism
		Car c4 = new Bus("21바 3540",4600,23);
		Car c5 = new Truck("65파 0999",3900,"노란트럭",4);
		
		
		c.start();
		c1.start();
		c2.start(); // c2는 Bus 타입 이므로 Bus의 start를 돌린다
		c3.start();
		
		c4.start(); // c4는 Car 타입이지만 Bus의 start를 돌린다
		c5.start(); // Truck은 start를 오버라이딩 하지 않았으므로 Car의 start를 돌린다
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}

}
