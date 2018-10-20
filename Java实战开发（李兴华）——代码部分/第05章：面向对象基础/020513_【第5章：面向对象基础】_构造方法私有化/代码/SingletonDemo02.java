class Singleton{
	private Singleton(){		// 将构造方法进行了封装，私有化	
	}
	public void print(){
		System.out.println("Hello World!!!") ;
	}
};
public class SingletonDemo02{
	public static void main(String args[]){
		Singleton s1 = null ;	// 声明对象
		s1 = new Singleton() ;	// 错误，无法实例化对象
	}
};