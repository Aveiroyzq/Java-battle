abstract class Person{
	private String name ;		// ����name����
	private int age ;			// ����age����
	public Person(String name,int age){
		this.name = name ;
		this.age = age ;
	}
	public void setName(String name){
		this.name = name ;
	}
	public void setAge(int age){
		this.age = age ;
	}
	public String getName(){
		return this.name ;
	}
	public int getAge(){
		return this.age ;
	}
	public abstract String getInfo() ;	// ���󷽷�
};
class Student extends Person{
	private String school ;
	public Student(String name,int age,String school){
		super(name,age) ;	// ָ��Ҫ���ó������������������Ĺ��췽��
		this.school = school ;
	}
	public void setSchool(String school){
		this.school = school ;
	}
	public String getSchool(){
		return this.school ;
	}
	public String getInfo(){
		return	"������" + super.getName()  + 
				"�����䣺" + super.getAge() + 
				"��ѧУ��" + this.getSchool() ;
	}
};
public class AbstractDemo04{
	public static void main(String args[]){
		Student stu = new Student("����",30,"�廪��ѧ") ;
		System.out.println(stu.getInfo()) ;
	}
};