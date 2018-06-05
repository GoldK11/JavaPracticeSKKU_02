package edu.skku.thread;

public class ThreadTest {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		System.out.println("~Main~1");
		Thread t = new MyThread();
		//t.run();�̰� �ȵ�! �̰� �˹ٻ��� �� ���� ���� �ϰڴٴ� ��
		t.start(); // �̰� �˹ٻ������� �� ��Ű�� �� �� ���� �ϰڴٴ� ��(cpu�����췯�� ���)
		System.out.println("~Main~2");
		System.out.println("~Main~3");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("~Main~4");
		System.out.println("~Main~5");
	}
}

class MyThread extends Thread{
	public void run() { // �˹ٻ��� �� ���� �˷��ִ� �۾�, �������̵�!
		System.out.println(Thread.currentThread().getName());
		System.out.println("~�˹ٻ�~");
	}
	
}