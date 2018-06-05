package edu.skku.java.bank;

public interface IBankMgr {

	void add(Account a);

	void search();

	Account searchNum(String num);

	void searchMA();

	int getTotaal();

	void deposit(String num, int money);

	void withdraw(String num, int pw, int money);

	void trans(String num, int pw, int money, String num2);

}