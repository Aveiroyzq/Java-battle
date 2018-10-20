class Person{};
public class ClassLoaderDemo{
	public static void main(String args[]){
		Person stu = new Person() ;
		System.out.println("Àà¼ÓÔØÆ÷£º" + stu.getClass().getClassLoader().getClass().getName()) ;
	}
};