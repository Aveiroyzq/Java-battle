class Outer{		// 定义外部类
	private String info = "hello world" ;	// 定义外部类的私有属性
	class Inner{	// 定义内部类
		public void print(){				// 定义内部类的方法
			System.out.println(info) ;		// 直接访问外部类的私有属性
		}
	};
	public void fun(){						// 定义外部类的方法
		new Inner().print() ;				// 通过内部类的实例化对象调用方法
	}
};
public class InnerClassDemo04{
	public static void main(String args[]){
		Outer out = new Outer()	;			// 外部类实例化对象
		Outer.Inner in = out.new Inner() ;	// 实例化内部类对象
		in.print() ;						// 调用内部类的方法
	}
};