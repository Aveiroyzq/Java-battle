class Person{
	private String name ;		// 姓名属性
	public Person(String name){	// 通过构造方法设置内容
		this.name = name ;		// 为姓名赋值
	}
	public String getName(){
		return this.name ;		// 取得姓名
	}
};
public class ObjectArrayDemo02{
	public static void main(String args[]){
		// 声明一个对象数组，里面有三个对象，使用静态初始化方式完成
		Person per[] = {new Person("张三"),new Person("李四"),new Person("王五")} ;
		System.out.println("\n============== 数组输出 =================") ;
		for(int x=0;x<per.length;x++){	// 循环输出
			System.out.print(per[x].getName() + "、") ;	// 此时，已经实例化完成了，所以会直接打印出姓名
		}
	}
};