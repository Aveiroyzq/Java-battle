abstract class A{	// ���������A
	public abstract void print() ;	// ������󷽷�print()
};
class B extends A {	// �������࣬�̳г�����
	public void print(){		// ��д���󷽷�
		System.out.println("Hello World!!!") ;
	}
};
public class AbstractCaseDemo01{
	public static void main(String args[]){
		A a = new B() ;		// ͨ������Ϊ������ʵ����
		a.print() ;
	}
};