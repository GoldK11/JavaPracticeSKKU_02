package edu.skku.excep;
//throw
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test2 {
	
	public void fileRead() throws FileNotFoundException { 
		// 여기서 throw하면 얘를 부른 main함수로 가고
		Scanner s = null;
			s = new Scanner(new File("data.txt"));
			String msg = s.nextLine();
			System.out.println(msg);
	}

	public static void main(String[] args) throws FileNotFoundException {
		//여기서 throw하면 main을 부른 VM(virtual machine에게 간다)
		Test2 t =new Test2();
		t.fileRead();

		
	}

}
