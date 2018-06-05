package edu.skku.java.emp;

public class PartTimeEmp extends Employee {
	
	private int hourSalary;
	
	@Override
	public int getSalary() {
		return hourSalary*160;
	}

	public int getHourSalary() {
		return hourSalary;
	}

	public void setHourSalary(int hourSalary) {
		this.hourSalary = hourSalary;
	}

	public PartTimeEmp() {
		super();
	}

	public PartTimeEmp(int num, String name, int hourSalary) {
		super(num, name);
		setHourSalary(hourSalary);
	}

	@Override
	public String toString() {
		return "empNo= " + getNum() + ", name= " + getName() + ", hourSalary= " + hourSalary;
	}
	
	
	

}
