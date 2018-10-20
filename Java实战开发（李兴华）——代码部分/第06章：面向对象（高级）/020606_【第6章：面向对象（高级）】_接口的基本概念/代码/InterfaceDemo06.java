interface A{		// 定义接口A
	public String AUTHOR = "李兴华" ;	// 全局常量
	public void printA() ;	// 抽象方法
}
interface B{
	public void printB() ;
}
interface C extends A,B{
	public void printC() ;
}
class X implements C{	// X类线继承B类
	public void printA(){
		System.out.println("A、Hello World!!!") ;
	}
	public void printB(){
		System.out.println("B、Hello MLDN") ;
	}
	public void printC(){
		System.out.println("C、Hello LXH") ;
	}
};
public class InterfaceDemo06{
	public static void main(String args[]){
		X x = new X() ;	// 实例化子类对象
		x.printA() ;
		x.printB() ;
		x.printC() ;
	}
};