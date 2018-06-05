package edu.skku.java.cms2;

import java.util.ArrayList;
import java.util.List;

public class CarMgrImpol implements ICarMgr {

	List<Car> cars = new ArrayList<Car>();
	
	public void add(Car c) {
		cars.add(c); // 인덱스 필요없당
	}

	public Car search(String num) {
		for(Car c:cars) {
			if (c.getNum().equals(num)) return c;
		}
		return null;
	}
	
	public List<Car> search() {
		return cars;
	}

	public void update(String num, int price) {
		Car c = search(num);
		if(c!=null) c.setPrice(price);
		else System.out.println("차량번호 오류");
	}

	public void delete(String num) {
		Car c= search(num);
		if(c!=null) cars.remove(c); //ArrayList가 지우고 인덱스 관리도 알아서 해준다
		else System.out.println("차량번호 오류");
	}

}
