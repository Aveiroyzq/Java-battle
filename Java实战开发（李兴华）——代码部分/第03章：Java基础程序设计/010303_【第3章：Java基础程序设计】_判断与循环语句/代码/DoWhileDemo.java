public class DoWhileDemo{
	// ���һ����������Ĺ���
	public static void main(String args[]){
		int x = 1; 
		int sum = 0 ;	// �����ۼӵĽ��
		do{
			sum += x ;	// ִ���ۼӲ���
			x++ ;
		}while(x<=10) ;
		System.out.println("1 --> 10 �ۼӵĽ��Ϊ��" + sum) ;
	}
};