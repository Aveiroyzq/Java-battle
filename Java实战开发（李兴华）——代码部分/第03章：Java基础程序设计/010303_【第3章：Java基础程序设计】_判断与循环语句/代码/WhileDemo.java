public class WhileDemo{
	// ���һ����������Ĺ���
	public static void main(String args[]){
		int x = 1; 
		int sum = 0 ;	// �����ۼӵĽ��
		while(x<=10){
			sum += x ;	// �����ۼӲ���
			// x++ ;		// �޸�ѭ������
		}
		System.out.println("1 --> 10 �ۼӵĽ��Ϊ��" + sum) ;
	}
};