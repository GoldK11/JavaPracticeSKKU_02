package edu.skku.java.cms;

public class Test2 {

	public static void main(String[] args) {
		
		Car c1 = new Car("11�� 4772",3000);
		Bus c2 = new Bus("12�� 3493",8000,20);
		Truck c3 = new Truck("32�� 4554",9000,"�Ķ�Ʈ��",3);

		CarM mgr = new CarM();

		
		mgr.add(c1);
		mgr.add(c2);
		mgr.add(c3);
		mgr.add(new Bus("34�� 3229",7000,32));
		mgr.add(new Car("31�� 2004",8888));
		mgr.add(new Truck("43�� 4554",9000,"�Ͼ�Ʈ��",3));
		mgr.add(new Truck("74�� 2342",2000,"���Ʈ��",9));
		mgr.add(new Truck("10�� 5676",7000,"����Ʈ��",12));
		
		
		System.out.println("----------mgr.print:����--------");
		mgr.print(c1);
		System.out.println("----------mgr.print:����--------");
		mgr.print(c2);
		System.out.println("----------mgr.print:����--------");
		mgr.print(c3);

		System.out.println("--------mgr.print:���--------");
		mgr.print();
		
		System.out.println("---------mgr.busList---------");
		mgr.busList();
		
		System.out.println("---------mgr.notBusList---------");
		mgr.notBusList();		
		
		System.out.println("---------mgr.truckList---------");
		mgr.truckList();		
		
		
		//������ toString�� ��� overriding�Ǿ��ֱ� ������ Car�� �ƴ϶� ������ toString�� ��´�

	}

}
