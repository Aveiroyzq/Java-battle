abstract class A{	// �Ƕ�����һ��������
	public A(){
		System.out.println("A���������еĹ��췽����") ;
	}
};
class B extends A{	// �̳г����࣬��ΪB����ͨ�࣬���Ա��븲дȫ�����󷽷�
	public B(){
		super() ;
		System.out.println("B�������еĹ��췽����") ;
	}
};
public class AbstractDemo03{
	public static void main(String args[]){
		B b = new B() ;
	}
};