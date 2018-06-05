package edu.skku.java.bank;

public class BankManager {
	Account[] as= new Account[50];
	int index=0;

	
	public void add(Account a) {
		as[index]=a;
		index++;
		// as[index++]=a;
	}
	
	public void search() {
		for(int i=0;i<index;i++) System.out.println(as[i]);
	}
	
	public Account searchNum(String num) {
		for(int i=0;i<index;i++) {
			if(as[i].getNum().equals(num)) {
				return as[i];
			}
		}return  null;
		 
	}
	
	public void searchMA() {
		for(int i=0;i<index;i++) {
			if(as[i] instanceof MinusAccount)System.out.println(as[i]);
		}
	}
	
	public int getTotaal() {
		int total =0;
		for(int i=0;i<index;i++) total+=as[i].getBalance();
		return total;
	}
	
	public void deposit(String num,int money) {
		Account a = searchNum(num);
		if(a==null) {
			System.out.println("���� ������ �����ϴ�");
			return; //return���� ������ void������ �� �� �ִ�
		}else {
			a.deposit(money); //Account�� �̹� �Ա�ó�� ������ �ٽ� �� �ʿ� ����!!!
			System.out.println(money+"�� �ԱݵǾ����ϴ�");
		}
	}
	
	public void withdraw(String num,int pw, int money) {
		Account a = searchNum(num);
		if(a==null) {
			System.out.println("���� ������ �����ϴ�");
			return; 
		}else {
			a.withdraw(pw, money);
		}		
	}
	
	public void trans(String num, int pw,int money, String num2) {
		withdraw(num,pw,money);
		deposit(num2,money);
		//���������� withdraw�� �������� ��츦 ó������ ���Ѵ٤�
		//���߿� ����ó�� �����ϸ� �����غ���
	}

}
