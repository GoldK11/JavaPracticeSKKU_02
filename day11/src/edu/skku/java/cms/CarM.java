package edu.skku.java.cms;

public class CarM implements ICarMgr {
	
	Car[] cars = new Car[100];
	int index = 0;
	
	/* (non-Javadoc)
	 * @see edu.skku.java.cms.ICarMgr#add(edu.skku.java.cms.Car)
	 */
	@Override
	public void add(Car c) {
		cars[index]=c;
		index++;
	}
	
	/* (non-Javadoc)
	 * @see edu.skku.java.cms.ICarMgr#print(edu.skku.java.cms.Car)
	 */
	@Override
	public void print(Car c) {
		System.out.println(c); //c.toString()�� ��´�
		
	}
	/* (non-Javadoc)
	 * @see edu.skku.java.cms.ICarMgr#print()
	 */
	@Override
	public void print() {
		for(int i=0; i<index;i++ )System.out.println(i+" "+cars[i]);
	}
	
	// �� ������? 
	// A instanceof B >> A�� B�� �ν��Ͻ�(������Ʈ)��? == A�� �� �޸𸮿� B �ִ�?
	// B�� sub�� �;��� super�� ���� �˴� True�� �ȴ�
	/* (non-Javadoc)
	 * @see edu.skku.java.cms.ICarMgr#busList()
	 */
	@Override
	public void busList() {
		for(int i=0; i<index; i++) {
			if(cars[i] instanceof Bus) System.out.println(i+" "+cars[i]);
		}
	}
	
	/* (non-Javadoc)
	 * @see edu.skku.java.cms.ICarMgr#notBusList()
	 */
	@Override
	public void notBusList() {
		for(int i=0; i<index; i++) {
			if(!(cars[i] instanceof Bus)) System.out.println(i+" "+cars[i]);
		}
	}	
	
	/* (non-Javadoc)
	 * @see edu.skku.java.cms.ICarMgr#truckList()
	 */
	@Override
	public void truckList() {
		for(int i=0; i<index; i++) {
			if(cars[i] instanceof Truck) System.out.println(i+" "+cars[i]);
		}
	}
	
	// ������ ���� �� ������ ã�� �����̸� �� �������� �¼����� ���� ���ϱ�
	/* (non-Javadoc)
	 * @see edu.skku.java.cms.ICarMgr#getBusSeats()
	 */
	@Override
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
	/* (non-Javadoc)
	 * @see edu.skku.java.cms.ICarMgr#getCount(int)
	 */
	@Override
	public int getCount(int price) {
		int sum=0;
		for(int i=0; i<index; i++) {
			if(cars[i].getPrice()>price) sum++;		
		}
		return sum;
	}
	
	//������ �� �� �� �Ķ���ͷ� ���޵� ���ݺ��� ��� ������ ���� ���
	/* (non-Javadoc)
	 * @see edu.skku.java.cms.ICarMgr#getCars(int)
	 */
	@Override
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
