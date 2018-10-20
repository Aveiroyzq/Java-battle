class Demo{	// 定义Person类
	private String name ;			// 保存名字
	private static int count = 0 ;	// 所有对象共享此属性
	public Demo(){
		count++ ;					// 有对象产生就自增
		this.name = "DEMO-" + count ;	// 自动进行编名操作
	} 
	public Demo(String name){
		this.name = name;			// 可以通过构造赋值
	}
	public String getName(){		// 取得姓名
		return this.name ;
	}
};
public class StaticDemo07{
	public static void main(String args[]){
		System.out.println(new Demo().getName()) ;
		System.out.println(new Demo("LXH").getName()) ;
		System.out.println(new Demo().getName()) ;
		System.out.println(new Demo("MLDN").getName()) ;
		System.out.println(new Demo().getName()) ;
	}
};