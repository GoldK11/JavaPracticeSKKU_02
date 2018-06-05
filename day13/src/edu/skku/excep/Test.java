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
			System.out.println("파일 읽기 실패");
		}finally { // 리소스 해제
			if (s!=null) s.close();
			//s.close(); 그냥 쓰면 e에러 발생한 경우 s는 null값이라 null포인트 에러가 발생
		}
		
	}

	public static void main(String[] args) {
		//fileRead(); >> 이거 에러남 왜? main함수는 static 이기 때문에
		//1. 현재 클래스 new해서 생성 후 사용
		Test t =new Test();
		t.fileRead();
		
		//2. fileRead()함수를 static 함수로 만들어준다
		
	}

}
