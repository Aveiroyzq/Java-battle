public class ThrowDemo01{
	public static void main(String args[]){
		try{
			throw new Exception("�Լ�������ġ�") ;	// �׳��쳣��ʵ��������
		}catch(Exception e){
			System.out.println(e) ;
		}
	}
};