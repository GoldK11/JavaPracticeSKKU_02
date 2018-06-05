package edu.skku.java.cms;

public interface ICarMgr {

	void add(Car c);

	void print(Car c);

	void print();

	// �� ������? 
	// A instanceof B >> A�� B�� �ν��Ͻ�(������Ʈ)��? == A�� �� �޸𸮿� B �ִ�?
	// B�� sub�� �;��� super�� ���� �˴� True�� �ȴ�
	void busList();

	void notBusList();

	void truckList();

	// ������ ���� �� ������ ã�� �����̸� �� �������� �¼����� ���� ���ϱ�
	int getBusSeats();

	// ������ �� �� �� �Ķ���ͷ� ���޵� ���ݺ��� ��� ������ ���� ���ϱ�
	int getCount(int price);

	//������ �� �� �� �Ķ���ͷ� ���޵� ���ݺ��� ��� ������ ���� ���
	Car[] getCars(int price);

}