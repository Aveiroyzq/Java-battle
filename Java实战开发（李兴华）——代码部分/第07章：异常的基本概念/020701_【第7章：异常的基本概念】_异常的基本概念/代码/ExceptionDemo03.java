public class ExceptionDemo03{
	public static void main(String args[]){
		System.out.println("********** ���㿪ʼ ***********") ;
		int i = 10 ;		// �������ͱ���
		int j = 0 ;			// �������ͱ���
		try{
			int temp = i / j ;	// �˴��������쳣
			System.out.println("������������Ľ����" + temp) ;
			System.out.println("----------------------------") ;
		}catch(ArithmeticException e){	// ���������쳣
			System.out.println("�����쳣�ˣ�" + e) ;
		}finally{	// ��Ϊ�쳣��ͳһ����
			System.out.println("�����Ƿ�����쳣����ִ�д˴���") ;
		}
		System.out.println("********** ������� ***********") ;
	}
};