package edu.skku.java.cms;

public class Bus extends Car { //Ŭ���� ���� �� superclass �κп� ��ӹ��� Ŭ���� �̸� ���� �ȴ�
	
	private int seats;
	
	//method overriding
	public void start() {
		System.out.println("���� ���!");
	}	
	
	public Bus() {
		super(); // ��ӹ��� ���� Ŭ������ ������(�⺻ ������)ȣ��
	}
	
	public Bus(String num, int price, int seats) {
		super(num, price); //��ӹ��� ���� Ŭ������ ������(�ι� ° ������) ȣ��
		setSeats(seats);
	}


	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "Bus [getNum()=" + getNum() + ", getPrice()=" + getPrice() + ", seats=" + seats + "]";
	}
	
	
	
}
