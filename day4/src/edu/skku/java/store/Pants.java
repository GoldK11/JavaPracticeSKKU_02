package edu.skku.java.store;

public class Pants extends Shirt {
	private int len;

	
	public Pants() {
	}

	public Pants(int num, int size, String color, int price, int quant, int len) {
		super(num, size, color, price, quant);
		setLen(len);
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	@Override
	public String toString() {
		return "Pants [Num=" + getNum() + ", Size=" + getSize() + ", Color=" + getColor()
				+ ", Price=" + getPrice() + ", Quant=" + getQuant() + ", len=" + len + "]";
	}
	//return super.toSting() + " ,len= " + len;

	
	
	

}
