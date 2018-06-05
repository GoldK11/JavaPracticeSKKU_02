package edu.skku.util;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		//util�� ����Ʈ ����� �Ѵ�
		
		List<Car> c = new ArrayList<Car>();
		//superŸ���� argumet�� �´ٸ� ����Ŭ���� �� ���� �� �ִ�
		c.add(new Car("11��1111",5000));
		c.add(new Bus("32�� 1243",8000,12));
		c.add(new Car("22�� 2342",4999));
		c.add(new Bus("43�� 3979",5300,44));		
		c.add(new Bus("12�� 3249",3100,10));
		
		System.out.println("------All List-------");
		for (Car cc:c) System.out.println(cc);

		System.out.println("------Bus List-------");
		for (Car cc:c) {
			if (cc instanceof Bus) System.out.println(cc);
		}
		
		System.out.print("------Bus Seats : ");
		int sum = 0;
		for (Car cc:c) {
			if (cc instanceof Bus) {
				Bus b = (Bus)cc;
				sum+=b.getSeats();
			}
		}
		System.out.println(sum);
		

		System.out.println("-----c.get(0)----");
		System.out.println(c.get(0));
	
		System.out.println("-----c.remove(0)----");
		c.remove(0);		
		
		System.out.println("------All List-------");
		for (Car cc:c) System.out.println(cc);
	
	}

}
