public class ExceptionDemo05{
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
			// System.out.println("�����쳣��" + e) ;
			e.printStackTrace() ;
		}catch(NumberFormatException e){	// ��������ת���쳣
			System.out.println("����ת���쳣��" + e);
		}catch(ArrayIndexOutOfBoundsException e){	// ��������Խ���쳣
			System.out.println("����Խ���쳣��" + e) ;
		}
		System.out.println("********** ������� ***********") ;
	}
};