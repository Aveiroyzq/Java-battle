class Person{		// ����Person��
	public String getInfo(){	// ȡ����Ϣ�ķ���
		System.out.println("Person�� --> " + this) ; // ֱ�Ӵ�ӡthis
		return null ; // Ϊ�˱�֤�﷨��ȷ������null
	}
};
public class ThisDemo06{
	public static void main(String args[]){
		Person per1 = new Person() ;	// ���ù���ʵ��������
		Person per2 = new Person() ;	// ���ù���ʵ��������
		System.out.println("MAIN���� --> " + per1) ;	// ֱ�Ӵ�ӡ����
		per1.getInfo() ;	// ��ǰ����getInfo()�����Ķ�����per1
		System.out.println("MAIN���� --> " + per2) ;	// ֱ�Ӵ�ӡ����
		per2.getInfo() ;	// ��ǰ����getInfo()�����Ķ�����per2
	}
};