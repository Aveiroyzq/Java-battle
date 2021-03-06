class Outer{		// 定义外部类
	private String info = "hello world" ;	// 定义外部类的私有属性
	public void fun(){						// 定义外部类的方法
		new Inner(this).print() ;				// 通过内部类的实例化对象调用方法
	}
	public String getInfo(){				// 增加了一个getter方法取得info内容
		return this.info ;	
	}
};
class Inner{	// 定义内部类
	private Outer out = null ;				// 声明Outer对象
	public Inner(Outer out){
		this.out = out ;
	}
	public void print(){				// 定义内部类的方法
		System.out.println(this.out.getInfo()) ;		// 直接访问外部类的私有属性
	}
};
public class InnerClassDemo02{
	public static void main(String args[]){
		new Outer().fun() ;					// 调用外部类的fun()方法
	}
};