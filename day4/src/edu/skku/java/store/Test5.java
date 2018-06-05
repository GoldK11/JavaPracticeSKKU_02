package edu.skku.java.store;

public class Test5 {

	public static void main(String[] args) {
		
		StoreM mgr = new StoreM();
		
		Shirt s1 = new Shirt(1102,90,"white,babypink",36000,7);
		Shirt s2 = new Shirt(1103,90,"black,white",45000,22);
		Shirt s3 = new Pants(88,26,"blue",68000,3,7);
		Shirt s4 = new Pants(89,28,"Yello,white",24000,11,9);
		Shirt s5 = new Shirt(1104,85,"Red",23000,5);
		
		mgr.add(s1);
		mgr.add(s2);
		mgr.add(s3);
		mgr.add(s4);
		mgr.add(s5);

		System.out.println();
		System.out.println("------ALL PRODUCT-----");
		mgr.print();

		System.out.println();
		System.out.println("------ONLY SHIRT------");
		mgr.shirtList();

		System.out.println();
		System.out.println("------ONLY PANTS------");
		mgr.pantsList();
	
	
	}
}
