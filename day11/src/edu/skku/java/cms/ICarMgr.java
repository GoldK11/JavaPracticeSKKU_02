package edu.skku.java.cms;

public interface ICarMgr {

	void add(Car c);

	void print(Car c);

	void print();

	// 너 버스니? 
	// A instanceof B >> A가 B의 인스턴스(오브젝트)니? == A야 너 메모리에 B 있니?
	// B는 sub가 와야지 super가 오면 죄다 True가 된다
	void busList();

	void notBusList();

	void truckList();

	// 소유한 차들 중 버스를 찾고 버스이면 총 버스들의 좌석수의 합을 구하기
	int getBusSeats();

	// 소유한 차 들 중 파라메터로 전달된 가격보다 비싼 차들의 개수 구하기
	int getCount(int price);

	//소유한 차 들 중 파라메터로 전달된 가격보다 비싼 차들의 정보 출력
	Car[] getCars(int price);

}