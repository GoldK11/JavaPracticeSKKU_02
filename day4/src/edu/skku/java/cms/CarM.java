package edu.skku.java.cms;

public class CarM {
	
	Car[] cars = new Car[100];
	int index = 0;
	
	public void add(Car c) {
		cars[index]=c;
		index++;
	}
	
	public void print(Car c) {
		System.out.println(c); //c.toString()을 찍는다
		
	}
	public void print() {
		for(int i=0; i<index;i++ )System.out.println(i+" "+cars[i]);
	}
	
	// 너 버스니? 
	// A instanceof B >> A가 B의 인스턴스(오브젝트)니? == A야 너 메모리에 B 있니?
	// B는 sub가 와야지 super가 오면 죄다 True가 된다
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
