class Person{
	String name ;		// ������������
	int age ;			// ������������
	public void tell(){	// ȡ����Ϣ
		System.out.println("������" + name + "�����䣺" + age) ;
	}
};
public class ClassDemo05{
	public static void main(String args[]){
		Person per1 = null ;		// ����per1����
		Person per2 = null ;		// ����per2����
		per1 = new Person() ;		// ֻʵ����per1һ������
		per2 = per1 ;				// ��per1�Ķ��ڴ�ռ�ʹ��Ȩ��per2
		per1.name = "����" ;		// ����per1�е�name��������
		per1.age = 30 ;				// ����per1�е�age��������
		// ����per2��������ݣ�ʵ���Ͼ�������per1���������
		per2.age = 33 ;				// ����per2�е�age��������
		System.out.print("per1�����е����� --> ") ;
		per1.tell() ;				// �������еķ���
		System.out.print("per2�����е����� --> ") ;
		per2.tell() ;				// �������еķ���
	}
};