class Person{		// ����Person��
	private String name ;		// ����
	private int age ;			// ����
	public Person(){	// �޲ι���
		this("LXH",30) ;	// ���������������Ĺ��췽��
		System.out.println("�¶���ʵ����") ;
	}
	public Person(String name){
		this() ;// ���ñ����е��޲ι��췽��
		this.name = name ;
	}
	public Person(String name,int age){	// ͨ�����췽����ֵ
		this(name) ;// ������һ�������Ĺ��췽��
		this.age = age ;// Ϊ���е�age���Ը�ֵ
	}
	public String getInfo(){	// ȡ����Ϣ�ķ���
		return "������" + name + "�����䣺" + age ;
	}
};
public class ThisDemo05{
	public static void main(String args[]){
		Person per1 = new Person("����",33) ;	// ���ù���ʵ��������
		System.out.println(per1.getInfo()) ;	// ȡ����Ϣ
	}
};