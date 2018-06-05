package edu.skku.java.bank;

public class BankManager implements IBankMgr {
	Account[] as= new Account[50];
	int index=0;

	
	/* (non-Javadoc)
	 * @see edu.skku.java.bank.IBankMgr#add(edu.skku.java.bank.Account)
	 */
	@Override
	public void add(Account a) {
		as[index]=a;
		index++;
		// as[index++]=a;
	}
	
	/* (non-Javadoc)
	 * @see edu.skku.java.bank.IBankMgr#search()
	 */
	@Override
	public void search() {
		for(int i=0;i<index;i++) System.out.println(as[i]);
	}
	
	/* (non-Javadoc)
	 * @see edu.skku.java.bank.IBankMgr#searchNum(java.lang.String)
	 */
	@Override
	public Account searchNum(String num) {
		for(int i=0;i<index;i++) {
			if(as[i].getNum().equals(num)) {
				return as[i];
			}
		}return  null;
		 
	}
	
	/* (non-Javadoc)
	 * @see edu.skku.java.bank.IBankMgr#searchMA()
	 */
	@Override
	public void searchMA() {
		for(int i=0;i<index;i++) {
			if(as[i] instanceof MinusAccount)System.out.println(as[i]);
		}
	}
	
	/* (non-Javadoc)
	 * @see edu.skku.java.bank.IBankMgr#getTotaal()
	 */
	@Override
	public int getTotaal() {
		int total =0;
		for(int i=0;i<index;i++) total+=as[i].getBalance();
		return total;
	}
	
	/* (non-Javadoc)
	 * @see edu.skku.java.bank.IBankMgr#deposit(java.lang.String, int)
	 */
	@Override
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
	
	/* (non-Javadoc)
	 * @see edu.skku.java.bank.IBankMgr#withdraw(java.lang.String, int, int)
	 */
	@Override
	public void withdraw(String num,int pw, int money) {
		Account a = searchNum(num);
		if(a==null) {
			System.out.println("���� ������ �����ϴ�");
			return; 
		}else {
			a.withdraw(pw, money);
		}		
	}
	
	/* (non-Javadoc)
	 * @see edu.skku.java.bank.IBankMgr#trans(java.lang.String, int, int, java.lang.String)
	 */
	@Override
	public void trans(String num, int pw,int money, String num2) {
		withdraw(num,pw,money);
		deposit(num2,money);
		//���������� withdraw�� �������� ��츦 ó������ ���Ѵ٤�
		//���߿� ����ó�� �����ϸ� �����غ���
	}

}
