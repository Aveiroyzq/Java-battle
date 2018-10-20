abstract class A{	// 是定义了一个抽象类
	public A(){
		System.out.println("A、抽象类中的构造方法。") ;
	}
};
class B extends A{	// 继承抽象类，因为B是普通类，所以必须覆写全部抽象方法
	public B(){
		super() ;
		System.out.println("B、子类中的构造方法。") ;
	}
};
public class AbstractDemo03{
	public static void main(String args[]){
		B b = new B() ;
	}
};