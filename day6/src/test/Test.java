package test;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		/*
		Abc a = new Abc();
		a.m();

		Abc a2 = new Abc();
		
		Abc.m2();
		a.m2(); // static이어도 new 하고 불러도 된다.
		
		System.out.println(Abc.k);
		
		Abc.k = 15;
		System.out.println(Abc.k);
		System.out.println(a.k);
		
		a2.k = 40;
		System.out.println(Abc.k); 
		System.out.println(a.k);
		//a2의 k만 바꿨는데 a의 k도 바뀌었다
		*/
		
		//괄호 안에 있는 애를 메모리에 읽어와라 
		Class.forName("test.Abc");
		
		System.out.println(Math.round(25.46));
		// Math는 static클래스라  Math m = new Math()이런식으로 생성 해주지 않아도 사용 가능
		
		
	}

}
