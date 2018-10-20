class Singleton{
	private static Singleton instance = new Singleton() ;	// ���ڲ����������ʵ��������
	public static Singleton getInstance(){		// ͨ����̬����ȡ��instance����
		return instance ;
	}
	private Singleton(){		// �����췽�������˷�װ��˽�л�	
	}
	public void print(){
		System.out.println("Hello World!!!") ;
	}
};
public class SingletonDemo05{
	public static void main(String args[]){
		Singleton s1 = null ;	// ��������
		s1 = Singleton.getInstance() ;	// ȡ��ʵ��������
		s1.print() ;		// ���÷���
	}
};