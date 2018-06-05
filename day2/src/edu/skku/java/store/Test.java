package edu.skku.java.store;

public class Test {

	public static void main(String[] args) {
		Shirt s1= new Shirt();
		Shirt s2 = new Shirt(1102,90,"white,babypink",36000,7);
		
		s1.setNum(1101);
		s1.setSize(85);
		s1.setColor("black,gold");
		s1.setPrice(48000);
		s1.setQuant(4);
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
