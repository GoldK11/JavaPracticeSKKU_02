package edu.skku.java.cms;

public class Test2 {

	public static void main(String[] args) {
		
		Car c1 = new Car("11가 4772",3000);
		Bus c2 = new Bus("12너 3493",8000,20);
		Truck c3 = new Truck("32하 4554",9000,"파란트럭",3);

		CarM mgr = new CarM();

		
		mgr.add(c1);
		mgr.add(c2);
		mgr.add(c3);
		mgr.add(new Bus("34바 3229",7000,32));
		mgr.add(new Car("31허 2004",8888));
		mgr.add(new Truck("43아 4554",9000,"하얀트럭",3));
		mgr.add(new Truck("74야 2342",2000,"노란트럭",9));
		mgr.add(new Truck("10어 5676",7000,"검은트럭",12));
		
		
		System.out.println("----------mgr.print:각각--------");
		mgr.print(c1);
		System.out.println("----------mgr.print:각각--------");
		mgr.print(c2);
		System.out.println("----------mgr.print:각각--------");
		mgr.print(c3);

		System.out.println("--------mgr.print:모두--------");
		mgr.print();
		
		System.out.println("---------mgr.busList---------");
		mgr.busList();
		
		System.out.println("---------mgr.notBusList---------");
		mgr.notBusList();		
		
		System.out.println("---------mgr.truckList---------");
		mgr.truckList();		
		
		
		//각각의 toString은 모두 overriding되어있기 때문에 Car가 아니라 각각의 toString을 찍는다

	}

}
