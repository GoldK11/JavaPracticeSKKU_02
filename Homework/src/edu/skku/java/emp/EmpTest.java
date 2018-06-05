package edu.skku.java.emp;

public class EmpTest {

	public static void main(String[] args) {
		EmpMgr mgr = new EmpMgr();
		mgr.add(new FullTimeEmp(1234,"���ϳ�",55000000));
		mgr.add(new FullTimeEmp(1235,"��Ѹ�",32300000));
		mgr.add(new PartTimeEmp(12341,"ȫ�浿",20000));
		mgr.add(new FullTimeEmp(1236,"����",42500000));
		mgr.add(new PartTimeEmp(12342,"������",60000));
		mgr.add(new PartTimeEmp(12343,"�Ӳ���",110000));
		mgr.add(new FullTimeEmp(1237,"���ϳ�",120000000));
		
		mgr.allList();
		System.out.println("��ü ���� ��: "+mgr.size()+"��");
		
		System.out.println("������ �� �޿���: "+mgr.getTotalSalary());
		
		System.out.println("\n******** ������ ���");
		mgr.fullTimeEmpList();
		
		System.out.println("\n******** ��ƮŸ���� ���");
		mgr.partTimeEmpList();
		
		System.out.println("\n******** �˻� : 1234");
		Employee e1 = mgr.search(1234);
		System.out.println(e1);
		System.out.println(e1.getName()+"�� �� �޿�: "+e1.getSalary());
		
		System.out.println("\n******** �˻� : �ϳ�");
		
		Employee [] search = mgr.search("�ϳ�");
		for (Employee e : search) {
			if(e==null) {
				break;
			}else {
				System.out.println(e);
				System.out.println(e.getName()+"�� �� �޿�: "+e.getSalary());
			}
		}


	}

}
