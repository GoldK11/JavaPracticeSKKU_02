package day1.test;
//가독성 관습- 적는 순서 : 데이터 > 생성자 > 메서드

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
		return "이름: "+name +" / 주소: "+address;
	}
	

}
