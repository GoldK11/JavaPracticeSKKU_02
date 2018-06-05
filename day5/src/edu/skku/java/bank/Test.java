package edu.skku.java.bank;

public class Test {

	public static void main(String[] args) {
		
		Account a = new Account("12-34",6778,90);
		MinusAccount ma = new MinusAccount("23-45", 9032, 30, 100);			
		
		BankManager mgr = new BankManager();
		mgr.add(a);
		mgr.add(ma);
		mgr.add(new Account("111-223",1234,60));
		mgr.add(new MinusAccount("163-92",0672,70,50));
		
		System.out.println("--------all search--------");
		mgr.search();
		System.out.println("--------MinusA search--------");
		mgr.searchMA();		
		System.out.println("--------number search-----");
		System.out.println("111-223°Ë»ö: "+mgr.searchNum("111-223"));
		System.out.println("--------get total----------");
		System.out.println(mgr.getTotaal());
		System.out.println("---------mgr deposit-------");
		mgr.deposit("12-34", 80);
		mgr.deposit("234-221",90);
		System.out.println("--------all search--------");
		mgr.search();		
		System.out.println("-----------withdraw--------");
		mgr.withdraw("111-223", 1243, 80);
		System.out.println("-----------withdraw--------");		
		mgr.withdraw("23-45", 9032, 50);
		System.out.println("--------all search--------");
		mgr.search();	
		
		
		
		
	}

}
