class Person{		// ����Person��
	private String name ;		// ����
	private int age ;			// ����
	public Person(String name,int age){	// ͨ�����췽����ֵ
		name = name ;
		age = age ;
	}
	public String getInfo(){	// ȡ����Ϣ�ķ���
		return "������" + name + "�����䣺" + age ;
	}
};
public class ThisDemo01{
	public static void main(String args[]){
		Person per1 = new Person("����",33) ;	// ���ù���ʵ��������
		System.out.println(per1.getInfo()) ;	// ȡ����Ϣ
	}
};