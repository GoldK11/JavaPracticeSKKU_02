package edu.skku.excep;
//try&catch
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
	
	public void fileRead() {
		Scanner s = null;
		try {
			s = new Scanner(new File("data.txt"));
			String msg = s.nextLine();
			System.out.println(msg);
		}catch(FileNotFoundException e) {
			System.out.println("���� �б� ����");
		}finally { // ���ҽ� ����
			if (s!=null) s.close();
			//s.close(); �׳� ���� e���� �߻��� ��� s�� null���̶� null����Ʈ ������ �߻�
		}
		
	}

	public static void main(String[] args) {
		//fileRead(); >> �̰� ������ ��? main�Լ��� static �̱� ������
		//1. ���� Ŭ���� new�ؼ� ���� �� ���
		Test t =new Test();
		t.fileRead();
		
		//2. fileRead()�Լ��� static �Լ��� ������ش�
		
	}

}