class Person{		// ���常��
	private void print(){	// Ĭ�ϵķ���Ȩ��
		System.out.println("Person --> void print()��") ;
	}
	public void fun(){	// ����һ��fun����
		this.print() ;	// ����print()����
	}
};
class Student extends Person{	// ����̳й�ϵ
	void print(){	// ��д�����еķ���
		// super.print() ;	// ���ʸ����б����าд���ķ���
		System.out.println("Student --> void print()��") ;
	}
};
public class OverrideDemo04{
	public static void main(String args[]){
		Student s = new Student() ;
		s.fun() ;
	}
};