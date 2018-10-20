class Person{	// ����Person��
	private String name ;		// ����name���ԣ���ʱ����װ
	private int age ;			// ����age���ԣ���ʱ����װ
	private static String country = "A��" ;	// ����������ԣ���Ĭ��ֵ��static
	public static void setCountry(String c){ // �˷�������ֱ���������Ƶ���
		country = c ;
	}
	public static String getCountry(){
		return country ;
	}
	public Person(String name,int age){
		this.name = name ;
		this.age = age; 
	}
	public void info(){	// �õ���Ϣ
		System.out.println("������" + this.name + "�����䣺" + this.age + "�����У�" + country) ;
	}
};
public class StaticDemo04{
	public static void main(String args[]){
		Person p1 = new Person("����",30) ;	 // ʵ��������
		Person p2 = new Person("����",31) ;	 // ʵ��������
		Person p3 = new Person("����",32) ;	 // ʵ��������
		System.out.println("--------------- �޸�֮ǰ -------------") ;
		p1.info() ;
		p2.info() ;
		p3.info() ;
		Person.setCountry("B��") ;		// ���þ�̬�����޸�static���Ե�����
		System.out.println("--------------- �޸�֮�� -------------") ;
		p1.info() ;
		p2.info() ;
		p3.info() ;
	}
};