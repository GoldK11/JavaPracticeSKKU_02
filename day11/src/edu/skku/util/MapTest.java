package edu.skku.util;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		//Map�� ��ü Ÿ������ ����Ѵ�. �⺻�� �ȵ�
		Map<Integer,String> m = new HashMap<>(); //java7.0���� �տ��� �����൵ �ȴ� �ڴ�<>�� ��������
		m.put(1000, "����� �߱�");
		m.put(10010, "����� ���빮��");
		m.put(103, "����� ���α�");
		
		System.out.println(m.get(10010));
		
		System.out.println("-----key:value-----");
		for (int k :m.keySet()) System.out.println(k+" : "+m.get(k));

	}

}
