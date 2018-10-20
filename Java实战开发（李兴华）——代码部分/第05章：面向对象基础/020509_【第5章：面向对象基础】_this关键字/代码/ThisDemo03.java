class Person{		// 定义Person类
	private String name ;		// 姓名
	private int age ;			// 年龄
	public Person(){	// 无参构造
		System.out.println("新对象实例化") ;
	}
	public Person(String name){
		System.out.println("新对象实例化") ;
		this.name = name ;
	}
	public Person(String name,int age){	// 通过构造方法赋值
		System.out.println("新对象实例化") ;
		this.name = name ; // 为类中的name属性赋值
		this.age = age ;// 为类中的age属性赋值
	}
	public String getInfo(){	// 取得信息的方法
		return "姓名：" + name + "，年龄：" + age ;
	}
};
public class ThisDemo03{
	public static void main(String args[]){
		Person per1 = new Person("张三",33) ;	// 调用构造实例化对象
		System.out.println(per1.getInfo()) ;	// 取得信息
	}
};