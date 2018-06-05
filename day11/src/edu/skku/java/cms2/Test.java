package edu.skku.java.cms2;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		ICarMgr mgr = new CarMgrImpol(); //superŸ������ I�������µ� ��� new�ȵǴϱ� new�� ���� Ŭ����
		mgr.add(new Car("11�� 1234",3000));
		mgr.add(new Bus("87�� 0518",9200,5));
		mgr.add(new Bus("33�� 1201",8900,67));
		mgr.add(new Car("43�� 5667",6000));
		mgr.add(new Car("99�� 9053",2000));
		mgr.add(new Car("28�� 1104",8000));
		mgr.add(new Bus("54�� 0419",3200,30));

		List<Car> cars = mgr.search();
		
		System.out.println("----AllList---");
		for(Car c:cars) System.out.println(c);
		
		System.out.println("----Update---");
		mgr.update("31�� 4908", 6000);
		System.out.println("----Update---");
		mgr.update("87�� 0518", 6000);
		
		System.out.println("----AllList---");
		for(Car c:cars) System.out.println(c);

	}

}
