interface Fruit{	// 定义一个水果接口
	public void eat() ;	// 吃水果
}
class Apple implements Fruit{
	public void eat(){
		System.out.println("** 吃苹果。") ;
	}
};
class Orange implements Fruit{
	public void eat(){
		System.out.println("** 吃橘子。") ;
	}
};
class Factory{	// 定义工厂类
	public static Fruit getInstance(String className){
		Fruit f = null ;
		if("apple".equals(className)){	// 判断是否要的是苹果的子类
			f = new Apple() ;
		}
		if("orange".equals(className)){	// 判断是否要的是橘子的子类
			f = new Orange() ;
		}
		return f ;
	}
};
public class InterfaceCaseDemo05{
	public static void main(String args[]){
		Fruit f = Factory.getInstance(args[0]) ;	// 实例化接口
		if(f!=null){	// 判断是否取得实例
			f.eat() ;
		}
	}
};