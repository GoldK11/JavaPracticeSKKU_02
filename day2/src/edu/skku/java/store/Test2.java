package edu.skku.java.store;

import java.util.Random; // ��Ű���� �ٸ� ģ�� ��� �˷��ֱ� ���� �� import ���ش�
//import �Ⱦ����� ���ʿ� java.util.Random r = new java.util.Random(); �䷸�� �ᵵ ��
//�ٵ� ��Ű���� ������ ��� ���ָ� �������ϴϱ� �׳� import ����


/*
 * Random API ����Ұž� 
 * 
 * package java.util
 * 
 * public class Random{ 
 * 		public int(�׷� �̷� returnŸ�� ���� �ٰ�) nextInt(int su)(�̷���  �ҷ���){]
 *		>> �� �޼���� �ݵ�� new�� �ҷ�����
 *		>> int s = new Random().nextInt(23); �̷�������
 *		

 * 		public static void sm(){} 
 * 		>> ��� �޼��� �տ� static�� ������ new ���� �ٷ� �ҷ��� �� �ִ�
 * 		>> void : return���� ���ٴ� ��
 * 		>> Random.sm(); �׳� ����� ���� ��
 * 
 * }
 * �䷸�� ���ܽ�
 * 
 */
public class Test2 {

	public static void main(String[] args) {
		
		for(int i=0;i<7;i++) {
			Random r =new Random();
			int su = r.nextInt(45);//0~44�� ������ ��
			System.out.print(su+", ");
		}
	}

}
