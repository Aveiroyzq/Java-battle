abstract class A{	// 定义抽象类A
	public abstract void print() ;	// 定义抽象方法print()
};
class B extends A {	// 定义子类，继承抽象类
	public void print(){		// 覆写抽象方法
		System.out.println("Hello World!!!") ;
	}
};
public class AbstractCaseDemo01{
	public static void main(String args[]){
		A a = new B() ;		// 通过子类为抽象类实例化
		a.print() ;
	}
};