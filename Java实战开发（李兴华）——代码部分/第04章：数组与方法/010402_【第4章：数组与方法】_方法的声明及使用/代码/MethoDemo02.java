public class MethoDemo02{
	public static void main(String args[]){
		int one = addOne(10,20) ;		// �������͵ļӷ�����
		float two = addTwo(10.3f,13.3f) ;	// ���ø������ļӷ�����
		System.out.println("addOne�ļ�������" + one) ;
		System.out.println("addTwo�ļ�������" + two) ;
	}
	// ���巽��������������ֵ���Ӳ�������������һ��int������
	public static int addOne(int x,int y){
		int temp = 0 ;			// �����еĲ������Ǿֲ�����
		temp = x + y ;			// ִ�мӷ�����
		return temp ;			// ���ؼ�����
	}
	// ���巽��������������ֵ���Ӳ����������ķ���ֵ��һ��float������
	public static float addTwo(float x,float y){
		float temp = 0 ;		// �����еĲ������Ǿֲ�����
		temp = x + y ;			// ִ�мӷ�����
		return temp ;			// ���ؼ�����
	}
};