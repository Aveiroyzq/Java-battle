class Person{					// ����Person��
	private String name ;		// ����name����
	private int age ;			// ����age����
	public Person(){
		System.out.println("����Person�еĹ��졣") ;
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
};
class Student extends Person{					// ����Student��
	private String school ;		// ����school����
	public Student(){
		super() ;	// Ĭ������
		System.out.println("����Student�еĹ��졣") ;
	}
	public void setSchool(String school){
		this.school = school ;
	}
	public String getSchool(){
		return this.school ;
	}

};
public class InstanceDemo{
	public static void main(String arsg[]){
		Student stu = new Student()	;// ʵ�����������
		stu.setName("����") ;	// �˷�����Student����û����ȷ����
		stu.setAge(30) ;
		stu.setSchool("�廪��ѧ") ;
		System.out.println("������" + stu.getName() + "�����䣺" + stu.getAge() + "��ѧУ��" + stu.getSchool() ) ;
	}
};
