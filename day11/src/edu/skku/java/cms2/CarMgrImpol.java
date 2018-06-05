package edu.skku.java.cms2;

import java.util.ArrayList;
import java.util.List;

public class CarMgrImpol implements ICarMgr {

	List<Car> cars = new ArrayList<Car>();
	
	public void add(Car c) {
		cars.add(c); // �ε��� �ʿ����
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
		else System.out.println("������ȣ ����");
	}

	public void delete(String num) {
		Car c= search(num);
		if(c!=null) cars.remove(c); //ArrayList�� ����� �ε��� ������ �˾Ƽ� ���ش�
		else System.out.println("������ȣ ����");
	}

}
