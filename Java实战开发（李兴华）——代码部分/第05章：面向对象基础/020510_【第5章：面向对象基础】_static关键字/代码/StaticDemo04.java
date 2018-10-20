class Person{	// 定义Person类
	private String name ;		// 定义name属性，暂时不封装
	private int age ;			// 定义age属性，暂时不封装
	private static String country = "A城" ;	// 定义城市属性，有默认值，static
	public static void setCountry(String c){ // 此方法可以直接由类名称调用
		country = c ;
	}
	public static String getCountry(){
		return country ;
	}
	public Person(String name,int age){
		this.name = name ;
		this.age = age; 
	}
	public void info(){	// 得到信息
		System.out.println("姓名：" + this.name + "，年龄：" + this.age + "，城市：" + country) ;
	}
};
public class StaticDemo04{
	public static void main(String args[]){
		Person p1 = new Person("张三",30) ;	 // 实例化对象
		Person p2 = new Person("李四",31) ;	 // 实例化对象
		Person p3 = new Person("王五",32) ;	 // 实例化对象
		System.out.println("--------------- 修改之前 -------------") ;
		p1.info() ;
		p2.info() ;
		p3.info() ;
		Person.setCountry("B城") ;		// 调用静态方法修改static属性的内容
		System.out.println("--------------- 修改之后 -------------") ;
		p1.info() ;
		p2.info() ;
		p3.info() ;
	}
};