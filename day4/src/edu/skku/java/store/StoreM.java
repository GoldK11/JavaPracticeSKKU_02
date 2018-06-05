package edu.skku.java.store;

public class StoreM {
	Shirt[] wears = new Shirt[30];
	int index=0;
	
	public void add(Shirt s) {
		wears[index] = s;
		index++;
	}
	
	public void print() {
		for(int i=0;i<index;i++) System.out.println(i+" "+wears[i]);
	}
	
	public void pantsList() {
		for(int i=0;i<index;i++) {
			if(wears[i] instanceof Pants) System.out.println(i+" "+wears[i]);
		}
	}
	
	
	public void shirtList() {
		for(int i=0;i<index;i++) {
			if(!(wears[i] instanceof Pants)) System.out.println(i+" "+wears[i]);
		}
	}
}
