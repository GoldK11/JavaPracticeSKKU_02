package edu.skku.thread;

public class ThreadTest {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		System.out.println("~Main~1");
		Thread t = new MyThread();
		//t.run();이거 안돼! 이건 알바생이 할 일을 내가 하겠다는 뜻
		t.start(); // 이게 알바생이한테 일 시키고 난 내 일을 하겠다는 뜻(cpu스케쥴러에 등록)
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
	public void run() { // 알바생이 할 일을 알려주는 작업, 오버라이딩!
		System.out.println(Thread.currentThread().getName());
		System.out.println("~알바생~");
	}
	
}