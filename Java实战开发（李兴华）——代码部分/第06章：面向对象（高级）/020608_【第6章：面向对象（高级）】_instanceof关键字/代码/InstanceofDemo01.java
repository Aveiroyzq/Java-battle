class A{					// ������A
	public void fun1(){		// ����fun1()����
		System.out.println("A --> public void fun1(){}") ;
	}
	public void fun2(){
		this.fun1() ;		// ����fun1()����
	}
};
class B extends A{
	public void fun1(){		// �˷��������าд��
		System.out.println("B --> public void fun1(){}") ;
	}
	public void fun3(){
		System.out.println("B --> public void fun3(){}") ;
	}
};
public class InstanceofDemo01{
	public static void main(String asrgs[]){
		A a1 = new B() ;		// ͨ������ת��ʵ��������
		System.out.println("A a1 = new B()��" + (a1 instanceof A)) ;
		System.out.println("A a1 = new B()��" + (a1 instanceof B)) ;
		A a2 = new A() ;		// ͨ������ת��ʵ��������
		System.out.println("A a2 = new B()��" + (a2 instanceof A)) ;
		System.out.println("A a2 = new B()��" + (a2 instanceof B)) ;
	}
};