package edu.skku.java.bank;

public class Account {
	private String num;
	private int pw;
	private long balance;
	
	public Account() {
	}

	public Account(String num, int pw, long balance) {
		setNum(num);
		setBalance(balance);
		setPw(pw);
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	private int getPw() { //��й�ȣ�ϱ� ���� ���ϰ�!!
		return pw;
	}

	public void setPw(int pw) {
		this.pw = pw;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [num=" + num + ", balance=" + balance + "]";
	}
	
	
	public void deposit(int money) {
		balance+=money;
	}
	
	public boolean checkPW(int pw) {
		//pw�� ���ڿ��̾��ٸ�? this.pw.equals(pw);�� ��� ��
		return this.pw ==pw;
	}
	
	public void withdraw(int pw,int money) {
		if(checkPW(pw)) {
			if (balance>=money) {
				balance-=money;
				System.out.println("���� ��� �Ǿ����ϴ�.");
				System.out.println("���� �ܾ���"+balance+"�� �Դϴ�.");
			}else System.out.println("�ܾ��� �����մϴ�.");
		}else System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		
	}
}
