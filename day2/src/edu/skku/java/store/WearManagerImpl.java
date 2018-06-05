package edu.skku.java.store;

public class WearManagerImpl {
	
	Shirt [] wears = new Shirt[100];
	int index = 0;
	
	public void add(Shirt s) {
		wears[index] = s;
		index++;
	}
	
	public void allList() {
		System.out.println();
		System.out.println("------all wears------");
		for(int i=0;i<index;i++) {
			System.out.println(wears[i]);
		}
	}
		
	public void searchColor(String color) {
		System.out.println();
		System.out.println("------search by Color:"+color+"------");
		for(int i=0;i<index;i++) {
			if (wears[i].getColor().contains(color)) { //String타입의 포함 확인 메서드
				//같은지 확인은 == 이 아니라 .equals 쓴다
				System.out.println(wears[i]);
			}
		}
	}
	
	public void searchPrice(int price) {
		System.out.println();
		System.out.println("------search by Price:"+price+"------");
		for(int i=0;i<index;i++) {
			if(wears[i].getPrice()<=price) System.out.println(wears[i]);
		}

	}
	
	//상품 번호를 파라메터로 받으면 셔츠 정보를 찾아 리턴
	public Shirt searchNum(int num) {
		for(int i=0;i<index;i++) {
			if(wears[i].getNum()==num) return wears[i];
		}
		return null;
	}
	
	public void buy(Shirt s) {
		System.out.println("------buy------");
		Shirt sh = searchNum(s.getNum());
		if(sh==null){ //존재하지 않음 > add로 추가하자
			add(s);	
		}else { // 이미 존재하는 상품 >> quant값 증가
			sh.setQuant(sh.getQuant()+s.getQuant()); // 원래 수량+새로 구입한 수량
		}
			
	}

	public void sell(int num,int quant) {
		System.out.println("------sell------");
		Shirt sh = searchNum(num);
		if(sh==null){ //존재하지 않음 > 못팔어
			System.out.println("없는 제품입니다");;	
		}else if(sh.getQuant()<quant){ // 재고 부족
			System.out.println("재고가 부족합니다");
		}else {
			sh.setQuant(sh.getQuant()-quant); // 판매 성공! 원래 수량-새로 구입한 수량
		}
			
	}	
	
	//총 몇 종류의 상품이 있는지
	public int size() {
		return index;
	}
	
	
	//총 재고 금액
	
	public int totalPrice() {
		int total =0;
		for(int i=0;i<index;i++) {
			total += wears[i].getPrice()*wears[i].getQuant();
		}
		return total;
	}

}
