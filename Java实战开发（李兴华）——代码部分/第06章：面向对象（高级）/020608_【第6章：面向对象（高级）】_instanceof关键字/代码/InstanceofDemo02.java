class A{					// 定义类A
	public void fun1(){		// 定义fun1()方法
		System.out.println("A --> public void fun1(){}") ;
	}
	public void fun2(){
		this.fun1() ;		// 调用fun1()方法
	}
};
class B extends A{
	public void fun1(){		// 此方法被子类覆写了
		System.out.println("B --> public void fun1(){}") ;
	}
	public void fun3(){
		System.out.println("B --> public void fun3(){}") ;
	}
};
class C extends A{
	public void fun1(){		// 此方法被子类覆写了
		System.out.println("C --> public void fun1(){}") ;
	}
	public void fun5(){
		System.out.println("C --> public void fun5(){}") ;
	}
};
public class InstanceofDemo02{
	public static void main(String asrgs[]){
		fun(new B()) ;
		fun(new C()) ;
	}
	public static void fun(A a){
		a.fun1() ;
		if(a instanceof B){
			B b = (B) a ;
			b.fun3() ;
		}
		if(a instanceof C){
			C c = (C) a ;
			c.fun5() ;
		}
	}
};