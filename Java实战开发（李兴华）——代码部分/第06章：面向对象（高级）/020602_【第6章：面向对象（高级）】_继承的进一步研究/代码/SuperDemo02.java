class Person{					// ����Person��
	private String name ;		// ����name����
	private int age ;			// ����age����
	public Person(String name,int age){
		this.name = name ;
		this.age = age ;
	}
};
class Student extends Person{					// ����Student��
	private String school ;		// ����school����
	public Student(){
		// this("LXH",30,"MLDN") ;
		// ���ڴ˴����ø���Ĺ��죬Ĭ�ϵ��õ����޲�
	}
	public Student(String name,int age){
		this() ;
	}
	public Student(String name,int age,String school){
		this(name,age) ;	// ��ȷ���ø����������������Ĺ���
		this.school = school ;
	}
};
public class SuperDemo02{
	public static void main(String arsg[]){
		Student stu = new Student("����",30,"�廪��ѧ")	;// ʵ�����������
		System.out.println(stu.getInfo()) ;
	}
};
