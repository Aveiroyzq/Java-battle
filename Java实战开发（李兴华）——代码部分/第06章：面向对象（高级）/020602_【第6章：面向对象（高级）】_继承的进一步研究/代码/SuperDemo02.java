class Person{					// 定义Person类
	private String name ;		// 定义name属性
	private int age ;			// 定义age属性
	public Person(String name,int age){
		this.name = name ;
		this.age = age ;
	}
};
class Student extends Person{					// 定义Student类
	private String school ;		// 定义school属性
	public Student(){
		// this("LXH",30,"MLDN") ;
		// 会在此处调用父类的构造，默认调用的是无参
	}
	public Student(String name,int age){
		this() ;
	}
	public Student(String name,int age,String school){
		this(name,age) ;	// 明确调用父类中有两个参数的构造
		this.school = school ;
	}
};
public class SuperDemo02{
	public static void main(String arsg[]){
		Student stu = new Student("张三",30,"清华大学")	;// 实例化子类对象
		System.out.println(stu.getInfo()) ;
	}
};
