class Person{		// ����Person��
	private String name ;		// ����
	private int age ;			// ����
	public Person(){	// �޲ι���
		System.out.println("�¶���ʵ����") ;
	}
	public Person(String name){
		System.out.println("�¶���ʵ����") ;
		this.name = name ;
	}
	public Person(String name,int age){	// ͨ�����췽����ֵ
		System.out.println("�¶���ʵ����") ;
		this.name = name ; // Ϊ���е�name���Ը�ֵ
		this.age = age ;// Ϊ���е�age���Ը�ֵ
	}
	public String getInfo(){	// ȡ����Ϣ�ķ���
		return "������" + name + "�����䣺" + age ;
	}
};
public class ThisDemo03{
	public static void main(String args[]){
		Person per1 = new Person("����",33) ;	// ���ù���ʵ��������
		System.out.println(per1.getInfo()) ;	// ȡ����Ϣ
	}
};