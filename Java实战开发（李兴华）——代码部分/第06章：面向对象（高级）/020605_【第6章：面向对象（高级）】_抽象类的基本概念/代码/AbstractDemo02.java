abstract class A{	// �Ƕ�����һ��������
	public static final String FLAG = "CHINA" ;	// ȫ�ֳ���
	private String name = "���˻�" ;	// ����һ����ͨ������
	public void setName(String name){
		this.name = name ;
	}
	public String getName(){
		return this.name ;
	}
	public abstract void print() ;		// ������󷽷�
};
class B extends A{	// �̳г����࣬��ΪB����ͨ�࣬���Ա��븲дȫ�����󷽷�
	public void print(){
		System.out.println("FLAG = " + FLAG) ;
		System.out.println("���� = " + super.getName()) ;
	}
};
public class AbstractDemo02{
	public static void main(String args[]){
		B b = new B() ;
		b.print() ;
	}
};