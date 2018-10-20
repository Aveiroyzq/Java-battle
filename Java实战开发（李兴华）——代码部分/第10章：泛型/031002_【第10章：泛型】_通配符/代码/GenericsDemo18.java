class Info<T>{
	private T var ;		// 定义泛型变量
	public void setVar(T var){
		this.var = var ;
	}
	public T getVar(){
		return this.var ;
	}
	public String toString(){	// 直接打印
		return this.var.toString() ;
	}
};
public class GenericsDemo18{
	public static void main(String args[]){
		Info<String> i1 = new Info<String>() ;		// 声明String的泛型对象
		i1.setVar("hello") ;
		fun(i1) ;
	}
	public static void fun(Info<? extends Number> temp){	// 只能接收Number及其Number的子类
		System.out.print(temp + "、") ;
	}
};