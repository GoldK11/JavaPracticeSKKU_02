package test;

public abstract class Car {
	String num;
	int price;
	
	public abstract void start();
	//public void start(){} ��� {}�� ���� �̿ϼ� �ƴϴ�! ���� �Ȱ�
	
	public void stop() {
		System.out.println("~~~~~stop~~~");
	}
	
}
