package day1.test;
//������ ����- ���� ���� : ������ > ������ > �޼���

public class Customer {

	//data
	private String name;
	private String address;
	private int grade;

	//constructor
	
	public Customer() {
		super();
	}

	public Customer(String name, String address, int grade) {
		super();
		this.name = name;
		this.address = address;
		this.grade = grade;
	}
		
	//method : get&set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void order() {
		System.out.println("-----order-----");
	}
	
	
    //method: toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�̸�: "+name +" / �ּ�: "+address;
	}
	

}
