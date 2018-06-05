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
		System.out.println(c); //c.toString()을 찍는다
		
	}
	/* (non-Javadoc)
	 * @see edu.skku.java.cms.ICarMgr#print()
	 */
	@Override
	public void print() {
		for(int i=0; i<index;i++ )System.out.println(i+" "+cars[i]);
	}
	
	// 너 버스니? 
	// A instanceof B >> A가 B의 인스턴스(오브젝트)니? == A야 너 메모리에 B 있니?
	// B는 sub가 와야지 super가 오면 죄다 True가 된다
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
	
	// 소유한 차들 중 버스를 찾고 버스이면 총 버스들의 좌석수의 합을 구하기
	/* (non-Javadoc)
	 * @see edu.skku.java.cms.ICarMgr#getBusSeats()
	 */
	@Override
	public int getBusSeats() {
		System.out.print("총 버스의 좌석 수: ");
		int sum=0;
		for(int i=0; i<index; i++) {
			if(cars[i] instanceof Bus) {
				Bus b = (Bus)cars[i];
				sum+=b.getSeats();
			}
		}
		return sum;
	}
	// 소유한 차 들 중 파라메터로 전달된 가격보다 비싼 차들의 개수 구하기
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
	
	//소유한 차 들 중 파라메터로 전달된 가격보다 비싼 차들의 정보 출력
	/* (non-Javadoc)
	 * @see edu.skku.java.cms.ICarMgr#getCars(int)
	 */
	@Override
	public Car[] getCars(int price) {
		Car[]result = new Car[getCount(price)]; //배열의 크기 지정
		int n=0;
		for(int i=0; i<index; i++) {
			if(cars[i].getPrice()>price) {
				result[n] = cars[i];
				n++;
				//혹은 result[n++] = cars[i]; 해도 된다 (주의! result[++n]은 안됨!
			}
		}
		return result;
	}
	
}
