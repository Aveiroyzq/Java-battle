public class ExceptionDemo04{
	public static void main(String args[]){
		System.out.println("********** ���㿪ʼ ***********") ;
		int i = 0 ;		// �������ͱ���
		int j = 0 ;			// �������ͱ���
		try{
			String str1 = args[0] ;		// ���յ�һ������
			String str2 = args[1] ;		// ���յڶ�������
			i = Integer.parseInt(str1) ;	// ����һ���������ַ�����Ϊ����
			j = Integer.parseInt(str2) ;	// ���ڶ����������ַ�����Ϊ����
			int temp = i / j ;	// �˴��������쳣
			System.out.println("������������Ľ����" + temp) ;
			System.out.println("----------------------------") ;
		}catch(ArithmeticException e){	// ���������쳣
			System.out.println("�����쳣�ˣ�" + e) ;
		}
		System.out.println("********** ������� ***********") ;
	}
};