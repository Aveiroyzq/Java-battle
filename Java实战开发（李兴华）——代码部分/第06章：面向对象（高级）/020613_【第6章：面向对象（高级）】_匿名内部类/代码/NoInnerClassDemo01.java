interface A{
	public void printInfo() ;	// 
}
class B implements A{	// ʵ�ֽӿ�
	public void printInfo(){
		System.out.println("Hello World!!!") ;
	}
};
class X {
	public void fun1(){
		this.fun2(new B()) ;
	}
	public void fun2(A a){
		a.printInfo() ;
	}
};
public class NoInnerClassDemo01{
	public static void main(String args[]){
		new X().fun1() ;		// ʵ����X��Ķ��󣬲�����fun1()����
	}
};