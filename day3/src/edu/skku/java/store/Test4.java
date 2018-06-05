package edu.skku.java.store;

public class Test4 {

	public static void main(String[] args) {
		Shirt s1 = new Shirt();
		Shirt s2 = new Shirt(2,90,"black,white",45000,22);
		Pants p1 = new Pants();
		Pants p2 = new Pants(4,26,"blue",68000,3,7);
		WearManagerImpl mgr = new WearManagerImpl();
		
		s1.setNum(1);
		s1.setSize(85);
		s1.setColor("yello");
		s1.setQuant(10);
		s1.setPrice(12000);

		p1.setNum(3);
		p1.setSize(28);
		p1.setColor("black");
		p1.setQuant(4);
		p1.setPrice(34000);
		p1.setLen(9);
		
		mgr.add(s1);
		mgr.add(s2);
		mgr.add(p1);
		mgr.add(p2);

		System.out.println(p1);
		
		mgr.buy(p1,2);
	
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(p1);
		System.out.println(p2);
 
	}

}
