class Person{
	public Person(){		// �������췽��
		System.out.println("һ���µ�Person���������") ;
	}
};
public class ConsDemo01{
	public static void main(String args[]){
		System.out.println("��������Person per = null ;") ;
		Person per = null ;	// ��������ʱ����ȥ���ù��췽��
		System.out.println("ʵ��������per = new Person() ;") ;
		per = new Person() ;//ʵ��������
	}
};