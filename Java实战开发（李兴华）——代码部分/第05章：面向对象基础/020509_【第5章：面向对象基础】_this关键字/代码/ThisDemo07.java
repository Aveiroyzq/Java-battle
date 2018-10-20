class Person{		// 定义Person类
	private String name ;	// 姓名
	private int age ;		// 年龄
	public Person(String name,int age){
		this.setName(name) ;
		this.setAge(age) ;
	}
	public void setName(String name){	// 设置姓名
		this.name = name ;
	}
	public void setAge(int age){		// 设置年龄
		this.age = age ;
	}
	public String getName(){
		return this.name ;
	}
	public int getAge(){
		return this.age ;
	}
};
public class ThisDemo07{
	public static void main(String args[]){
		Person per1 = new Person("张三",30) ;	// 声明两个对象，内容完全相等
		Person per2 = new Person("张三",30) ;	// 声明两个对象，内容完全相等
		// 直接在主方法中依次取得各个属性进行比较
		if(per1.getName().equals(per2.getName())&&per1.getAge()==per2.getAge()){
			System.out.println("两个对象相等！") ;
		}else{
			System.out.println("两个对象不相等！") ;
		}
	}
};