package edu.skku.util;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		//Map은 객체 타입으로 줘야한다. 기본형 안됨
		Map<Integer,String> m = new HashMap<>(); //java7.0부터 앞에만 적어줘도 된다 뒤는<>로 생략가능
		m.put(1000, "서울시 중구");
		m.put(10010, "서울시 동대문구");
		m.put(103, "서울시 종로구");
		
		System.out.println(m.get(10010));
		
		System.out.println("-----key:value-----");
		for (int k :m.keySet()) System.out.println(k+" : "+m.get(k));

	}

}
