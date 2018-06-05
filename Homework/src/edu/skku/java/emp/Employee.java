package edu.skku.java.emp;

public abstract class Employee {
	private int num;
	private String name;
	
	public abstract int getSalary();
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee() {
	}

	public Employee(int num, String name) {
		setNum(num);
		setName(name);
	}

	@Override
	public String toString() {
		return "empNo=" + num + ", name=" + name ;
	}


	
	
	
	
	

}
