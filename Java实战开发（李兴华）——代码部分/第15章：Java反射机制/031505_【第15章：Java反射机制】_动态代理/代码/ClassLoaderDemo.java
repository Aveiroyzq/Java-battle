class Person{};
public class ClassLoaderDemo{
	public static void main(String args[]){
		Person stu = new Person() ;
		System.out.println("���������" + stu.getClass().getClassLoader().getClass().getName()) ;
	}
};