interface A{		// ����ӿ�A
	public String AUTHOR = "���˻�" ;	// ȫ�ֳ���
	public void print() ;	// ���󷽷�
	public String getInfo() ;	// ���󷽷�
}
abstract class B{	// ���������B
	public abstract void say() ;	// ������󷽷�
}
class X extends B implements A{	// X���߼̳�B�࣬��ʵ��A�ӿ�
	public void say(){
		System.out.println("Hello World!!!") ;
	}
	public String getInfo(){
		return "HELLO" ;
	}
	public void print(){
		System.out.println("���ߣ�" + AUTHOR) ;
	}
};
public class InterfaceDemo04{
	public static void main(String args[]){
		X x = new X() ;	// ʵ�����������
		x.say() ;
		x.print() ;
	}
};