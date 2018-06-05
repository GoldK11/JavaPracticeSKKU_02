package edu.skku.java.cms;

public class Test {

	public static void main(String[] args) {
		Car c = new Car();
		Car c1 = new Car("11가 4772",3000);
		Bus c2 = new Bus("12너 3493",8000,20);
		Truck c3 = new Truck("32하 4554",9000,"파란트럭",3);
		
		c.start();
		c1.start();
		c2.start();
		c3.start();
		
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}

}
