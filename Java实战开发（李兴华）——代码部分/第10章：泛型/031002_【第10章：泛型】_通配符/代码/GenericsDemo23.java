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
public class GenericsDemo23{
	public static void main(String args[]){
		Info<String> i1 = new Info<String>() ;		// 泛型类型为String
		Info<Object> i2 = null ;
		i2 = i1 ;
	}
};