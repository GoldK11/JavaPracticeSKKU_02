package edu.skku.java.inter;

public interface Car {
	final int COUNT=100;
	int k =5;
	//������ �� �� public static final int k = 5; �� �ڵ� ��ȯ�ȴ�
	
	public abstract void start();
	void stop(); 
	//������ �� �� public abstract void stop(); ���� �ڵ� ��ȯ�ȴ�
	//class�� ����Ʈ�� ������ �����̱� ������ abstract�� ������־�� ������
	//interface�� ���� abstract�� �Ⱥٿ��� �˾Ƽ� abstract�� �ٿ��ش�
	

}
