public class NewDemo01{
	public static void main(String args[]){
		System.out.print("�����ݲ�����fun()����") ;
		fun() ;			// �����ݲ���
		System.out.print("\n����һ��������fun(1)����") ;
		fun(1) ;		// ����һ������
		System.out.print("\n�������������fun(1,2,3,4,5)����") ;
		fun(1,2,3,4,5) ;
	}
	public static void fun(int ... arg){	// �ɱ����
		for(int i=0;i<arg.length;i++){		// ѭ�����
			System.out.print(arg[i] + "��") ;
		}
	}
};