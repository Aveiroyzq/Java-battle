interface A{	// 定义接口
	public void printA() ;	// 抽象方法
	abstract class B{	// 定义内部抽象类
		public abstract void printB() ;	// 定义抽象方法
	}
};
class X implements A{	// 实现接口
	public void printA(){
		System.out.println("HELLO --> A") ;
	}
	class Y extends B{	// 继承抽象类
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