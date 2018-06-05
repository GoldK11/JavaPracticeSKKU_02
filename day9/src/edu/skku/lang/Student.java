package edu.skku.lang;

public class Student {
	int num;
	String name;
	
	public Student(int num, String name) {
		this.num = num;
		this.name = name;
	}

	@Override  // Object�� toString�� ��ӹ޾Ҵٴ� ��
	public String toString() {
		return "Student [num=" + num + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + num;
		return result;
	}

/*	@Override
	public boolean equals(Object obj) { //this�� s1, obj �� s2�� �ǹ�
		if (this == obj)  // �ּҰ� �� ( �ּҰ��� ������ �ٸ� �� �� �����ϱ�!!
			return true;
		if (obj == null)	// null�̸� ���Ұ͵� ���� �ٸ���
			return false;
		if (getClass() != obj.getClass()) //class�� ������ ��
			return false;
		Student other = (Student) obj; //���� subŬ������ ĳ�������༭ ���λ��� ��
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num != other.num)
			return false;
		return true;
	}
*/
	//��� equals�� ���� �������̵� �ؼ� ����� ���� ���� ������ �н���~~
	public boolean equals(Object obj) {
		if(obj != null & obj instanceof Student) {
			Student s = (Student)obj;
			if(s.num == this.num && s.name.equals(this.name)) return true;
		}return false;
	}
	
	

}
