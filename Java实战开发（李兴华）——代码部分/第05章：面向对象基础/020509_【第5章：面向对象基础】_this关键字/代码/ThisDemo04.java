class Person{		// ����Person��
	private String name ;		// ����
	private int age ;			// ����
	public Person(){	// �޲ι���
		System.out.println("�¶���ʵ����") ;
	}
	public Person(String name){
		this.name = name ;
		this() ;// ���ñ����е��޲ι��췽��
	}
	public Person(String name,int age){	// ͨ�����췽����ֵ
		this(name) ;// ������һ�������Ĺ��췽��
		this.age = age ;// Ϊ���е�age���Ը�ֵ
	}
	public String getInfo(){	// ȡ����Ϣ�ķ���\
		this() ;// ���ñ����е��޲ι��췽��
		return "������" + name + "�����䣺" + age ;
	}
};
public class ThisDemo04{
	public static void main(String args[]){
		Person per1 = new Person("����",33) ;	// ���ù���ʵ��������
		System.out.println(per1.getInfo()) ;	// ȡ����Ϣ
	}
};