interface Fruit{	// ����һ��ˮ���ӿ�
	public void eat() ;	// ��ˮ��
}
class Apple implements Fruit{
	public void eat(){
		System.out.println("** ��ƻ����") ;
	}
};
class Orange implements Fruit{
	public void eat(){
		System.out.println("** �����ӡ�") ;
	}
};
public class InterfaceCaseDemo03{
	public static void main(String args[]){
		Fruit f = new Apple() ;	// ʵ�����ӿ�
		f.eat() ;
	}
};