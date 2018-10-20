import java.util.Map ;
import java.util.HashMap ;
class Person{
	private String name ;
	private int age ;
	public Person(String name,int age){
		this.name = name ;
		this.age = age ;
	}
	public String toString(){
		return "姓名：" + this.name + "；年龄：" + this.age ;
	}
};
public class HashMapDemo06{
	public static void main(String args[]){
		Map<Person,String> map = null ;
		map = new HashMap<Person,String>() ;
		map.put(new Person("张三",30),"zhangsan");	// 增加内容
		System.out.println(map.get(new Person("张三",30))) ;
	}
};