package edu.skku.java.emp;

public class FullTimeEmp extends Employee {
	
	private int annualSalary;

	@Override
	public int getSalary() {
		return annualSalary/12;
	}

	public int getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}

	public FullTimeEmp() {
		super();
	}

	public FullTimeEmp(int num, String name, int annualSalary) {
		super(num, name);
		setAnnualSalary(annualSalary);
	}

	@Override
	public String toString() {
		return "empNo= " + getNum() + ", name= " + getName() + ", annualSalary= " + annualSalary;
	}
	
	
	
	

}
