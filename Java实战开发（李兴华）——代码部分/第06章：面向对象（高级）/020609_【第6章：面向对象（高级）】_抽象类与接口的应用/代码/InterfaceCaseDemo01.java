interface A{	// ���������A
	public abstract void print() ;	// ������󷽷�print()
};
class B implements A {	// �������࣬�̳г�����
	public void print(){		// ��д���󷽷�
		System.out.println("Hello World!!!") ;
	}
};
public class InterfaceCaseDemo01{
	public static void main(String args[]){
		A a = new B() ;		// ͨ������Ϊ������ʵ����
		a.print() ;
	}
};