class Demo{
	int temp = 30 ;		// �˴�Ϊ�˷��㣬������ʱ����װ
};
public class RefDemo01{
	public static void main(String args[]){
		Demo d1 = new Demo() ;	// ʵ����Demo����ʵ����֮�������temp=30 
		d1.temp = 50 ;		// �޸�temp���Ե�����
		System.out.println("fun()��������֮ǰ��" + d1.temp) ;
		fun(d1) ;
		System.out.println("fun()��������֮��" + d1.temp) ;
	}
	public static void fun(Demo d2){		// �˴��ķ�����������ֱ�ӵ���
		d2.temp = 1000;						// �޸�tempֵ
	}
};