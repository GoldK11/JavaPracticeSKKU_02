package edu.skku.java.cms;

public class CarM {
	
	Car[] cars = new Car[100];
	int index = 0;
	
	public void add(Car c) {
		cars[index]=c;
		index++;
	}
	
	public void print(Car c) {
		System.out.println(c); //c.toString()�� ��´�
		
	}
	public void print() {
		for(int i=0; i<index;i++ )System.out.println(i+" "+cars[i]);
	}
	
	// �� ������? 
	// A instanceof B >> A�� B�� �ν��Ͻ�(������Ʈ)��? == A�� �� �޸𸮿� B �ִ�?
	// B�� sub�� �;��� super�� ���� �˴� True�� �ȴ�
	public void busList() {
		for(int i=0; i<index; i++) {
			if(cars[i] instanceof Bus) System.out.println(i+" "+cars[i]);
		}
	}
	
	public void notBusList() {
		for(int i=0; i<index; i++) {
			if(!(cars[i] instanceof Bus)) System.out.println(i+" "+cars[i]);
		}
	}	
	
	public void truckList() {
		for(int i=0; i<index; i++) {
			if(cars[i] instanceof Truck) System.out.println(i+" "+cars[i]);
		}
	}
}
