package edu.skku.java.bank;

public class MinusAccount extends Account {
	private int limit;

	//withd������ ġ�� ctrl +space ������ �ڵ� �ϼ� ���ش�	
	@Override
	public void withdraw(int pw, int money) {
		super.withdraw(pw, money);
		if(checkPW(pw)) {
			if (getBalance()+limit>=money) {
				setBalance(getBalance() - money);
				System.out.println("���� ��� �Ǿ����ϴ�.");
				System.out.println("���� �ܾ���"+getBalance()+"�� �Դϴ�.");
			}else System.out.println("�ѵ��� �����մϴ�.");
		}else System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		
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
