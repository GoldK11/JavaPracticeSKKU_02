package edu.skku.excep;
//throw
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Parent{
	public Car drive(Car c ) throws IOException{}
}
class Child extends Parrent{
	//	public Car drive(Car c ) throws IOException{}
	//	public Car drive(Car c ) throws FileNotFoundException{}
	public Car drive(Car c ) {}
	
	//public Car work(Car c){}
	//Car work(Car c){}
	public Bus work(Car c ) {} // ����Ÿ���� subŬ���� ���� �Ķ���ʹ� �Ұ���(�̰� �޶����� overloading��)
}

public class Test3 {
	
	public void fileRead() throws FileNotFoundException { 
		// ���⼭ throw�ϸ� �긦 �θ� main�Լ��� ����
		Scanner s = null;
			s = new Scanner(new File("data.txt"));
			String msg = s.nextLine();
			System.out.println(msg);
	}

	public static void main(String[] args) throws FileNotFoundException {
		//���⼭ throw�ϸ� main�� �θ� VM(virtual machine���� ����)
		Test3 t =new Test3();
		t.fileRead();

		
	}

}
