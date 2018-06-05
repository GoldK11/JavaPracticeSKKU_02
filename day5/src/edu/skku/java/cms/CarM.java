package edu.skku.java.cms;

public class CarM {
	
	Car[] cars = new Car[100];
	int index = 0;
	
	public void add(Car c) {
		cars[index]=c;
		index++;
	}
	
	public void print(Car c) {
		System.out.println(c); //c.toString()�� ��´�
		
	}
	public void print() {
		for(int i=0; i<index;i++ )System.out.println(i+" "+cars[i]);
	}
	
	// �� ������? 
	// A instanceof B >> A�� B�� �ν��Ͻ�(������Ʈ)��? == A�� �� �޸𸮿� B �ִ�?
	// B�� sub�� �;��� super�� ���� �˴� True�� �ȴ�
	public void busList() {
		for(int i=0; i<index; i++) {
			if(cars[i] instanceof Bus) System.out.println(i+" "+cars[i]);
		}
	}
	
	public void notBusList() {
		for(int i=0; i<index; i++) {
			if(!(cars[i] instanceof Bus)) System.out.println(i+" "+cars[i]);
		}
	}	
	
	public void truckList() {
		for(int i=0; i<index; i++) {
			if(cars[i] instanceof Truck) System.out.println(i+" "+cars[i]);
		}
	}
	
	// ������ ���� �� ������ ã�� �����̸� �� �������� �¼����� ���� ���ϱ�
	public int getBusSeats() {
		System.out.print("�� ������ �¼� ��: ");
		int sum=0;
		for(int i=0; i<index; i++) {
			if(cars[i] instanceof Bus) {
				Bus b = (Bus)cars[i];
				sum+=b.getSeats();
			}
		}
		return sum;
	}
	// ������ �� �� �� �Ķ���ͷ� ���޵� ���ݺ��� ��� ������ ���� ���ϱ�
	public int getCount(int price) {
		int sum=0;
		for(int i=0; i<index; i++) {
			if(cars[i].getPrice()>price) sum++;		
		}
		return sum;
	}
	
	//������ �� �� �� �Ķ���ͷ� ���޵� ���ݺ��� ��� ������ ���� ���
	public Car[] getCars(int price) {
		Car[]result = new Car[getCount(price)]; //�迭�� ũ�� ����
		int n=0;
		for(int i=0; i<index; i++) {
			if(cars[i].getPrice()>price) {
				result[n] = cars[i];
				n++;
				//Ȥ�� result[n++] = cars[i]; �ص� �ȴ� (����! result[++n]�� �ȵ�!
			}
		}
		return result;
	}
	
}
