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

	private int getPw() { //비밀번호니까 접근 못하게!!
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
		//pw가 문자열이었다면? this.pw.equals(pw);로 써야 함
		return this.pw ==pw;
	}
	
	public void withdraw(int pw,int money) {
		if(checkPW(pw)) {
			if (balance>=money) {
				balance-=money;
				System.out.println("정상 출금 되었습니다.");
				System.out.println("현재 잔액은"+balance+"원 입니다.");
			}else System.out.println("잔액이 부족합니다.");
		}else System.out.println("비밀번호가 틀렸습니다.");
		
	}
}
