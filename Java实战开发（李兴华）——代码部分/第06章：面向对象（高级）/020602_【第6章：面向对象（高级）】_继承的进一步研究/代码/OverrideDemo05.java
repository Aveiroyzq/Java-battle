class Person{		// ���常��
	public String info = "MLDN" ;	// ����һ����������
};
class Student extends Person{	// ����̳й�ϵ
	public String info = "LXH" ;	// ������һ���븸������������һ�µ�����
	void print(){	// ��д�����еķ���
		System.out.println("�����е����ԣ�" + super.info) ;
		System.out.println("�����е����ԣ�" + this.info) ;
	}
};
public class OverrideDemo05{
	public static void main(String args[]){
		Student s = new Student() ;
		s.print() ;
	}
};