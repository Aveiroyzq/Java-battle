class Person{
	private String name ;	// ����name����
	private int age ;		// ����age����
	public Person(String name,int age){
		this.name = name ;
		this.age = age ;
	}
	public String toString(){
		return "������" + this.name + "�����䣺" + this.age ;
	}
};
public class ObjectDemo02{
	public static void main(String args[]){
		Person per = new Person("���˻�",30) ;	 // ʵ����Person
		System.out.println("������Ϣ��" + per) ;
	}
};