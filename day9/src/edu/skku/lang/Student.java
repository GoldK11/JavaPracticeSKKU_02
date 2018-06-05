package edu.skku.lang;

public class Student {
	int num;
	String name;
	
	public Student(int num, String name) {
		this.num = num;
		this.name = name;
	}

	@Override  // Object의 toString을 상속받았다는 뜻
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
	public boolean equals(Object obj) { //this는 s1, obj 는 s2를 의미
		if (this == obj)  // 주소값 비교 ( 주소값이 같으면 다를 수 가 없으니까!!
			return true;
		if (obj == null)	// null이면 비교할것도 없이 다르다
			return false;
		if (getClass() != obj.getClass()) //class가 같은지 비교
			return false;
		Student other = (Student) obj; //이제 sub클래스로 캐스팅해줘서 세부사항 비교
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
	//사실 equals는 굳이 오버라이딩 해서 사용할 일이 별로 없지만 학습용~~
	public boolean equals(Object obj) {
		if(obj != null & obj instanceof Student) {
			Student s = (Student)obj;
			if(s.num == this.num && s.name.equals(this.name)) return true;
		}return false;
	}
	
	

}
