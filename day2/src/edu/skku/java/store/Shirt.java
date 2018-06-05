package edu.skku.java.store;

public class Shirt {
	
	// data
	private int num;
	private int size;
	private String color;
	private int price;
	private int quant;
	
	// constructor
	public Shirt() { //default (기본생성자)
	}

	public Shirt(int num, int size, String color, int price, int quant) {
		// super(); >> 요건 컴파일러가 알아서 만들어주니까 있어도 되구 없어도 되구
		this.num = num;
		this.size = size;
		this.color = color;
		this.price = price;
		this.quant = quant;
	}

	// get&set
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	//toString
	@Override
	public String toString() {
		return "Shirt [num=" + num + ", size=" + size + ", color=" + color + ", price=" + price + ", quant=" + quant
				+ "]";
	}
	
	
	
	

}
