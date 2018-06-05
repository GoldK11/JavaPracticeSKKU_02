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
	public String toString() {  // 옛날에 만든 Object내의 toString()을 오버라이딩하기 때문에 리턴타입은 String이다
		StringBuilder builder = new StringBuilder();
		builder.append("Account [num=");
		builder.append(num);
		builder.append(", pw=");
		builder.append(pw);
		builder.append(", balance=");
		builder.append(balance);
		builder.append("]");
		return builder.toString(); //builder 내에서 오버라이딩 한 toString 메서드를 통해 StringBuilder타입을 Stirng 타입으로 바꿔줌
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
