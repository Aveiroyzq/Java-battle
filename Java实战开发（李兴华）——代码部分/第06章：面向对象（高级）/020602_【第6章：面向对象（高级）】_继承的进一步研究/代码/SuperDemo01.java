class Person{					// ����Person��
	private String name ;		// ����name����
	private int age ;			// ����age����
	public Person(String name,int age){
		this.setName(name) ;
		this.setAge(age) ;
	}
	public void setName(String name){
		this.name = name;	
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
	public String getInfo(){
		return "������" + this.getName() + "�����䣺" + this.getAge() ;
	}
};
class Student extends Person{					// ����Student��
	private String school ;		// ����school����
	public Student(String name,int age,String school){
		super(name,age) ;	// ��ȷ���ø����������������Ĺ���
		this.school = school ;
	}
	public void setSchool(String school){
		this.school = school ;
	}
	public String getSchool(){
		return this.school ;
	}
	public String getInfo(){
		return super.getInfo() + "��ѧУ��" + this.getSchool() ;
	} 

};
public class SuperDemo01{
	public static void main(String arsg[]){
		Student stu = new Student("����",30,"�廪��ѧ")	;// ʵ�����������
		System.out.println(stu.getInfo()) ;
	}
};
