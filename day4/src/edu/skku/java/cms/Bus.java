package edu.skku.java.cms;

public class Bus extends Car { //클래스 만들 때 superclass 부분에 상속받을 클래스 이름 쓰면 된다
	
	private int seats;
	
	//method overriding
	public void start() {
		System.out.println("버스 출발!");
	}	
	
	public Bus() {
		super(); // 상속받은 상위 클래스의 생성자(기본 생성자)호출
	}
	
	public Bus(String num, int price, int seats) {
		super(num, price); //상속받은 상위 클래스의 생성자(두번 째 생성자) 호출
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
