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
			System.out.println("계좌 정보가 없습니다");
			return; //return값이 없으니 void에서도 쓸 수 있다
		}else {
			a.deposit(money); //Account에 이미 입금처리 있으니 다시 쓸 필요 없당!!!
			System.out.println(money+"원 입금되었습니다");
		}
	}
	
	public void withdraw(String num,int pw, int money) {
		Account a = searchNum(num);
		if(a==null) {
			System.out.println("계좌 정보가 없습니다");
			return; 
		}else {
			a.withdraw(pw, money);
		}		
	}
	
	public void trans(String num, int pw,int money, String num2) {
		withdraw(num,pw,money);
		deposit(num2,money);
		//아직까지는 withdraw를 실패했을 경우를 처리하지 못한다ㅣ
		//나중에 예외처리 공부하면 보안해보자
	}

}
