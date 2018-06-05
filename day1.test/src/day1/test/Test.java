package day1.test;

public class Test {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setName("소진");
		c1.setAddress("서울");
		c1.setGrade(1);
		
		Customer c2 = new Customer("세진","부산",2);
		
		System.out.println(c1); // toString을 찍는다
		System.out.println(c2);

	}

}
