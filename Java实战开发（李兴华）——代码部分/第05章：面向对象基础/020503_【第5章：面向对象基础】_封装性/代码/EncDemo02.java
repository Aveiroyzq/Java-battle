class Person{
	private String name ;			// ������������
	private int age ;				// ������������
	public void tell(){
		System.out.println("������" + name + "�����䣺" + age) ;
	}
};
public class EncDemo02{
	public static void main(String arsgh[]){
		Person per = new Person() ;	// ������ʵ��������
		per.name = "����" ;			// Ϊname���Ը�ֵ
		per.age = -30 ;				// Ϊage���Ը�ֵ
		per.tell() ;
	}
};