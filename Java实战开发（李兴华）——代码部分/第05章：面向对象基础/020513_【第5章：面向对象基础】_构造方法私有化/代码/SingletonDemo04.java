class Singleton{
	static Singleton instance = new Singleton() ;	// 在内部产生本类的实例化对象
	private Singleton(){		// 将构造方法进行了封装，私有化	
	}
	public void print(){
		System.out.println("Hello World!!!") ;
	}
};
public class SingletonDemo04{
	public static void main(String args[]){
		Singleton s1 = null ;	// 声明对象
		s1 = Singleton.instance ;	// 取得实例化对象
		s1.print() ;		// 调用方法
	}
};