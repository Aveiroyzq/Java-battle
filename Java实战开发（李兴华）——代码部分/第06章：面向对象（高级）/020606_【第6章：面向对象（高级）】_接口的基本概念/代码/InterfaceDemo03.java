interface A{		// ����ӿ�A
	public String AUTHOR = "���˻�" ;	// ȫ�ֳ���
	public void print() ;	// ���󷽷�
	public String getInfo() ;	// ���󷽷�
}
interface B{	// ����ӿ�B
	public void say() ;	// ������󷽷�
}
class X implements A,B{	// X��ͬʱʵ��A��B�����ӿ�
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
public class InterfaceDemo03{
	public static void main(String args[]){
		X x = new X() ;	// ʵ�����������
		x.say() ;
		x.print() ;
	}
};