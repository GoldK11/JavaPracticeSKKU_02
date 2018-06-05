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
			if (wears[i].getColor().contains(color)) { //StringŸ���� ���� Ȯ�� �޼���
				//������ Ȯ���� == �� �ƴ϶� .equals ����
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
	
	//��ǰ ��ȣ�� �Ķ���ͷ� ������ ���� ������ ã�� ����
	public Shirt searchNum(int num) {
		for(int i=0;i<index;i++) {
			if(wears[i].getNum()==num) return wears[i];
		}
		return null;
	}
	
	public void buy(Shirt s) {
		System.out.println("------buy------");
		Shirt sh = searchNum(s.getNum());
		if(sh==null){ //�������� ���� > add�� �߰�����
			add(s);	
		}else { // �̹� �����ϴ� ��ǰ >> quant�� ����
			sh.setQuant(sh.getQuant()+s.getQuant()); // ���� ����+���� ������ ����
		}
			
	}

	public void sell(int num,int quant) {
		System.out.println("------sell------");
		Shirt sh = searchNum(num);
		if(sh==null){ //�������� ���� > ���Ⱦ�
			System.out.println("���� ��ǰ�Դϴ�");;	
		}else if(sh.getQuant()<quant){ // ��� ����
			System.out.println("��� �����մϴ�");
		}else {
			sh.setQuant(sh.getQuant()-quant); // �Ǹ� ����! ���� ����-���� ������ ����
		}
			
	}	
	
	//�� �� ������ ��ǰ�� �ִ���
	public int size() {
		return index;
	}
	
	
	//�� ��� �ݾ�
	
	public int totalPrice() {
		int total =0;
		for(int i=0;i<index;i++) {
			total += wears[i].getPrice()*wears[i].getQuant();
		}
		return total;
	}

}
