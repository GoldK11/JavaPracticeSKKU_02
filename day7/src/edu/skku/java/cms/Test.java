package edu.skku.java.cms;

public class Test {

	public static void main(String[] args) {
		Car c = new Car();
		Car c1 = new Car("11�� 4772",3000);
		Bus c2 = new Bus("12�� 3493",8000,20);
		Truck c3 = new Truck("32�� 4554",9000,"�Ķ�Ʈ��",3);

		//Polymorphism
		Car c4 = new Bus("21�� 3540",4600,23);
		Car c5 = new Truck("65�� 0999",3900,"���Ʈ��",4);
		
		
		c.start();
		c1.start();
		c2.start(); // c2�� Bus Ÿ�� �̹Ƿ� Bus�� start�� ������
		c3.start();
		
		c4.start(); // c4�� Car Ÿ�������� Bus�� start�� ������
		c5.start(); // Truck�� start�� �������̵� ���� �ʾ����Ƿ� Car�� start�� ������
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}

}
