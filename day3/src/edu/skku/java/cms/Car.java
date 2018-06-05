package edu.skku.java.cms;

public class Car {
	private String num;
	private int price; // int는 21억까지 기억하는거 잊지 말자
	
	public void start() {
		System.out.println("출발!");
	}
	public void stop() {
		System.out.println("멈춤!");
	}	
	
	public Car() {
	}	
	public Car(String num, int price) {
		setNum(num);
		setPrice(price); // this.num = num 보다 set 메서드 쓰는게 더 좋다 , set메서드에 체크 코드 추가 할 수 있다
	}
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [num=" + num + ", price=" + price + "]";
	}
	
	
	
	
}
