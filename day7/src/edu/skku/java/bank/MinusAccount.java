package edu.skku.java.bank;

public class MinusAccount extends Account {
	private int limit;

	//withd까지만 치고 ctrl +space 눌러도 자동 완성 해준다	
	@Override
	public void withdraw(int pw, int money) {
		super.withdraw(pw, money);
		if(checkPW(pw)) {
			if (getBalance()+limit>=money) {
				setBalance(getBalance() - money);
				System.out.println("정상 출금 되었습니다.");
				System.out.println("현재 잔액은"+getBalance()+"원 입니다.");
			}else System.out.println("한도가 부족합니다.");
		}else System.out.println("비밀번호가 틀렸습니다.");
		
	}

	public MinusAccount() {
		super();
	}

	public MinusAccount(String num, int pw, long balance, int limit) {
		super(num, pw, balance);
		setLimit(limit);
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	@Override
	public String toString() {
		return "MinusAccount [ getNum()=" + getNum() + ", getBalance()=" + getBalance() + ", limit=" + getLimit() +"]";
	}
	
	

}
