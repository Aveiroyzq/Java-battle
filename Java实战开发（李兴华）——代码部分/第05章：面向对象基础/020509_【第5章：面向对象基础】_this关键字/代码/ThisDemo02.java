class Person{		// ����Person��
	private String name ;		// ����
	private int age ;			// ����
	public Person(String name,int age){	// ͨ�����췽����ֵ
		this.name = name ; // Ϊ���е�name���Ը�ֵ
		this.age = age ;// Ϊ���е�age���Ը�ֵ
	}
	public String getInfo(){	// ȡ����Ϣ�ķ���
		return "������" + name + "�����䣺" + age ;
	}
};
public class ThisDemo02{
	public static void main(String args[]){
		Person per1 = new Person("����",33) ;	// ���ù���ʵ��������
		System.out.println(per1.getInfo()) ;	// ȡ����Ϣ
	}
};