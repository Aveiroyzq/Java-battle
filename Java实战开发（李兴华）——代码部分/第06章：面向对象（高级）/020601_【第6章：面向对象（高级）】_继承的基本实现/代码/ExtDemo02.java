class Person{					// ����Person��
	private String name ;		// ����name����
	private int age ;			// ����age����
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
	// �˴�������κεĴ���
};
public class ExtDemo02{
	public static void main(String arsg[]){
		Student stu = new Student()	;// ʵ�����������
		stu.setName("����") ;	// �˷�����Student����û����ȷ����
		stu.setAge(30) ;
		System.out.println("������" + stu.getName() + "�����䣺" + stu.getAge() ) ;
	}
};
