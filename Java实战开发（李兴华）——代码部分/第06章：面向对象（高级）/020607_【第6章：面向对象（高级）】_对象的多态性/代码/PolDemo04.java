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
class C extends A{
	public void fun1(){		// �˷��������าд��
		System.out.println("C --> public void fun1(){}") ;
	}
	public void fun5(){
		System.out.println("C --> public void fun5(){}") ;
	}
};
public class PolDemo04{
	public static void main(String asrgs[]){
		fun(new B()) ;	// ����B��ʵ��
		fun(new C()) ;	// ����B��ʵ��
	}
	public static void fun(B b){
		b.fun1() ;		// ���ø�д�����е�fun1()����
	}
	public static void fun(C c){
		c.fun1() ;		// ���ø�д�����е�fun1()����
	}
};