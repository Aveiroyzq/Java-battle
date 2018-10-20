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
public class InterfaceCaseDemo03{
	public static void main(String args[]){
		Fruit f = new Apple() ;	// 实例化接口
		f.eat() ;
	}
};