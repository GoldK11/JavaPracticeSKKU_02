package day1.test;

public class Test {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setName("����");
		c1.setAddress("����");
		c1.setGrade(1);
		
		Customer c2 = new Customer("����","�λ�",2);
		
		System.out.println(c1); // toString�� ��´�
		System.out.println(c2);

	}

}
