class Person{
	String name ;		// ������������
	int age ;			// ������������
	public void tell(){	// ȡ����Ϣ
		System.out.println("������" + name + "�����䣺" + age) ;
	}
};
public class ClassDemo03{
	public static void main(String args[]){
		Person per = null ;		// ��������
		//per = new Person() ;	// ʵ��������
		per.name = "����" ;		// Ϊ������ֵ
		per.age = 30 ;			// Ϊ���丳ֵ
		per.tell() ;			// ���÷�������ӡ��Ϣ
	}
};