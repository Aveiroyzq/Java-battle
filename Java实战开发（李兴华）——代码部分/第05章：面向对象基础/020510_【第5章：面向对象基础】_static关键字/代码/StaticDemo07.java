class Demo{	// ����Person��
	private String name ;			// ��������
	private static int count = 0 ;	// ���ж����������
	public Demo(){
		count++ ;					// �ж������������
		this.name = "DEMO-" + count ;	// �Զ����б�������
	} 
	public Demo(String name){
		this.name = name;			// ����ͨ�����츳ֵ
	}
	public String getName(){		// ȡ������
		return this.name ;
	}
};
public class StaticDemo07{
	public static void main(String args[]){
		System.out.println(new Demo().getName()) ;
		System.out.println(new Demo("LXH").getName()) ;
		System.out.println(new Demo().getName()) ;
		System.out.println(new Demo("MLDN").getName()) ;
		System.out.println(new Demo().getName()) ;
	}
};