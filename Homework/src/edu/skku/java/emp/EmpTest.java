package edu.skku.java.emp;

public class EmpTest {

	public static void main(String[] args) {
		EmpMgr mgr = new EmpMgr();
		mgr.add(new FullTimeEmp(1234,"김하나",55000000));
		mgr.add(new FullTimeEmp(1235,"김둘리",32300000));
		mgr.add(new PartTimeEmp(12341,"홍길동",20000));
		mgr.add(new FullTimeEmp(1236,"장길산",42500000));
		mgr.add(new PartTimeEmp(12342,"일지매",60000));
		mgr.add(new PartTimeEmp(12343,"임꺽정",110000));
		mgr.add(new FullTimeEmp(1237,"이하나",120000000));
		
		mgr.allList();
		System.out.println("전체 직원 수: "+mgr.size()+"명");
		
		System.out.println("전직원 총 급여액: "+mgr.getTotalSalary());
		
		System.out.println("\n******** 정규직 목록");
		mgr.fullTimeEmpList();
		
		System.out.println("\n******** 파트타임직 목록");
		mgr.partTimeEmpList();
		
		System.out.println("\n******** 검색 : 1234");
		Employee e1 = mgr.search(1234);
		System.out.println(e1);
		System.out.println(e1.getName()+"의 월 급여: "+e1.getSalary());
		
		System.out.println("\n******** 검색 : 하나");
		
		Employee [] search = mgr.search("하나");
		for (Employee e : search) {
			if(e==null) {
				break;
			}else {
				System.out.println(e);
				System.out.println(e.getName()+"의 월 급여: "+e.getSalary());
			}
		}


	}

}
