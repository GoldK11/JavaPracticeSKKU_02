package edu.skku.java.store;

import java.util.Random; // 패키지가 다른 친구 경로 알려주기 위해 꼭 import 써준다
//import 안쓰려면 애초에 java.util.Random r = new java.util.Random(); 요렇게 써도 됨
//근데 패키지명 일일히 계속 써주면 지저분하니까 그냥 import 쓰자


/*
 * Random API 사용할거야 
 * 
 * package java.util
 * 
 * public class Random{ 
 * 		public int(그럼 이런 return타입 값을 줄게) nextInt(int su)(이렇게  불러라){]
 *		>> 이 메서드는 반드시 new로 불러쓴다
 *		>> int s = new Random().nextInt(23); 이런식으로
 *		

 * 		public static void sm(){} 
 * 		>> 얘는 메서드 앞에 static이 붙으니 new 없이 바로 불러올 수 있다
 * 		>> void : return값이 없다는 뜻
 * 		>> Random.sm(); 그냥 요로케 쓰면 돼
 * 
 * }
 * 요렇게 생겨써
 * 
 */
public class Test2 {

	public static void main(String[] args) {
		
		for(int i=0;i<7;i++) {
			Random r =new Random();
			int su = r.nextInt(45);//0~44중 임의의 값
			System.out.print(su+", ");
		}
	}

}
