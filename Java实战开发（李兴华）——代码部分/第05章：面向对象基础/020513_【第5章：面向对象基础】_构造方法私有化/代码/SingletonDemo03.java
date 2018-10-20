class Singleton{
	Singleton instance = new Singleton() ;	// 在内部产生本类的实例化对象
	private Singleton(){		// 将构造方法进行了封装，私有化	
	}
	public void print(){
		System.out.println("Hello World!!!") ;
	}
};
public class SingletonDemo03{
	public static void main(String args[]){
		Singleton s1 = null ;	// 声明对象
	}
};