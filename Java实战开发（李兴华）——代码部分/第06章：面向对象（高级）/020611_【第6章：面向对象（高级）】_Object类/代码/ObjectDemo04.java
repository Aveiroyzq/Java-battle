interface A{
	public String getInfo();	
}
class B implements A{
	public String getInfo(){	// ��д����
		return "Hello World!!!" ;
	}
};
public class ObjectDemo04{
	public static void main(String args[]){
		A a = new B() ;	// ����ת�ͣ�Ϊ�ӿ�ʵ����
		Object obj = a ;	// ʹ��Object���գ�����ת��
		A x = (A)obj ;	// ����ת��
		System.out.println(x.getInfo()) ;
	}
};