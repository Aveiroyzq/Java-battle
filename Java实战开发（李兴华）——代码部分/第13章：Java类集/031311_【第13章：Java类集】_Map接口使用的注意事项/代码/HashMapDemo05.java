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
public class HashMapDemo05{
	public static void main(String args[]){
		Map<String,Person> map = null ;
		map = new HashMap<String,Person>() ;
		map.put("zhangsan",new Person("张三",30));	// 增加内容
		System.out.println(map.get("zhangsan")) ;
	}
};