class Person{
	private String name ;	// ����name����
	private int age ;		// ����age����
	public Person(String name,int age){
		this.name = name ;
		this.age = age ;
	}
	public boolean equals(Object obj){
		if(this==obj){		// ��ַ���
			return true ;	// �϶���ͬһ������
		}
		if(!(obj instanceof Person)){	// ����Person����
			return false ;
		}
		Person per = (Person) obj ;	// ����ת��
		if(per.name.equals(this.name)&&per.age == this.age){
			return true ;	// ���αȽ�����
		}else{
			return false ;
		}
	}
	public String toString(){
		return "������" + this.name + "�����䣺" + this.age ;
	}
};
public class ObjectDemo03{
	public static void main(String args[]){
		Person per1 = new Person("���˻�",30) ;	 // ʵ����Person
		Person per2 = new Person("���˻�",30) ;	 // ʵ����Person
		System.out.println(per1.equals(per2)?"��ͬһ���ˣ�" : "����ͬһ���ˣ�") ;
		System.out.println(per1.equals("hello")?"��ͬһ���ˣ�" : "����ͬһ���ˣ�") ;
		
	}
};