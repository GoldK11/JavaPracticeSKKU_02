package edu.skku.java.store;

//한줄복사 : ctrl + alt + 방향키
//이동: alt + 방향키

public class Test3 {

	public static void main(String[] args) {
		WearManagerImpl mgr = new WearManagerImpl();
		
		mgr.add(new Shirt(1003,95,"red,gold",21000,21));
		mgr.add(new Shirt(1004,100,"black,white",52000,11));
		mgr.add(new Shirt(1005,90,"red,white,blue",12000,4));
		mgr.add(new Shirt(1006,85,"blue,white",23000,25));
		
		mgr.allList();

		mgr.searchColor("red");
		
		mgr.searchPrice(30000);
		
		mgr.buy(new Shirt(1005,90,"red,white,blue",12000,12));
		mgr.buy(new Shirt(1007,90,"red,white",20000,29));
		
		mgr.allList();
		
		mgr.sell(1002, 4);
		mgr.sell(1004, 12);
		mgr.sell(1006, 8);
		
		mgr.allList();
		
		System.out.println("재고 개수:"+mgr.size());
		System.out.println("total price:"+mgr.totalPrice());
		

	}

}
