interface A{		// 定义接口A
	public String AUTHOR = "李兴华" ;	// 全局常量
	public void print() ;	// 抽象方法
	public String getInfo() ;	// 抽象方法
}
interface B{	// 定义接口B
	public void say() ;	// 定义抽象方法
}
class X implements A,B{	// X类同时实现A和B两个接口
	public void say(){
		System.out.println("Hello World!!!") ;
	}
	public String getInfo(){
		return "HELLO" ;
	}
	public void print(){
		System.out.println("作者：" + AUTHOR) ;
	}
};
public class InterfaceDemo03{
	public static void main(String args[]){
		X x = new X() ;	// 实例化子类对象
		x.say() ;
		x.print() ;
	}
};