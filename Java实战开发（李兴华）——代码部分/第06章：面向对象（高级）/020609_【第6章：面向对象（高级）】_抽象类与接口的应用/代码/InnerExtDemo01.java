abstract class A{	// ���������
	public abstract void printA() ;	// ���󷽷�
	interface B{	// �����ڲ��ӿ�
		public void printB() ;	// ������󷽷�
	}
};
class X extends A{	// �̳г�����
	public void printA(){
		System.out.println("HELLO --> A") ;
	}
	class Y implements B{	// �����ڲ���ʵ���ڲ��ӿ�
		public void printB(){
			System.out.println("HELLO --> B") ;
		}
	};
};
public class InnerExtDemo01{
	public static void main(String args[]){
		A.B b = new X().new Y() ;
		b.printB() ;
	}
};