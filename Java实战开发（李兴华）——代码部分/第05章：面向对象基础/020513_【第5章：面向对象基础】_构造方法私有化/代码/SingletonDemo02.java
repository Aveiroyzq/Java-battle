class Singleton{
	private Singleton(){		// �����췽�������˷�װ��˽�л�	
	}
	public void print(){
		System.out.println("Hello World!!!") ;
	}
};
public class SingletonDemo02{
	public static void main(String args[]){
		Singleton s1 = null ;	// ��������
		s1 = new Singleton() ;	// �����޷�ʵ��������
	}
};