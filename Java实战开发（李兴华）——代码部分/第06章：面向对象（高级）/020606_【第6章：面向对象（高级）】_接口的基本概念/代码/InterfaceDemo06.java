interface A{		// ����ӿ�A
	public String AUTHOR = "���˻�" ;	// ȫ�ֳ���
	public void printA() ;	// ���󷽷�
}
interface B{
	public void printB() ;
}
interface C extends A,B{
	public void printC() ;
}
class X implements C{	// X���߼̳�B��
	public void printA(){
		System.out.println("A��Hello World!!!") ;
	}
	public void printB(){
		System.out.println("B��Hello MLDN") ;
	}
	public void printC(){
		System.out.println("C��Hello LXH") ;
	}
};
public class InterfaceDemo06{
	public static void main(String args[]){
		X x = new X() ;	// ʵ�����������
		x.printA() ;
		x.printB() ;
		x.printC() ;
	}
};