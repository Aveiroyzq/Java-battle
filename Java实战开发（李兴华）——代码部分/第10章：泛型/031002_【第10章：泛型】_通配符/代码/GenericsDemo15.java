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
public class GenericsDemo15{
	public static void main(String args[]){
		Info<?> i = new Info<String>() ;		// 使用String为泛型类型
		i.setVar("MLDN") ;							// 设置内容
	}
};