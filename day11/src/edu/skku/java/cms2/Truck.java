package edu.skku.java.cms2;

public class Truck extends Car {
	
	private String model;
	private double ton;
	
	public Truck() {
		super();
	}

	public Truck(String num, int price, String model, double ton) {
		super(num, price);
		setModel(model);
		setTon(ton);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getTon() {
		return ton;
	}

	public void setTon(double ton) {
		this.ton = ton;
	}

	@Override
	public String toString() {
		return "Truck [getNum()=" + getNum() + ", getPrice()=" + getPrice() + ", model=" + model + ", ton=" + ton + "]";
	}
	
	
	

}
