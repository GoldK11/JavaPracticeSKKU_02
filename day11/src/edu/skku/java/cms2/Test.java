package edu.skku.java.cms2;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		ICarMgr mgr = new CarMgrImpol(); //super타입으로 I가져오는데 얘는 new안되니까 new는 서브 클랫로
		mgr.add(new Car("11가 1234",3000));
		mgr.add(new Bus("87마 0518",9200,5));
		mgr.add(new Bus("33도 1201",8900,67));
		mgr.add(new Car("43나 5667",6000));
		mgr.add(new Car("99하 9053",2000));
		mgr.add(new Car("28다 1104",8000));
		mgr.add(new Bus("54마 0419",3200,30));

		List<Car> cars = mgr.search();
		
		System.out.println("----AllList---");
		for(Car c:cars) System.out.println(c);
		
		System.out.println("----Update---");
		mgr.update("31나 4908", 6000);
		System.out.println("----Update---");
		mgr.update("87마 0518", 6000);
		
		System.out.println("----AllList---");
		for(Car c:cars) System.out.println(c);

	}

}
