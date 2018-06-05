package edu.skku.java.emp;

public class EmpMgr {
	Employee []es = new Employee[50];
	int index = 0;
	
	public void add(Employee e) {
		es[index++]=e;
	}
	
	public void allList() {
		for(int i=0;i<index;i++) System.out.println(es[i]);
	}
	
	public void partTimeEmpList() {
		for(int i=0;i<index;i++) {
			if(es[i] instanceof PartTimeEmp) System.out.println(es[i]);
		}
	}
	
	public void fullTimeEmpList() {
		for(int i=0;i<index;i++) {
			if(es[i] instanceof FullTimeEmp) System.out.println(es[i]);
		}
	}
	
	public int size() {
		return index;
	}
	
	public int getTotalSalary() {
		int total =0;
		for(int i=0;i<index;i++) total+=es[i].getSalary();
		return total;
	}
	
	public Employee search(int num) {
		for(int i=0;i<index;i++) {
			if(es[i].getNum()==num) {
				return es[i];
			}
		}return null;
	}
	
	public Employee [] search(String name) {
		Employee [] en= new Employee[50];
		int in = 0;
		for(int i=0;i<index;i++) {
			if(es[i].getName().contains(name)) {
				en[in++]=es[i];
			}
		}return  en;
	}
}
