class Person{		// ���常��
	void print(){	// Ĭ�ϵķ���Ȩ��
		System.out.println("Person --> void print()��") ;
	}
};
class Student extends Person{	// ����̳й�ϵ
	public void print(){
		System.out.println("Student --> void print()��") ;
	}
};
public class OverrideDemo01{
	public static void main(String args[]){
		Student s = new Student() ;
		s.print() ;
	}
};