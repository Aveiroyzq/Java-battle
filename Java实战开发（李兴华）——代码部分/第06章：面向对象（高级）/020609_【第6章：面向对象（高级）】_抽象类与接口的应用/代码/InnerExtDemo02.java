interface A{	// ����ӿ�
	public void printA() ;	// ���󷽷�
	abstract class B{	// �����ڲ�������
		public abstract void printB() ;	// ������󷽷�
	}
};
class X implements A{	// ʵ�ֽӿ�
	public void printA(){
		System.out.println("HELLO --> A") ;
	}
	class Y extends B{	// �̳г�����
		public void printB(){
			System.out.println("HELLO --> B") ;
		}
	};
};
public class InnerExtDemo02{
	public static void main(String args[]){
		A.B b = new X().new Y() ;
		b.printB() ;
	}
};