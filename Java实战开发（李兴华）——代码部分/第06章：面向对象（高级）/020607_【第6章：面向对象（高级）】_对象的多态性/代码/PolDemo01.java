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
public class PolDemo01{
	public static void main(String asrgs[]){
		B b = new B() ;		// ʵ�����������
		A a = b ;			// ����ת�͹�ϵ
		a.fun1() ;			// �˷��������าд��
		a.fun3() ;
	}
};