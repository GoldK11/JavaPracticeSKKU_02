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
	public Bus work(Car c ) {} // 리턴타입은 sub클래스 가능 파라메터는 불가능(이거 달라지면 overloading임)
}

public class Test3 {
	
	public void fileRead() throws FileNotFoundException { 
		// 여기서 throw하면 얘를 부른 main함수로 가고
		Scanner s = null;
			s = new Scanner(new File("data.txt"));
			String msg = s.nextLine();
			System.out.println(msg);
	}

	public static void main(String[] args) throws FileNotFoundException {
		//여기서 throw하면 main을 부른 VM(virtual machine에게 간다)
		Test3 t =new Test3();
		t.fileRead();

		
	}

}
