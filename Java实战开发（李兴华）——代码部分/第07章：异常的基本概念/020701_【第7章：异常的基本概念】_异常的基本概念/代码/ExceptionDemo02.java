public class ExceptionDemo02{
	public static void main(String args[]){
		System.out.println("********** ���㿪ʼ ***********") ;
		int i = 10 ;		// �������ͱ���
		int j = 0 ;			// �������ͱ���
		try{
			int temp = i / j ;	// �˴��������쳣
			System.out.println("������������Ľ����" + temp) ;
			System.out.println("----------------------------") ;
		}catch(ArithmeticException e){
			System.out.println("�����쳣�ˣ�" + e) ;
		}
		System.out.println("********** ������� ***********") ;
	}
};