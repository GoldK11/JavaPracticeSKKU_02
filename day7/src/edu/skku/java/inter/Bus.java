package edu.skku.java.inter;

public class Bus implements Car { 
				//�������̽��� ����� implements�� �޴´�

	@Override
	public void start() {
		System.out.println("�������");
	}

	@Override
	public void stop() {
		System.out.println("��������");
	}

}
