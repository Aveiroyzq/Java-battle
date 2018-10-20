abstract class A{	// 定义抽象类
	public abstract void printA() ;	// 抽象方法
	interface B{	// 定义内部接口
		public void printB() ;	// 定义抽象方法
	}
};
class X extends A{	// 继承抽象类
	public void printA(){
		System.out.println("HELLO --> A") ;
	}
	class Y implements B{	// 定义内部类实现内部接口
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