interface A{
	public void printInfo() ;	// 
}
class X {
	public void fun1(){
		this.fun2(new A(){
				public void printInfo(){
					System.out.println("Hello World!!!") ;
				}
			}
			) ;
	}
	public void fun2(A a){
		a.printInfo() ;
	}
};
public class NoInnerClassDemo02{
	public static void main(String args[]){
		new X().fun1() ;		// 实例化X类的对象，并调用fun1()方法
	}
};