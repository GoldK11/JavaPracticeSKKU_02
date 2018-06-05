package edu.skku.java.cms;

public class Car {
	private String num;
	private int price; // int�� 21����� ����ϴ°� ���� ����
	
	public void start() {
		System.out.println("���!");
	}
	public void stop() {
		System.out.println("����!");
	}	
	
	public Car() {
	}	
	public Car(String num, int price) {
		setNum(num);
		setPrice(price); // this.num = num ���� set �޼��� ���°� �� ���� , set�޼��忡 üũ �ڵ� �߰� �� �� �ִ�
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
