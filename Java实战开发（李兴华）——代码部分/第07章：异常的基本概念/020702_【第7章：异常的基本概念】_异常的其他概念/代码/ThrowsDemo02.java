class Math{
	public int div(int i,int j) throws Exception{	// �������������������쳣���򽻸������ô�����
		int temp = i / j ;	// ���㣬���Ǵ˴��п��ܳ����쳣
		return temp ;
	}
};
public class ThrowsDemo02{
	// ���������е������쳣�����Բ�ʹ��try...catch���д���
	public static void main(String args[]) throws Exception{
		Math m = new Math() ;		// ʵ����Math�����
		System.out.println("����������" + m.div(10,0)) ;
	}
};