class Singleton{
	Singleton instance = new Singleton() ;	// ���ڲ����������ʵ��������
	private Singleton(){		// �����췽�������˷�װ��˽�л�	
	}
	public void print(){
		System.out.println("Hello World!!!") ;
	}
};
public class SingletonDemo03{
	public static void main(String args[]){
		Singleton s1 = null ;	// ��������
	}
};