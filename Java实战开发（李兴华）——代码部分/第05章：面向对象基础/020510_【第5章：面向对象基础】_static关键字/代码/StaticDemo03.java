class Person{	// ����Person��
	String name ;		// ����name���ԣ���ʱ����װ
	int age ;			// ����age���ԣ���ʱ����װ
	static String country = "A��" ;	// ����������ԣ���Ĭ��ֵ��static
	public Person(String name,int age){
		this.name = name ;
		this.age = age; 
	}
	public void info(){	// �õ���Ϣ
		System.out.println("������" + this.name + "�����䣺" + this.age + "�����У�" + country) ;
	}
};
public class StaticDemo03{

	public static void main(String args[]){
		
		Person p1 = new Person("����",30) ;	 // ʵ��������
		Person p2 = new Person("����",31) ;	 // ʵ��������
		Person p3 = new Person("����",32) ;	 // ʵ��������
		System.out.println("--------------- �޸�֮ǰ -------------") ;
		p1.info() ;
		p2.info() ;
		p3.info() ;
		Person.country = "B��" ;
		System.out.println("--------------- �޸�֮�� -------------") ;
		p1.info() ;
		p2.info() ;
		p3.info() ;
	}
};