package edu.skku.excep;
//throw
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test2 {
	
	public void fileRead() throws FileNotFoundException { 
		// ���⼭ throw�ϸ� �긦 �θ� main�Լ��� ����
		Scanner s = null;
			s = new Scanner(new File("data.txt"));
			String msg = s.nextLine();
			System.out.println(msg);
	}

	public static void main(String[] args) throws FileNotFoundException {
		//���⼭ throw�ϸ� main�� �θ� VM(virtual machine���� ����)
		Test2 t =new Test2();
		t.fileRead();

		
	}

}